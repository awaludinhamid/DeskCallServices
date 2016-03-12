/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.dao;

import id.co.fif.ws.deskcall.bean.CmMstMitraHdrV;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * @created Apr 17, 2013
 * @author awal
 */
@Repository("cmMstMitraHdrVDao")
public class CmMstMitraHdrVDao extends BaseDao<CmMstMitraHdrV> {

    public CmMstMitraHdrV getByCoyUser(String deskcallId, String userName) {
        List list = sessionFactory.getCurrentSession()
                .createQuery("from " + domainClass.getName() +
                    " where deskcall_id = :deskcallId and user_name = :userName")
                .setString("deskcallId", deskcallId)
                .setString("userName", userName)
                .list();
        return (CmMstMitraHdrV) list.get(0);
    }
}
