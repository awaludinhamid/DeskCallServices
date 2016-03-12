/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.service;

import id.co.fif.ws.deskcall.bean.FsMstKelurahanExtV;
import java.util.List;

/**
 *
 * @author awal
 */
public interface FsMstKelurahanExtVService {

    void save(FsMstKelurahanExtV fsMstKelurahanExtV);
    void delete(FsMstKelurahanExtV fsMstKelurahanExtV);
    FsMstKelurahanExtV getFsMstKelurahanExtV(Long id);
    List<FsMstKelurahanExtV> getFsMstKelurahanExtVs();
    List<FsMstKelurahanExtV> getFsMstKelurahanExtVs(int start, int num);
    Integer count();
}
