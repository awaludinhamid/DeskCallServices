/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.service;

import id.co.fif.ws.deskcall.bean.StgCollectionTask;
import java.util.List;

/**
 *
 * @author awal
 */
public interface StgCollectionTaskService {

    void save(StgCollectionTask stgCollectionTask);
    void delete(StgCollectionTask stgCollectionTask);
    void update(StgCollectionTask[] stgCollectionTasks);
    StgCollectionTask getStgCollectionTask(Long id);
    List<StgCollectionTask> getStgCollectionTasks();
    List<StgCollectionTask> getStgCollectionTasks(int start, int num);
    List<StgCollectionTask> getStgCollectionTasks(String mitraId, String officeCode);
    Integer count();
    Integer count(String mitraId, String officeCode);
}
