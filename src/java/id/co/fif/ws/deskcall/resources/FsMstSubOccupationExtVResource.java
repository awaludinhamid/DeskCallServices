/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.resources;

import id.co.fif.ws.deskcall.bean.FsMstSubOccupationExtV;
import id.co.fif.ws.deskcall.service.FsMstSubOccupationExtVService;
import java.util.List;
import javax.ws.rs.Path;

/**
 * @created Mar 31, 2013
 * @author awal
 */
@Path("/fsMstSubOccupationExtV")
public class FsMstSubOccupationExtVResource
        extends BaseResource<FsMstSubOccupationExtV,FsMstSubOccupationExtVService> {

    @Override
    protected List<FsMstSubOccupationExtV> getList() {
        return service.getFsMstSubOccupationExtVs();
    }

    @Override
    protected void saveList(FsMstSubOccupationExtV[] bArr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
