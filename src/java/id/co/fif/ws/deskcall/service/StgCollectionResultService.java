/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.service;

import id.co.fif.ws.deskcall.bean.StgCollectionResult;
import java.util.List;

/**
 *
 * @author awal
 */
public interface StgCollectionResultService {

    void save(StgCollectionResult stgCollectionResult);
    void delete(StgCollectionResult stgCollectionResult);
    StgCollectionResult getStgCollectionResult(Long id);
    List<StgCollectionResult> getStgCollectionResults();
    List<StgCollectionResult> getStgCollectionResults(int start, int num);
    Integer count();
}
