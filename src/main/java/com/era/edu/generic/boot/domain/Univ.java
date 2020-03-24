package com.era.edu.generic.boot.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="univercity")
public class Univ {
    private static final long serialVersionUID = 3L;
    @Id
//    @Column(name = "univrct_code")
    private String univrctCode;

    //    @Column(name = "dx_yxdm")
    private String dxYxdm;
    //    @Column(name = "univrct_name")
    private String univrctName;
    //    @Column(name = "univrct_tag")
    private String univrctTag;
    //    @Column(name = "univrct_type")
    private String univrctType;
    //    @Column(name = "univrct_location")
    private String univrctLocation;
    //    @Column(name = "univrct_affiliate")
    private String univrctAffiliate;
    //    @Column(name = "univrct_level")
    private String univrctLevel;
    //    @Column(name = "univrct_home_page")
    private String univrctHomePage;


    public Univ() {
    }

    public Univ(String univrctCode, String dxYxdm, String univrctName, String univrctTag, String univrctType, String univrctLocation, String univrctAffiliate, String univrctLevel, String univrctHomePage) {
        this.univrctCode = univrctCode;
        this.dxYxdm = dxYxdm;
        this.univrctName = univrctName;
        this.univrctTag = univrctTag;
        this.univrctType = univrctType;
        this.univrctLocation = univrctLocation;
        this.univrctAffiliate = univrctAffiliate;
        this.univrctLevel = univrctLevel;
        this.univrctHomePage = univrctHomePage;
    }

    public Univ(String dxYxdm, String univrctName, String univrctTag, String univrctType, String univrctLocation, String univrctAffiliate, String univrctLevel, String univrctHomePage) {
        this.dxYxdm = dxYxdm;
        this.univrctName = univrctName;
        this.univrctTag = univrctTag;
        this.univrctType = univrctType;
        this.univrctLocation = univrctLocation;
        this.univrctAffiliate = univrctAffiliate;
        this.univrctLevel = univrctLevel;
        this.univrctHomePage = univrctHomePage;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUnivrct_code() {
        return univrctCode;
    }

    public void setUnivrct_code(String univrctCode) {
        this.univrctCode = univrctCode;
    }

    public String getDxYxdm() {
        return dxYxdm;
    }

    public void setDxYxdm(String dxYxdm) {
        this.dxYxdm = dxYxdm;
    }

    public String getUnivrctName() {
        return univrctName;
    }

    public void setUnivrctName(String univrctName) {
        this.univrctName = univrctName;
    }

    public String getUnivrctTag() {
        return univrctTag;
    }

    public void setUnivrctTag(String univrctTag) {
        this.univrctTag = univrctTag;
    }

    public String getUnivrctType() {
        return univrctType;
    }

    public void setUnivrctType(String univrctType) {
        this.univrctType = univrctType;
    }

    public String getUnivrctLocation() {
        return univrctLocation;
    }

    public void setUnivrctLocation(String univrctLocation) {
        this.univrctLocation = univrctLocation;
    }

    public String getUnivrctAffiliate() {
        return univrctAffiliate;
    }

    public void setUnivrctAffiliate(String univrctAffiliate) {
        this.univrctAffiliate = univrctAffiliate;
    }

    public String getUnivrctLevel() {
        return univrctLevel;
    }

    public void setUnivrctLevel(String univrctLevel) {
        this.univrctLevel = univrctLevel;
    }

    public String getUnivrctHomePage() {
        return univrctHomePage;
    }

    public void setUnivrctHomePage(String univrctHomePage) {
        this.univrctHomePage = univrctHomePage;
    }
}