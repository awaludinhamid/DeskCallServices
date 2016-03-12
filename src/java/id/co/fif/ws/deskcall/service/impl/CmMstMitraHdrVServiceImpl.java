/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.service.impl;

import id.co.fif.ws.deskcall.bean.CmMstMitraHdrV;
import id.co.fif.ws.deskcall.dao.CmMstMitraHdrVDao;
import id.co.fif.ws.deskcall.service.CmMstMitraHdrVService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @created Apr 20, 2013
 * @author awal
 */
@Service("cmMstMitraHdrVService")
@Transactional(readOnly=true)
public class CmMstMitraHdrVServiceImpl implements CmMstMitraHdrVService {

    @Autowired
    private CmMstMitraHdrVDao cmMstMitraHdrVDao;

    @Transactional(readOnly=false)
    public void save(CmMstMitraHdrV cmMstMitraHdrV) {
        cmMstMitraHdrVDao.save(cmMstMitraHdrV);
    }

    @Transactional(readOnly=false)
    public void delete(CmMstMitraHdrV cmMstMitraHdrV) {
        cmMstMitraHdrVDao.delete(cmMstMitraHdrV);
    }

    public CmMstMitraHdrV getCmMstMitraHdrV(Long id) {
        return cmMstMitraHdrVDao.getById(id);
    }

    public CmMstMitraHdrV getCmMstMitraHdrVByCoyUser(String coyId, String username) {
        return cmMstMitraHdrVDao.getByCoyUser(coyId, username);
    }

    public List<CmMstMitraHdrV> getCmMstMitraHdrVs() {
        return cmMstMitraHdrVDao.getAll();
    }

    public List<CmMstMitraHdrV> getCmMstMitraHdrVs(int start, int num) {
        return cmMstMitraHdrVDao.getAll(start, num);
    }

    public Integer count() {
        return cmMstMitraHdrVDao.count();
    }

}
