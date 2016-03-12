/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.service;

import id.co.fif.ws.deskcall.bean.FsMstZipcodesExtV;
import java.util.List;

/**
 * @created Apr 27, 2013
 * @author awal
 */
public interface FsMstZipcodesExtVService {

    void save(FsMstZipcodesExtV fsMstZipcodesExtV);
    void delete(FsMstZipcodesExtV fsMstZipcodesExtV);
    FsMstZipcodesExtV getFsMstZipcodesExtV(Long id);
    List<FsMstZipcodesExtV> getFsMstZipcodesExtVs();
    List<FsMstZipcodesExtV> getFsMstZipcodesExtVs(int start, int num);
    Integer count();
}
