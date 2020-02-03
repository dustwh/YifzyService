package com.era.edu.generic.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="univercity")
public class Univercity {

    @Id
    private String univrctCode;
    @Column
    private String univrctRank;
    @Column
    private String univrctHeat;
    @Column
    private String univrctName;
    @Column
    private String univrctTag;
    @Column
    private String univrctBuildtime;
    @Column
    private String univrctType;
    @Column
    private String univrctLocation;
    @Column
    private String univrctAffiliate;
    @Column
    private String univrctLevel;
    @Column
    private String univrctCategory;
    @Column
    private String univrctDoctor;
    @Column
    private String univrctMaster;
    @Column
    private String univrctEname;
    @Column
    private String univrctHomePage;
    @Column
    private String univrctIntroduce;
    @Column
    private String univrctCollegeSet;
    @Column
    private String univrctFeaturedMajors;
    @Column
    private String univrctFaculty;
    @Column
    private String univrctIntroTable;

    public String getUnivrctCode() {
        return univrctCode;
    }

    public void setUnivrctCode(String univrctCode) {
        this.univrctCode = univrctCode;
    }

    public String getUnivrctRank() {
        return univrctRank;
    }

    public void setUnivrctRank(String univrctRank) {
        this.univrctRank = univrctRank;
    }

    public String getUnivrctHeat() {
        return univrctHeat;
    }

    public void setUnivrctHeat(String univrctHeat) {
        this.univrctHeat = univrctHeat;
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

    public String getUnivrctBuildtime() {
        return univrctBuildtime;
    }

    public void setUnivrctBuildtime(String univrctBuildtime) {
        this.univrctBuildtime = univrctBuildtime;
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

    public String getUnivrctCategory() {
        return univrctCategory;
    }

    public void setUnivrctCategory(String univrctCategory) {
        this.univrctCategory = univrctCategory;
    }

    public String getUnivrctDoctor() {
        return univrctDoctor;
    }

    public void setUnivrctDoctor(String univrctDoctor) {
        this.univrctDoctor = univrctDoctor;
    }

    public String getUnivrctMaster() {
        return univrctMaster;
    }

    public void setUnivrctMaster(String univrctMaster) {
        this.univrctMaster = univrctMaster;
    }

    public String getUnivrctEname() {
        return univrctEname;
    }

    public void setUnivrctEname(String univrctEname) {
        this.univrctEname = univrctEname;
    }

    public String getUnivrctHomePage() {
        return univrctHomePage;
    }

    public void setUnivrctHomePage(String univrctHomePage) {
        this.univrctHomePage = univrctHomePage;
    }

    public String getUnivrctIntroduce() {
        return univrctIntroduce;
    }

    public void setUnivrctIntroduce(String univrctIntroduce) {
        this.univrctIntroduce = univrctIntroduce;
    }

    public String getUnivrctCollegeSet() {
        return univrctCollegeSet;
    }

    public void setUnivrctCollegeSet(String univrctCollegeSet) {
        this.univrctCollegeSet = univrctCollegeSet;
    }

    public String getUnivrctFeaturedMajors() {
        return univrctFeaturedMajors;
    }

    public void setUnivrctFeaturedMajors(String univrctFeaturedMajors) {
        this.univrctFeaturedMajors = univrctFeaturedMajors;
    }

    public String getUnivrctFaculty() {
        return univrctFaculty;
    }

    public void setUnivrctFaculty(String univrctFaculty) {
        this.univrctFaculty = univrctFaculty;
    }

    public String getUnivrctIntroTable() {
        return univrctIntroTable;
    }

    public void setUnivrctIntroTable(String univrctIntroTable) {
        this.univrctIntroTable = univrctIntroTable;
    }

    @Override
    public String toString() {
        return "Univercity{" +
                "univrctCode='" + univrctCode + '\'' +
                ", univrctRank='" + univrctRank + '\'' +
                ", univrctHeat='" + univrctHeat + '\'' +
                ", univrctName='" + univrctName + '\'' +
                ", univrctTag='" + univrctTag + '\'' +
                ", univrctBuildtime='" + univrctBuildtime + '\'' +
                ", univrctType='" + univrctType + '\'' +
                ", univrctLocation='" + univrctLocation + '\'' +
                ", univrctAffiliate='" + univrctAffiliate + '\'' +
                ", univrctLevel='" + univrctLevel + '\'' +
                ", univrctCategory='" + univrctCategory + '\'' +
                ", univrctDoctor='" + univrctDoctor + '\'' +
                ", univrctMaster='" + univrctMaster + '\'' +
                ", univrctEname='" + univrctEname + '\'' +
                ", univrctHomePage='" + univrctHomePage + '\'' +
                ", univrctIntroduce='" + univrctIntroduce + '\'' +
                ", univrctCollegeSet='" + univrctCollegeSet + '\'' +
                ", univrctFeaturedMajors='" + univrctFeaturedMajors + '\'' +
                ", univrctFaculty='" + univrctFaculty + '\'' +
                ", univrctIntroTable='" + univrctIntroTable + '\'' +
                '}';
    }
}
