/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.resources;

import id.co.fif.ws.deskcall.bean.StgCollectionTask;
import id.co.fif.ws.deskcall.bean.support.BeanProp;
import id.co.fif.ws.deskcall.service.StgCollectionTaskService;
import java.util.List;
import javax.ws.rs.Path;

/**
 * @created Apr 2, 2013
 * @author awal
 */
@Path("/stgCollectionTask")
public class StgCollectionTaskResource
        extends BaseResource<StgCollectionTask, StgCollectionTaskService> {

    @Override
    protected List<StgCollectionTask> getList() {
        return service.getStgCollectionTasks(mitraId,officeCode);
    }

    @Override
    protected void saveList(StgCollectionTask[] bArr) {
      service.update(bArr);
    }
    
    @Override
    protected BeanProp getCount() {
      BeanProp bp = new BeanProp();
      bp.setCount(service.count(mitraId,officeCode));
      return bp;
    }
}
