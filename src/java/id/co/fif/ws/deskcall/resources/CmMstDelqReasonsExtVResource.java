/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.resources;

import id.co.fif.ws.deskcall.bean.CmMstDelqReasonsExtV;
import id.co.fif.ws.deskcall.service.CmMstDelqReasonsExtVService;
import java.util.List;
import javax.ws.rs.Path;

/**
 * @created Mar 31, 2013
 * @author awal
 */
@Path("/cmMstDelqReasonsExtV")
public class CmMstDelqReasonsExtVResource
        extends BaseResource<CmMstDelqReasonsExtV,CmMstDelqReasonsExtVService> {

    @Override
    protected List<CmMstDelqReasonsExtV> getList() {
        return service.getCmMstDelqReasonsExtVs();
    }

    @Override
    protected void saveList(CmMstDelqReasonsExtV[] bArr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
