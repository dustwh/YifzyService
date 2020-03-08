package com.era.edu.generic.boot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="major_simplify")
public class MajorSimplify implements Serializable {
    private static final long serialVersionUID = 3L;

    @Id
    @Column(name = "ms_id")
    private String msId;
    @Column(name = "ms_name")
    private String msName;
    @Column(name = "father_id")
    private String fatherId;

    public MajorSimplify() {
    }

    public MajorSimplify(String msName, String fatherId) {
        this.msName = msName;
        this.fatherId = fatherId;
    }
    public MajorSimplify(String msId, String msName, String fatherId) {
        this.msId = msId;
        this.msName = msName;
        this.fatherId = fatherId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getMsId() {
        return msId;
    }

    public String getMsName() {
        return msName;
    }

    public String getFatherId() {
        return fatherId;
    }

    public void setMsId(String msId) {
        this.msId = msId;
    }

    public void setMsName(String msName) {
        this.msName = msName;
    }

    public void setFatherId(String fatherId) {
        this.fatherId = fatherId;
    }
}