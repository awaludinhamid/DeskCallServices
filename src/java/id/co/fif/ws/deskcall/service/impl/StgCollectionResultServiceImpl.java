/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.service.impl;

import id.co.fif.ws.deskcall.bean.StgCollectionResult;
import id.co.fif.ws.deskcall.dao.StgCollectionResultDao;
import id.co.fif.ws.deskcall.service.StgCollectionResultService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @created Apr 1, 2013
 * @author awal
 */
@Service("stgCollectionResultService")
@Transactional(readOnly=true)
public class StgCollectionResultServiceImpl implements StgCollectionResultService {

    @Autowired
    private StgCollectionResultDao stgCollectionResultDao;

    @Transactional(readOnly=false)
    public void save(StgCollectionResult stgCollectionResult) {
        stgCollectionResultDao.save(stgCollectionResult);
    }

    @Transactional(readOnly=false)
    public void delete(StgCollectionResult stgCollectionResult) {
        stgCollectionResultDao.delete(stgCollectionResult);
    }

    public StgCollectionResult getStgCollectionResult(Long id) {
        return stgCollectionResultDao.getById(id);
    }

    public List<StgCollectionResult> getStgCollectionResults() {
        return stgCollectionResultDao.getAll();
    }

    public List<StgCollectionResult> getStgCollectionResults(int start, int num) {
        return stgCollectionResultDao.getAll(start, num);
    }

    public Integer count() {
        return stgCollectionResultDao.count();
    }
}
