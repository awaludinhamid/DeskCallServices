/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.resources;

import id.co.fif.ws.deskcall.bean.FsMstKelurahanExtV;
import id.co.fif.ws.deskcall.bean.support.BeanProp;
import id.co.fif.ws.deskcall.service.FsMstKelurahanExtVService;
import java.util.List;
import javax.ws.rs.Path;

/**
 * @created Mar 31, 2013
 * @author awal
 */
@Path("/fsMstKelurahanExtV")
public class FsMstKelurahanExtVResource
        extends BaseResource<FsMstKelurahanExtV,FsMstKelurahanExtVService> {

    @Override
    protected List<FsMstKelurahanExtV> getList() {
        return service.getFsMstKelurahanExtVs(firstResult,maxResults);
    }

    @Override
    protected void saveList(FsMstKelurahanExtV[] bArr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    protected BeanProp getCount() {
      BeanProp bp = new BeanProp();
      bp.setCount(service.count());
      return bp;
    }
}
