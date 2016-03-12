/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.security;

import com.sun.jersey.api.core.HttpContext;
import com.sun.jersey.oauth.server.OAuthServerRequest;
import com.sun.jersey.oauth.signature.OAuthParameters;
import com.sun.jersey.oauth.signature.OAuthSecrets;
import com.sun.jersey.oauth.signature.OAuthSignature;
import com.sun.jersey.oauth.signature.OAuthSignatureException;
import id.co.fif.ws.deskcall.bean.CmMstMitraHdrV;
import id.co.fif.ws.deskcall.bean.support.KeyBean;
import id.co.fif.ws.deskcall.service.CmMstMitraHdrVService;
import id.co.fif.ws.deskcall.util.SessionUtil;
import java.io.IOException;
import java.util.Calendar;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Configurable;

/**
 * @created Apr 13, 2013
 * @author awal
 */
@Configurable
@Path("/serverAuthentication")
public class ServerAuthentication {

    @Context
    private HttpContext context;
    @Context
    private HttpServletRequest httpRequest;
    private final Map<String,KeyBean> sessionMap = SessionHolder.getSessionMap();

    public String getVerified(HttpContext contextTmp) {
        // wrap incoming request for OAuth signature verification
        OAuthServerRequest request = new OAuthServerRequest(contextTmp.getRequest());
        // get incoming OAuth parameters
        OAuthParameters params = new OAuthParameters();
        params.readRequest(request);
        // get session info
        KeyBean keyBean = sessionMap.get(params.get("sessionId"));
        params.setConsumerKey(keyBean.getConsumerKey());
        params.setToken(keyBean.getTokenKey());
        //... set secrets based on consumer key and/or token in parameters ...
        OAuthSecrets secrets = new OAuthSecrets();
        secrets.setConsumerSecret(keyBean.getConsumerSecret());
        secrets.setTokenSecret(keyBean.getTokenSecret());
        // verify
        try {
            if(OAuthSignature.verify(request, params, secrets)) {
                return "true";
            }
            return "false";
        }
        catch (OAuthSignatureException ose) {
            return "error";
        }
    }

    @Path("/requestToken")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public synchronized KeyBean getToken() {
        // remove expired session
        Calendar currentCalendar = Calendar.getInstance();
        for(String key : sessionMap.keySet()) {
            // get properties
            Properties prop = new Properties();
            try {
                prop.load(SecretKeyGenerator.class.getClassLoader()
                        .getResourceAsStream("authentication.properties"));
            } catch(IOException ioe) {
                System.out.println("Failed to load properties file");
            }
            Integer expiredMilisecond = Integer.parseInt(prop.getProperty("auth.expiredMilisecond"));
            KeyBean keyBeanTemp = sessionMap.get(key);
            if(keyBeanTemp.getTimeIn().compareTo(currentCalendar) <= expiredMilisecond)
                sessionMap.remove(key);
        }
        KeyBean keyBean = new KeyBean();
        OAuthServerRequest request = new OAuthServerRequest(context.getRequest());
        OAuthParameters params = new OAuthParameters();
        params.readRequest(request);
        if(!params.isEmpty()) {
            String deskcallId = params.get("deskcallId");//"01";
            String userName = params.get("userName");//"awal";
            String userPassword = params.get("userPassword");//"4w4lud1n";
            CmMstMitraHdrV cmMstMitraHdrV =
                    (new SessionUtil<CmMstMitraHdrVService>().getAppContext("cmMstMitraHdrVService"))
                .getCmMstMitraHdrVByCoyUser(deskcallId, userName);
            if(userPassword.equals(cmMstMitraHdrV.getUserPassword())) {
                // key
                RandomKeyGenerator randomKey = RandomKeyGenerator.getInstance();
                String consumerKey = randomKey.getRandomKey();
                String tokenKey = randomKey.getRandomKey();
                String sessionId = httpRequest.getSession().getId();
                // secret
                SecretKeyGenerator secretKeyGen = SecretKeyGenerator.getInstance();
                String consumerSecret =
                        secretKeyGen.encrypt(UUID.randomUUID().toString() + deskcallId + userName);
                String tokenSecret =
                        secretKeyGen.encrypt(UUID.randomUUID().toString() + deskcallId + userPassword);
                // put into session holder
                keyBean.setConsumerKey(consumerKey);
                keyBean.setConsumerSecret(consumerSecret);
                keyBean.setTokenKey(tokenKey);
                keyBean.setTokenSecret(tokenSecret);
                keyBean.setSessionId(sessionId);
                keyBean.setStatus("true");
                keyBean.setTimeIn(currentCalendar);
                sessionMap.put(sessionId, keyBean);
            }
        }
        return keyBean;
    }
}
