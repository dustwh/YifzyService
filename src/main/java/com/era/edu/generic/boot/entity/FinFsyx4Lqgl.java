package com.era.edu.generic.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "tb_fin_fsyx_lqgl")
public class FinFsyx4Lqgl implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 国标院校代码 */
	@Id
	@Column(name = "ffsx_yxdm")
	private String ffsx_yxdm;
	/** 科类代码 */
	@Id
	@Column(name = "ffsx_kldm")
	private String ffsx_kldm;
	/** 批次代码 */
	@Id
	@Column(name = "ffsx_pcdm")
	private String ffsx_pcdm;
	/** 院校报考代码 */
	@Id
	@Column(name = "ffsx_yxdh")
	private String ffsx_yxdh;

	/** 最低位次 */
	@Column(name = "ffsx_zdwc01")
	private Integer ffsx_zdwc01;
	/** 最低位次 */
	@Column(name = "ffsx_zdwc02")
	private Integer ffsx_zdwc02;
	/** 最低位次 */
	@Column(name = "ffsx_zdwc03")
	private Integer ffsx_zdwc03;

	public String getFfsx_yxdm() {
		return ffsx_yxdm;
	}

	public void setFfsx_yxdm(String ffsx_yxdm) {
		this.ffsx_yxdm = ffsx_yxdm;
	}

	public String getFfsx_kldm() {
		return ffsx_kldm;
	}

	public void setFfsx_kldm(String ffsx_kldm) {
		this.ffsx_kldm = ffsx_kldm;
	}

	public String getFfsx_pcdm() {
		return ffsx_pcdm;
	}

	public void setFfsx_pcdm(String ffsx_pcdm) {
		this.ffsx_pcdm = ffsx_pcdm;
	}

	public String getFfsx_yxdh() {
		return ffsx_yxdh;
	}

	public void setFfsx_yxdh(String ffsx_yxdh) {
		this.ffsx_yxdh = ffsx_yxdh;
	}

	public Integer getFfsx_zdwc01() {
		return ffsx_zdwc01;
	}

	public void setFfsx_zdwc01(Integer ffsx_zdwc01) {
		this.ffsx_zdwc01 = ffsx_zdwc01;
	}

	public Integer getFfsx_zdwc02() {
		return ffsx_zdwc02;
	}

	public void setFfsx_zdwc02(Integer ffsx_zdwc02) {
		this.ffsx_zdwc02 = ffsx_zdwc02;
	}

	public Integer getFfsx_zdwc03() {
		return ffsx_zdwc03;
	}

	public void setFfsx_zdwc03(Integer ffsx_zdwc03) {
		this.ffsx_zdwc03 = ffsx_zdwc03;
	}

}
