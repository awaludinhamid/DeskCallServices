/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.resources;

import id.co.fif.ws.deskcall.bean.FsMstKecamatanExtV;
import id.co.fif.ws.deskcall.bean.support.BeanProp;
import id.co.fif.ws.deskcall.service.FsMstKecamatanExtVService;
import java.util.List;
import javax.ws.rs.Path;

/**
 * @created Mar 31, 2013
 * @author awal
 */
@Path("/fsMstKecamatanExtV")
public class FsMstKecamatanExtVResource
        extends BaseResource<FsMstKecamatanExtV,FsMstKecamatanExtVService> {

    @Override
    protected List<FsMstKecamatanExtV> getList() {
        return service.getFsMstKecamatanExtVs(firstResult,maxResults);
    }

    @Override
    protected void saveList(FsMstKecamatanExtV[] bArr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    protected BeanProp getCount() {
      BeanProp bp = new BeanProp();
      bp.setCount(service.count());
      return bp;
    }
}
