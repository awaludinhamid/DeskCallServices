/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.resources;

import id.co.fif.ws.deskcall.bean.CmMstLkpClassificationsExtV;
import id.co.fif.ws.deskcall.service.CmMstLkpClassificationsExtVService;
import java.util.List;
import javax.ws.rs.Path;

/**
 * @created Mar 31, 2013
 * @author awal
 */
@Path("/cmMstLkpClassificationsExtV")
public class CmMstLkpClassificationsExtVResource
        extends BaseResource<CmMstLkpClassificationsExtV,CmMstLkpClassificationsExtVService> {

    @Override
    protected List<CmMstLkpClassificationsExtV> getList() {
        return service.getCmMstLkpClassificationsExtVs();
    }

    @Override
    protected void saveList(CmMstLkpClassificationsExtV[] bArr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
