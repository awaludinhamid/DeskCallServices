/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.dao;

import id.co.fif.ws.deskcall.bean.StgCollectionResult;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * @created Apr 1, 2013
 * @author awal
 */
@Repository("stgCollectionResultDao")
public class StgCollectionResultDao extends BaseDao<StgCollectionResult> {
    private static final String STG_FLAG_UPDATE = "N";

    @Override
    public List<StgCollectionResult> getAll(int start, int num) {
        return sessionFactory.getCurrentSession().createQuery(
                " from " + domainClass.getName() +
                " where stgFlagUpdate = :stgFlagUpdate" +
                getOrderColumns())
                .setString("stgFlagUpdate", STG_FLAG_UPDATE)
                .setFirstResult(start)
                .setMaxResults(num)
                .list();
    }

}
