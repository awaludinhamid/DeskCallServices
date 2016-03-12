/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.resources;

import id.co.fif.ws.deskcall.bean.CmMstPotMatrixEntryExtV;
import id.co.fif.ws.deskcall.service.CmMstPotMatrixEntryExtVService;
import java.util.List;
import javax.ws.rs.Path;

/**
 * @created Apr 26, 2013
 * @author awal
 */
@Path("/cmMstPotMatrixEntryExtV")
public class CmMstPotMatrixEntryExtVResource
            extends BaseResource<CmMstPotMatrixEntryExtV,CmMstPotMatrixEntryExtVService> {

    @Override
    protected List<CmMstPotMatrixEntryExtV> getList() {
        return service.getCmMstPotMatrixEntryExtVs();
    }

    @Override
    protected void saveList(CmMstPotMatrixEntryExtV[] bArr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
