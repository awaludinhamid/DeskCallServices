/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.dao;

import id.co.fif.ws.deskcall.bean.StgCollectionTask;
import java.util.List;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

/**
 * @created Apr 2, 2013
 * @author awal
 */
@Repository("stgCollectionTaskDao")
public class StgCollectionTaskDao extends BaseDao<StgCollectionTask> {

    private static final String STG_TYPE = "LKD";
    private static final String STG_SEND_FLAG = "N";
    
    public List<StgCollectionTask> getAll(String mitraId, String officeCode) {
        return getQuery("",mitraId,officeCode)
                .list();
    }
    
    public Integer count(String mitraId, String officeCode) {
        List list = getQuery("select count(*)",mitraId,officeCode)
                .list();
        Long longVal = (Long) list.get(0);
        return longVal.intValue();
    }

    private Query getQuery(String firstState, String mitraId, String officeCode) {
        Query query = sessionFactory.getCurrentSession().createQuery(
                        firstState +
                        " from " + domainClass.getName() + " x" +
                        " where stgType = :stgType" +
                        " and stgSendFlag = :stgSendFlag" +
                        " and stgCompanyId = :stgCompanyId" +
                        " and stgKodeCabangFif = :stgKodeCabangFif" +
                        // strict to oracle (?)
                        " and trunc(stgCreatedDate) = trunc(sysdate)")
                        .setString("stgType", STG_TYPE)
                        .setString("stgSendFlag", STG_SEND_FLAG)
                        .setString("stgCompanyId", mitraId)
                        .setString("stgKodeCabangFif", officeCode);
        return query;
    }
}
