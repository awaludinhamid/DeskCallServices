/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.resources;

import id.co.fif.ws.deskcall.bean.StgCollectionResult;
import id.co.fif.ws.deskcall.service.StgCollectionResultService;
import java.util.List;
import javax.ws.rs.Path;

/**
 * @created Apr 1, 2013
 * @author awal
 */
@Path("/stgCollectionResult")
public class StgCollectionResultResource
        extends BaseResource<StgCollectionResult,StgCollectionResultService> {

    @Override
    protected List<StgCollectionResult> getList() {
        return service.getStgCollectionResults(firstResult,maxResults);
    }

    @Override
    protected void saveList(StgCollectionResult[] bArr) {
      for (StgCollectionResult scr : bArr) {
        service.save(scr);
      }
    }
}
