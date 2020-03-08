package com.era.edu.generic.boot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="major_regular")
public class MajorRegular implements Serializable {
    private static final long serialVersionUID = 3L;

    @Id
    @Column(name = "majr_code")
    private String majrCode;


    @Column(name = "majr_name")
    private String majrName;

    @Column(name = "majr_schedule")
    private String majrSchedule;

    @Column(name="majr_degree")
    private String majrDegree;

    @Column(name="majr_introduce")
    private String majrIntroduce;

    @Column(name="majr_aim")
    private String majrAim;

    @Column(name="majr_require")
    private String majrRequire;

    @Column(name="majr_famous")
    private String majrFamous;

    @Column(name="majr_classes")
    private String majrClasses;

    @Column(name="majr_subject_require")
    private String majrSubjectRequire;

    @Column(name="majr_knowledge_power")
    private String majrKnowledgePower;

    @Column(name="majr_direction")
    private String majrDirection;

    @Column(name="majr_occupation")
    private String majrOccupation;

    public MajorRegular() {
    }

    public MajorRegular(String majrCode, String majrName, String majrSchedule, String majrDegree, String majrIntroduce, String majrAim, String majrRequire, String majrFamous, String majrClasses, String majrSubjectRequire, String majrKnowledgePower, String majrDirection, String majrOccupation) {
        this.majrCode = majrCode;
        this.majrName = majrName;
        this.majrSchedule = majrSchedule;
        this.majrDegree = majrDegree;
        this.majrIntroduce = majrIntroduce;
        this.majrAim = majrAim;
        this.majrRequire = majrRequire;
        this.majrFamous = majrFamous;
        this.majrClasses = majrClasses;
        this.majrSubjectRequire = majrSubjectRequire;
        this.majrKnowledgePower = majrKnowledgePower;
        this.majrDirection = majrDirection;
        this.majrOccupation = majrOccupation;
    }

    public MajorRegular(String majrName, String majrSchedule, String majrDegree, String majrIntroduce, String majrAim, String majrRequire, String majrFamous, String majrClasses, String majrSubjectRequire, String majrKnowledgePower, String majrDirection, String majrOccupation) {
        this.majrName = majrName;
        this.majrSchedule = majrSchedule;
        this.majrDegree = majrDegree;
        this.majrIntroduce = majrIntroduce;
        this.majrAim = majrAim;
        this.majrRequire = majrRequire;
        this.majrFamous = majrFamous;
        this.majrClasses = majrClasses;
        this.majrSubjectRequire = majrSubjectRequire;
        this.majrKnowledgePower = majrKnowledgePower;
        this.majrDirection = majrDirection;
        this.majrOccupation = majrOccupation;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getMajrCode() {
        return majrCode;
    }

    public void setMajrCode(String majrCode) {
        this.majrCode = majrCode;
    }

    public String getMajrSchedule() {
        return majrSchedule;
    }

    public String getMajrName() {
        return majrName;
    }

    public void setMajrName(String majrName) {
        this.majrName = majrName;
    }

    public void setMajrSchedule(String majrSchedule) {
        this.majrSchedule = majrSchedule;
    }

    public String getMajrDegree() {
        return majrDegree;
    }

    public void setMajrDegree(String majrDegree) {
        this.majrDegree = majrDegree;
    }

    public String getMajrIntroduce() {
        return majrIntroduce;
    }

    public void setMajrIntroduce(String majrIntroduce) {
        this.majrIntroduce = majrIntroduce;
    }

    public String getMajrAim() {
        return majrAim;
    }

    public void setMajrAim(String majrAim) {
        this.majrAim = majrAim;
    }

    public String getMajrRequire() {
        return majrRequire;
    }

    public void setMajrRequire(String majrRequire) {
        this.majrRequire = majrRequire;
    }

    public String getMajrFamous() {
        return majrFamous;
    }

    public void setMajrFamous(String majrFamous) {
        this.majrFamous = majrFamous;
    }

    public String getMajrClasses() {
        return majrClasses;
    }

    public void setMajrClasses(String majrClasses) {
        this.majrClasses = majrClasses;
    }

    public String getMajrSubjectRequire() {
        return majrSubjectRequire;
    }

    public void setMajrSubjectRequire(String majrSubjectRequire) {
        this.majrSubjectRequire = majrSubjectRequire;
    }

    public String getMajrKnowledgePower() {
        return majrKnowledgePower;
    }

    public void setMajrKnowledgePower(String majrKnowledgePower) {
        this.majrKnowledgePower = majrKnowledgePower;
    }

    public String getMajrDirection() {
        return majrDirection;
    }

    public void setMajrDirection(String majrDirection) {
        this.majrDirection = majrDirection;
    }

    public String getMajrOccupation() {
        return majrOccupation;
    }

    public void setMajrOccupation(String majrOccupation) {
        this.majrOccupation = majrOccupation;
    }
}