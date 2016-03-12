/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.deskcall.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @created Apr 17, 2013
 * @author awal
 */
@XmlRootElement
@Entity
@Table(name="CM_MST_MITRA_HDR_V")
public class CmMstMitraHdrV implements Serializable {

    @Id
    @Column(name="USER_NAME")
    private String userName;

    @Column(name="USER_PASSWORD")
    private String userPassword;

    @Column(name="DESKCALL_ID")
    private String deskcallId;

    @Column(name="DESKCALL_NAME")
    private String deskcallName;

    @Column(name="URL")
    private String url;

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the userPassword
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * @param userPassword the userPassword to set
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * @return the deskcallId
     */
    public String getDeskcallId() {
        return deskcallId;
    }

    /**
     * @param deskcallId the deskcallId to set
     */
    public void setDeskcallId(String deskcallId) {
        this.deskcallId = deskcallId;
    }

    /**
     * @return the deskcallName
     */
    public String getDeskcallName() {
        return deskcallName;
    }

    /**
     * @param deskcallName the deskcallName to set
     */
    public void setDeskcallName(String deskcallName) {
        this.deskcallName = deskcallName;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
