package com.era.edu.generic.boot.domain;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tb_fin_fsyx")
public class TbFinFsyx implements Serializable{
    private static final long serialVersionUID = 2L;
    @Id
    @Column(name = "ffsx_yxdm")
    private String ffsxYxdm;
    @Column(name = "ffsx_zdfs01")
    private String ffsxZdfs01;

    public TbFinFsyx(String ffsxYxdm, String ffsxZdfs01) {
        this.ffsxYxdm = ffsxYxdm;
        this.ffsxZdfs01 = ffsxZdfs01;
    }

    public TbFinFsyx(String ffsxZdfs01) {
        this.ffsxZdfs01 = ffsxZdfs01;
    }

    public TbFinFsyx() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFfsxYxdm() {
        return ffsxYxdm;
    }

//    public void setFfsxYxdm(String ffsxYxdm) {
//        this.ffsxYxdm = ffsxYxdm;
//    }

    public String getFfsxZdfs01() {
        return ffsxZdfs01;
    }

//    public void setFfsxZdfs01(String ffsxZdfs01) {
//        this.ffsxZdfs01 = ffsxZdfs01;
//    }
}