/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.resources;

import id.co.fif.ws.deskcall.bean.FsMstCitiesExtV;
import id.co.fif.ws.deskcall.service.FsMstCitiesExtVService;
import java.util.List;
import javax.ws.rs.Path;

/**
 * @created Mar 31, 2013
 * @author awal
 */
@Path("/fsMstCitiesExtV")
public class FsMstCitiesExtVResource
        extends BaseResource<FsMstCitiesExtV,FsMstCitiesExtVService> {

    @Override
    protected List<FsMstCitiesExtV> getList() {
        return service.getFsMstCitiesExtVs();
    }

    @Override
    protected void saveList(FsMstCitiesExtV[] bArr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
