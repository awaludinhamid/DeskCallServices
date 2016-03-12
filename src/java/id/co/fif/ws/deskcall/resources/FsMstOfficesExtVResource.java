/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.resources;

import id.co.fif.ws.deskcall.bean.FsMstOfficesExtV;
import id.co.fif.ws.deskcall.service.FsMstOfficesExtVService;
import java.util.List;
import javax.ws.rs.Path;
//import javax.ws.rs.core.Request;
//import org.apache.catalina.connector.Request;

/**
 * @created Apr 1, 2013
 * @author awal
 */
@Path("/fsMstOfficesExtV")
public class FsMstOfficesExtVResource
        extends BaseResource<FsMstOfficesExtV,FsMstOfficesExtVService> {

    @Override
    protected List<FsMstOfficesExtV> getList() {
        return service.getFsMstOfficesExtVs();
    }

    @Override
    protected void saveList(FsMstOfficesExtV[] bArr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
