package com.era.edu.generic.boot.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * 评估-院校ID
 * 
 * @author xueyb
 * 
 */
@Embeddable
public class DaXueFenShuId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "ffsx_yxdm")
	private String dxf_yxdm;
	/** 院校类型代码 */
	@Column(name = "ffsx_lxdm")
	private String ffsx_lxdm;
	/** 省报考院校编号 */
	@Column(name = "ffsx_yxdh")
	private String dxf_yxbh_s;
	/** 批次代码 */
	@Column(name = "ffsx_pcdm")
	private String dxf_pcdm;
	/** 科类代码 */
	@Column(name = "ffsx_kldm")
	private String dxf_kldm;;

	public String getDxf_yxdm() {
		return dxf_yxdm;
	}

	public void setDxf_yxdm(String dxf_yxdm) {
		this.dxf_yxdm = dxf_yxdm;
	}

	public String getFfsx_lxdm() {
		return ffsx_lxdm;
	}

	public void setFfsx_lxdm(String ffsx_lxdm) {
		this.ffsx_lxdm = ffsx_lxdm;
	}

	public String getDxf_yxbh_s() {
		return dxf_yxbh_s;
	}

	public void setDxf_yxbh_s(String dxf_yxbh_s) {
		this.dxf_yxbh_s = dxf_yxbh_s;
	}

	public String getDxf_pcdm() {
		return dxf_pcdm;
	}

	public void setDxf_pcdm(String dxf_pcdm) {
		this.dxf_pcdm = dxf_pcdm;
	}

	public String getDxf_kldm() {
		return dxf_kldm;
	}

	public void setDxf_kldm(String dxf_kldm) {
		this.dxf_kldm = dxf_kldm;
	}
}
