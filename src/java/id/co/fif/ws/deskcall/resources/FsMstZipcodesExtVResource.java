/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.resources;

import id.co.fif.ws.deskcall.bean.FsMstZipcodesExtV;
import id.co.fif.ws.deskcall.bean.support.BeanProp;
import id.co.fif.ws.deskcall.service.FsMstZipcodesExtVService;
import java.util.List;
import javax.ws.rs.Path;

/**
 * @created Apr 27, 2013
 * @author awal
 */
@Path("/fsMstZipcodesExtV")
public class FsMstZipcodesExtVResource
        extends BaseResource<FsMstZipcodesExtV,FsMstZipcodesExtVService> {

    @Override
    protected List<FsMstZipcodesExtV> getList() {
        return service.getFsMstZipcodesExtVs(firstResult,maxResults);
    }

    @Override
    protected void saveList(FsMstZipcodesExtV[] bArr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    protected BeanProp getCount() {
      BeanProp bp = new BeanProp();
      bp.setCount(service.count());
      return bp;
    }
}
