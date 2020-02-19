package com.era.edu.generic.boot.domain;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tb_fin_fsyx")
public class TbDaxue implements Serializable {
    private static final long serialVersionUID = 2L;
    @Id
    @Column(name = "dx_yxdm")
    private String dxYxdm;
    @Column(name = "dx_yxmc")
    private String dxYxmc;

    public TbDaxue(String dxYxdm, String dxYxmc) {
        this.dxYxdm = dxYxdm;
        this.dxYxmc = dxYxmc;
    }

    public TbDaxue(String dxYxmc) {
        this.dxYxmc = dxYxmc;
    }

    public TbDaxue() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getDxYxdm() {
        return dxYxdm;
    }

    public String getDxYxmc() {
        return dxYxmc;
    }
}