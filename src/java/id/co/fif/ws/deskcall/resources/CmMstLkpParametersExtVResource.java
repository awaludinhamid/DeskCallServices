/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.resources;

import id.co.fif.ws.deskcall.bean.CmMstLkpParametersExtV;
import id.co.fif.ws.deskcall.service.CmMstLkpParametersExtVService;
import java.util.List;
import javax.ws.rs.Path;

/**
 * @created Mar 31, 2013
 * @author awal
 */
@Path("/cmMstLkpParametersExtV")
public class CmMstLkpParametersExtVResource
        extends BaseResource<CmMstLkpParametersExtV,CmMstLkpParametersExtVService> {

    @Override
    protected List<CmMstLkpParametersExtV> getList() {
        return service.getCmMstLkpParametersExtVs();
    }

    @Override
    protected void saveList(CmMstLkpParametersExtV[] bArr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
