/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.resources;

import id.co.fif.ws.deskcall.bean.ArMstCollZipExtV;
import id.co.fif.ws.deskcall.bean.support.BeanProp;
import id.co.fif.ws.deskcall.service.ArMstCollZipExtVService;
import java.util.List;
import javax.ws.rs.Path;

/**
 * @created Apr 27, 2013
 * @author awal
 */
@Path("/arMstCollZipExtV")
public class ArMstCollZipExtVResource
        extends BaseResource<ArMstCollZipExtV,ArMstCollZipExtVService> {

    @Override
    protected List<ArMstCollZipExtV> getList() {
        return service.getArMstCollZipExtVs(firstResult,maxResults);
    }

    @Override
    protected void saveList(ArMstCollZipExtV[] bArr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    protected BeanProp getCount() {
      BeanProp bp = new BeanProp();
      bp.setCount(service.count());
      return bp;
    }
}
