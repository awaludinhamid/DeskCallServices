/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.service;

import id.co.fif.ws.deskcall.bean.FsMstKecamatanExtV;
import java.util.List;

/**
 *
 * @author awal
 */
public interface FsMstKecamatanExtVService {

    void save(FsMstKecamatanExtV fsMstKecamatanExtV);
    void delete(FsMstKecamatanExtV fsMstKecamatanExtV);
    FsMstKecamatanExtV getFsMstKecamatanExtV(Long id);
    List<FsMstKecamatanExtV> getFsMstKecamatanExtVs();
    List<FsMstKecamatanExtV> getFsMstKecamatanExtVs(int start, int num);
    Integer count();
}
