/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.service;

import id.co.fif.ws.deskcall.bean.ArMstCollZipExtV;
import java.util.List;

/**
 *
 * @author awal
 */
public interface ArMstCollZipExtVService {

    void save(ArMstCollZipExtV arMstCollZipExtV);
    void delete(ArMstCollZipExtV arMstCollZipExtV);
    ArMstCollZipExtV getArMstCollZipExtV(Long id);
    List<ArMstCollZipExtV> getArMstCollZipExtVs();
    List<ArMstCollZipExtV> getArMstCollZipExtVs(int start, int num);
    Integer count();
}
