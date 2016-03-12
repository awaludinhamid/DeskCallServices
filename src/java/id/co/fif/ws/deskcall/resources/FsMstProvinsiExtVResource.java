/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.resources;

import id.co.fif.ws.deskcall.bean.FsMstProvinsiExtV;
import id.co.fif.ws.deskcall.service.FsMstProvinsiExtVService;
import java.util.List;
import javax.ws.rs.Path;

/**
 * @created Mar 31, 2013
 * @author awal
 */
@Path("/fsMstProvinsiExtV")
public class FsMstProvinsiExtVResource
        extends BaseResource<FsMstProvinsiExtV,FsMstProvinsiExtVService> {

    @Override
    protected List<FsMstProvinsiExtV> getList() {
        return service.getFsMstProvinsiExtVs();
    }

    @Override
    protected void saveList(FsMstProvinsiExtV[] bArr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
