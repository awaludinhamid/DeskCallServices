/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @created Mar 23, 2013
 * @author awal
 */
public class ParamUtil {
    public static Map<String,String> parse(String paramString) {
        Map<String,String> params = new HashMap<String,String>();
        String[] paramPairs = paramString.split("&");
        for(String param : paramPairs) {
            String[] key_value = param.split("=");
            params.put(key_value[0], key_value[1]);
        }
        return params;
    }
}
