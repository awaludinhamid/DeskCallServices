/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.resources;

import id.co.fif.ws.deskcall.bean.FsMstOccupationsExtV;
import id.co.fif.ws.deskcall.service.FsMstOccupationsExtVService;
import java.util.List;
import javax.ws.rs.Path;

/**
 * @created Mar 31, 2013
 * @author awal
 */
@Path("/fsMstOccupationsExtV")
public class FsMstOccupationsExtVResource
        extends BaseResource<FsMstOccupationsExtV,FsMstOccupationsExtVService> {

    @Override
    protected List<FsMstOccupationsExtV> getList() {
        return service.getFsMstOccupationsExtVs();
    }

    @Override
    protected void saveList(FsMstOccupationsExtV[] bArr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
