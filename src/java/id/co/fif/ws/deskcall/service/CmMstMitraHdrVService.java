/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.service;

import id.co.fif.ws.deskcall.bean.CmMstMitraHdrV;
import java.util.List;

/**
 *
 * @author awal
 */
public interface CmMstMitraHdrVService {

    void save(CmMstMitraHdrV cmMstMitraHdrV);
    void delete(CmMstMitraHdrV cmMstMitraHdrV);
    CmMstMitraHdrV getCmMstMitraHdrV(Long id);
    CmMstMitraHdrV getCmMstMitraHdrVByCoyUser(String coyId, String username);
    List<CmMstMitraHdrV> getCmMstMitraHdrVs();
    List<CmMstMitraHdrV> getCmMstMitraHdrVs(int start, int num);
    Integer count();
}
