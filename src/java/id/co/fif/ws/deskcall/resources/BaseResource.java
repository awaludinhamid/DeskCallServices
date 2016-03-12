/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.resources;

import com.sun.jersey.api.core.HttpContext;
import id.co.fif.ws.deskcall.bean.support.BeanProp;
import id.co.fif.ws.deskcall.security.ServerAuthentication;
import id.co.fif.ws.deskcall.util.SessionUtil;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;

/**
 * @param <B>
 * @param <T>
 * @created May 9, 2013
 * @author awal
 */
public abstract class BaseResource<B,T> {

    @Context
    private HttpContext context;
    @Context
    UriInfo uriInfo;
    
    private final ServerAuthentication serverAuth = new ServerAuthentication();
    protected T service;
    
    protected String mitraId = "";
    protected String officeCode = "";
    protected Integer firstResult = 0;
    protected Integer maxResults = 0;

    public BaseResource() {
        Class clazzService = (Class) ((ParameterizedType)
                getClass().getGenericSuperclass())
                .getActualTypeArguments()[1];
        String name = clazzService.getSimpleName();
        this.service = new SessionUtil<T>().getAppContext(
                name.substring(0,1).toLowerCase() + name.substring(1));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<B> doGet(
            @DefaultValue("") @QueryParam("mitraId") String mitraId,
            @DefaultValue("") @QueryParam("officeCode") String officeCode,
            @DefaultValue("0") @QueryParam("firstResult") int firstResult,
            @DefaultValue("0") @QueryParam("maxResults") int maxResults) {
        if(serverAuth.getVerified(context).equals("true")) {
            this.mitraId = mitraId;
            this.officeCode = officeCode;
            this.firstResult = firstResult;
            this.maxResults = maxResults;
            return getList();
        } else {
            throw new WebApplicationException(401);
        }
    }

    @GET
    @Path("/count")
    @Produces(MediaType.APPLICATION_JSON)
    public BeanProp doGetCount(
            @DefaultValue("") @QueryParam("mitraId") String mitraId,
            @DefaultValue("") @QueryParam("officeCode") String officeCode) {
        if(serverAuth.getVerified(context).equals("true")) {
            this.mitraId = mitraId;
            this.officeCode = officeCode;
            return getCount();
        } else {
            throw new WebApplicationException(401);
        }
    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response doPost(B[] bArr) {
        if(serverAuth.getVerified(context).equals("true")) {
            try {
                saveList(bArr);
            } catch(ConstraintViolationException cve) {
                System.out.println("Key duplicate by session, try to re-execution");
            } catch(DataIntegrityViolationException dive) {
                System.out.println("Key duplicate by session, try to re-execution");
            }
            return Response.created(uriInfo.getAbsolutePath()).build();
        } else {
            throw new WebApplicationException(401);
        }
    }
    
    protected abstract List<B> getList();
    protected abstract void saveList(B[] bArr);
    
    protected BeanProp getCount() {
      BeanProp bp = new BeanProp();
      bp.setCount(0);
      return bp;
    }
}

