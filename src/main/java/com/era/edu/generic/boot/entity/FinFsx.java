package com.era.edu.generic.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "tb_fin_fsx")
public class FinFsx implements Serializable {

	private static final long serialVersionUID = 1L;
	/** 年份 */
	@Id
	@Column(name = "fsx_nf")
	private String fsx_nf;
	/** 科类代码 */
	@Id
	@Column(name = "fsx_kldm")
	private String fsx_kldm;
	/** 批次代码 */
	@Id
	@Column(name = "fsx_pcdm")
	private String fsx_pcdm;
	/** 分数 */
	@Column(name = "fsx_fs")
	private Float fsx_fs;
	public String getFsx_nf() {
		return fsx_nf;
	}
	public void setFsx_nf(String fsx_nf) {
		this.fsx_nf = fsx_nf;
	}
	public String getFsx_kldm() {
		return fsx_kldm;
	}
	public void setFsx_kldm(String fsx_kldm) {
		this.fsx_kldm = fsx_kldm;
	}
	public String getFsx_pcdm() {
		return fsx_pcdm;
	}
	public void setFsx_pcdm(String fsx_pcdm) {
		this.fsx_pcdm = fsx_pcdm;
	}
	public Float getFsx_fs() {
		return fsx_fs;
	}
	public void setFsx_fs(Float fsx_fs) {
		this.fsx_fs = fsx_fs;
	}

}
