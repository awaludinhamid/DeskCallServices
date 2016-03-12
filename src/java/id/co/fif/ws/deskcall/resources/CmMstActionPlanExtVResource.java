/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.resources;

import id.co.fif.ws.deskcall.bean.CmMstActionPlanExtV;
import id.co.fif.ws.deskcall.service.CmMstActionPlanExtVService;
import java.util.List;
import javax.ws.rs.Path;

/**
 * @created Apr 27, 2013
 * @author awal
 */
@Path("/cmMstActionPlanExtV")
public class CmMstActionPlanExtVResource
        extends BaseResource<CmMstActionPlanExtV,CmMstActionPlanExtVService> {

    @Override
    protected List<CmMstActionPlanExtV> getList() {
        return service.getCmMstActionPlanExtVs();
    }

    @Override
    protected void saveList(CmMstActionPlanExtV[] bArr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
