package com.era.edu.generic.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "University4ShouCang")
public class University4ShouCang implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 院校代码 */
	@Id
	@Column(name = "dx_yxdm")
	private String dx_yxdm;
	/** 院校名称 */
	@Column(name = "dx_yxmc")
	private String dx_yxmc;
	/** 院校名称后追加文字 */
	@Column(name = "dx_yxmczj")
	private String dx_yxmc_zj;
	/** 省id */
	@Column(name = "dx_pr_code")
	private String dx_pr_id;
	/** 市id */
	@Column(name = "dx_ci_code")
	private String dx_ci_id;
	/** 专业分配方式 */
	@Column(name = "dx_zsfs")
	private Integer dx_zsfs;
	/** 985 */
	@Column(name = "dx_t985")
	private Integer dx_t985;
	/** 211 */
	@Column(name = "dx_t211")
	private Integer dx_t211;
	/** 中央部署 */
	@Column(name = "dx_tzy")
	private Integer dx_tzy;
	/** 民办 */
	@Column(name = "dx_tmb")
	private Integer dx_tmb;
	/** 公办 */
	@Column(name = "dx_tgb")
	private Integer dx_tgb;
	/** 国防公安 */
	@Column(name = "dx_gfga")
	private Integer dx_gfga;
	/** 少数民族预科 */
	@Column(name = "dx_ssmz")
	private Integer dx_ssmz;
	/** 学校link */
	@Column(name = "dx_yxlink")
	private String dx_yxlink;
	/** 招生计划link */
	@Column(name = "dx_jhlink")
	private String dx_jhlink;
	/** 简章link */
	@Column(name = "dx_jzlink")
	private String dx_jzlink;
	/** 院校地址 */
	@Column(name = "dx_yxadd")
	private String dx_yxadd;
	/** 院校电话 */
	@Column(name = "dx_yxtel")
	private String dx_yxtel;
	/** 备注信息 */
	@Column(name = "dx_bzxx")
	private String dx_bzxx;
	/** 院校排名 */
	@Column(name = "dx_yxpm")
	private Integer dx_yxpm;
	/** 院校状态 */
	@Column(name = "dx_status")
	private Integer dx_status;
	/** 省名称 */
	@Column(name = "stpr_name")
	private String stpr_name;
	/** 市名称 */
	@Column(name = "stci_name")
	private String stci_name;

	/** 年份 */
	@Column(name = "ffsx_nf01")
	private String ffsx_nf01;
	/** 状态 */
	@Column(name = "ffsx_flag01")
	private Integer ffsx_flag01;
	/** 专业计划数 */
	@Column(name = "dxf_zsjhs01")
	private Integer dxf_zsjhs01;
	/** 最高分数 */
	@Column(name = "dxf_zgfs01")
	private Float dxf_zgfs01;
	/** 最低分数 */
	@Column(name = "dxf_zdfs01")
	private Float dxf_zdfs01;
	/** 最低位次 */
	@Column(name = "dxf_zdwc01")
	private Integer dxf_zdwc01;

	/** 院校报考代码 */
	@Id
	@Column(name = "ffsx_yxdh")
	private String ffsx_yxdh;
	/** 批次代码 */
	@Id
	@Column(name = "ffsx_pcdm")
	private String ffsx_pcdm;

	/** 类型代码 */
	private String ffsx_lxdm;

	/** 年份 */
	@Column(name = "ffsx_nf02")
	private String ffsx_nf02;
	/** 状态 */
	@Column(name = "ffsx_flag02")
	private Integer ffsx_flag02;
	/** 专业计划数 */
	@Column(name = "dxf_zsjhs02")
	private Integer dxf_zsjhs02;
	/** 最高分数 */
	@Column(name = "dxf_zgfs02")
	private Float dxf_zgfs02;
	/** 最低分数 */
	@Column(name = "dxf_zdfs02")
	private Float dxf_zdfs02;
	/** 最低位次 */
	@Column(name = "dxf_zdwc02")
	private Integer dxf_zdwc02;
	/** 年份 */
	@Column(name = "ffsx_nf03")
	private String ffsx_nf03;
	/** 状态 */
	@Column(name = "ffsx_flag03")
	private Integer ffsx_flag03;
	/** 专业计划数 */
	@Column(name = "dxf_zsjhs03")
	private Integer dxf_zsjhs03;
	/** 最高分数 */
	@Column(name = "dxf_zgfs03")
	private Float dxf_zgfs03;
	/** 最低分数 */
	@Column(name = "dxf_zdfs03")
	private Float dxf_zdfs03;
	/** 最低位次 */
	@Column(name = "dxf_zdwc03")
	private Integer dxf_zdwc03;
	/** 年份 */
	@Column(name = "ffsx_nf04")
	private String ffsx_nf04;
	/** 状态 */
	@Column(name = "ffsx_flag04")
	private Integer ffsx_flag04;
	/** 专业计划数 */
	@Column(name = "dxf_zsjhs04")
	private Integer dxf_zsjhs04;
	/** 最高分数 */
	@Column(name = "dxf_zgfs04")
	private Float dxf_zgfs04;
	/** 最低分数 */
	@Column(name = "dxf_zdwc04")
	private Float dxf_zdwc04;
	/** 最低位次 */
	@Column(name = "dxf_zdfs04")
	private Integer dxf_zdfs04;
	/** 科类代码 */
	@Column(name = "ffsx_kldm")
	private Integer ffsx_kldm;

	// /** 年份 */
	// @Column(name = "ffsx_nf05")
	// private String ffsx_nf05;
	// /** 状态 */
	// @Column(name = "ffsx_flag05")
	// private Integer ffsx_flag05;
	// /** 专业计划数 */
	// @Column(name = "dxf_zsjhs05")
	// private Integer dxf_zsjhs05;
	// /** 最高分数 */
	// @Column(name = "dxf_zgfs05")
	// private Float dxf_zgfs05;
	// /** 最低分数 */
	// @Column(name = "dxf_zdfs05")
	// private Float dxf_zdfs05;
	// /** 最低位次 */
	// @Column(name = "dxf_zdwc05")
	// private Integer dxf_zdwc05;
	/** 收藏状态 */
	@Column(name = "sc_status")
	private Integer sc_status;

	public String getDx_yxdm() {
		return dx_yxdm;
	}

	public void setDx_yxdm(String dx_yxdm) {
		this.dx_yxdm = dx_yxdm;
	}

	public String getDx_yxmc() {
		return dx_yxmc;
	}

	public void setDx_yxmc(String dx_yxmc) {
		this.dx_yxmc = dx_yxmc;
	}

	public String getDx_yxmc_zj() {
		return dx_yxmc_zj;
	}

	public void setDx_yxmc_zj(String dx_yxmc_zj) {
		this.dx_yxmc_zj = dx_yxmc_zj;
	}

	public String getDx_pr_id() {
		return dx_pr_id;
	}

	public void setDx_pr_id(String dx_pr_id) {
		this.dx_pr_id = dx_pr_id;
	}

	public String getDx_ci_id() {
		return dx_ci_id;
	}

	public void setDx_ci_id(String dx_ci_id) {
		this.dx_ci_id = dx_ci_id;
	}

	public Integer getDx_zsfs() {
		return dx_zsfs;
	}

	public void setDx_zsfs(Integer dx_zsfs) {
		this.dx_zsfs = dx_zsfs;
	}

	public Integer getDx_t985() {
		return dx_t985;
	}

	public void setDx_t985(Integer dx_t985) {
		this.dx_t985 = dx_t985;
	}

	public Integer getDx_t211() {
		return dx_t211;
	}

	public void setDx_t211(Integer dx_t211) {
		this.dx_t211 = dx_t211;
	}

	public Integer getDx_tzy() {
		return dx_tzy;
	}

	public void setDx_tzy(Integer dx_tzy) {
		this.dx_tzy = dx_tzy;
	}

	public Integer getDx_tmb() {
		return dx_tmb;
	}

	public void setDx_tmb(Integer dx_tmb) {
		this.dx_tmb = dx_tmb;
	}

	public Integer getDx_tgb() {
		return dx_tgb;
	}

	public void setDx_tgb(Integer dx_tgb) {
		this.dx_tgb = dx_tgb;
	}

	public Integer getDx_gfga() {
		return dx_gfga;
	}

	public void setDx_gfga(Integer dx_gfga) {
		this.dx_gfga = dx_gfga;
	}

	public Integer getDx_ssmz() {
		return dx_ssmz;
	}

	public void setDx_ssmz(Integer dx_ssmz) {
		this.dx_ssmz = dx_ssmz;
	}

	public String getDx_yxlink() {
		return dx_yxlink;
	}

	public void setDx_yxlink(String dx_yxlink) {
		this.dx_yxlink = dx_yxlink;
	}

	public String getDx_jhlink() {
		return dx_jhlink;
	}

	public void setDx_jhlink(String dx_jhlink) {
		this.dx_jhlink = dx_jhlink;
	}

	public String getDx_jzlink() {
		return dx_jzlink;
	}

	public void setDx_jzlink(String dx_jzlink) {
		this.dx_jzlink = dx_jzlink;
	}

	public String getDx_yxadd() {
		return dx_yxadd;
	}

	public void setDx_yxadd(String dx_yxadd) {
		this.dx_yxadd = dx_yxadd;
	}

	public String getDx_yxtel() {
		return dx_yxtel;
	}

	public void setDx_yxtel(String dx_yxtel) {
		this.dx_yxtel = dx_yxtel;
	}

	public String getDx_bzxx() {
		return dx_bzxx;
	}

	public void setDx_bzxx(String dx_bzxx) {
		this.dx_bzxx = dx_bzxx;
	}

	public Integer getDx_yxpm() {
		return dx_yxpm;
	}

	public void setDx_yxpm(Integer dx_yxpm) {
		this.dx_yxpm = dx_yxpm;
	}

	public Integer getDx_status() {
		return dx_status;
	}

	public void setDx_status(Integer dx_status) {
		this.dx_status = dx_status;
	}

	public String getStpr_name() {
		return stpr_name;
	}

	public void setStpr_name(String stpr_name) {
		this.stpr_name = stpr_name;
	}

	public String getStci_name() {
		return stci_name;
	}

	public void setStci_name(String stci_name) {
		this.stci_name = stci_name;
	}

	public Integer getDxf_zsjhs01() {
		return dxf_zsjhs01;
	}

	public void setDxf_zsjhs01(Integer dxf_zsjhs01) {
		this.dxf_zsjhs01 = dxf_zsjhs01;
	}

	public Float getDxf_zgfs01() {
		return dxf_zgfs01;
	}

	public void setDxf_zgfs01(Float dxf_zgfs01) {
		this.dxf_zgfs01 = dxf_zgfs01;
	}

	public Float getDxf_zdfs01() {
		return dxf_zdfs01;
	}

	public void setDxf_zdfs01(Float dxf_zdfs01) {
		this.dxf_zdfs01 = dxf_zdfs01;
	}

	public Integer getDxf_zdwc01() {
		return dxf_zdwc01;
	}

	public void setDxf_zdwc01(Integer dxf_zdwc01) {
		this.dxf_zdwc01 = dxf_zdwc01;
	}

	public Integer getDxf_zsjhs02() {
		return dxf_zsjhs02;
	}

	public void setDxf_zsjhs02(Integer dxf_zsjhs02) {
		this.dxf_zsjhs02 = dxf_zsjhs02;
	}

	public Float getDxf_zgfs02() {
		return dxf_zgfs02;
	}

	public void setDxf_zgfs02(Float dxf_zgfs02) {
		this.dxf_zgfs02 = dxf_zgfs02;
	}

	public Float getDxf_zdfs02() {
		return dxf_zdfs02;
	}

	public void setDxf_zdfs02(Float dxf_zdfs02) {
		this.dxf_zdfs02 = dxf_zdfs02;
	}

	public Integer getDxf_zdwc02() {
		return dxf_zdwc02;
	}

	public void setDxf_zdwc02(Integer dxf_zdwc02) {
		this.dxf_zdwc02 = dxf_zdwc02;
	}

	public Integer getDxf_zsjhs03() {
		return dxf_zsjhs03;
	}

	public void setDxf_zsjhs03(Integer dxf_zsjhs03) {
		this.dxf_zsjhs03 = dxf_zsjhs03;
	}

	public Float getDxf_zgfs03() {
		return dxf_zgfs03;
	}

	public void setDxf_zgfs03(Float dxf_zgfs03) {
		this.dxf_zgfs03 = dxf_zgfs03;
	}

	public Float getDxf_zdfs03() {
		return dxf_zdfs03;
	}

	public void setDxf_zdfs03(Float dxf_zdfs03) {
		this.dxf_zdfs03 = dxf_zdfs03;
	}

	public Integer getDxf_zdwc03() {
		return dxf_zdwc03;
	}

	public void setDxf_zdwc03(Integer dxf_zdwc03) {
		this.dxf_zdwc03 = dxf_zdwc03;
	}

	public Integer getDxf_zsjhs04() {
		return dxf_zsjhs04;
	}

	public void setDxf_zsjhs04(Integer dxf_zsjhs04) {
		this.dxf_zsjhs04 = dxf_zsjhs04;
	}

	public Float getDxf_zgfs04() {
		return dxf_zgfs04;
	}

	public void setDxf_zgfs04(Float dxf_zgfs04) {
		this.dxf_zgfs04 = dxf_zgfs04;
	}

	public Float getDxf_zdwc04() {
		return dxf_zdwc04;
	}

	public void setDxf_zdwc04(Float dxf_zdwc04) {
		this.dxf_zdwc04 = dxf_zdwc04;
	}

	public Integer getDxf_zdfs04() {
		return dxf_zdfs04;
	}

	public void setDxf_zdfs04(Integer dxf_zdfs04) {
		this.dxf_zdfs04 = dxf_zdfs04;
	}

	// public Integer getDxf_zsjhs05() {
	// return dxf_zsjhs05;
	// }
	// public void setDxf_zsjhs05(Integer dxf_zsjhs05) {
	// this.dxf_zsjhs05 = dxf_zsjhs05;
	// }
	// public Float getDxf_zgfs05() {
	// return dxf_zgfs05;
	// }
	// public void setDxf_zgfs05(Float dxf_zgfs05) {
	// this.dxf_zgfs05 = dxf_zgfs05;
	// }
	// public Float getDxf_zdfs05() {
	// return dxf_zdfs05;
	// }
	// public void setDxf_zdfs05(Float dxf_zdfs05) {
	// this.dxf_zdfs05 = dxf_zdfs05;
	// }
	// public Integer getDxf_zdwc05() {
	// return dxf_zdwc05;
	// }
	// public void setDxf_zdwc05(Integer dxf_zdwc05) {
	// this.dxf_zdwc05 = dxf_zdwc05;
	// }
	public Integer getSc_status() {
		return sc_status;
	}

	public void setSc_status(Integer sc_status) {
		this.sc_status = sc_status;
	}

	public String getFfsx_yxdh() {
		return ffsx_yxdh;
	}

	public void setFfsx_yxdh(String ffsx_yxdh) {
		this.ffsx_yxdh = ffsx_yxdh;
	}

	public String getFfsx_pcdm() {
		return ffsx_pcdm;
	}

	public void setFfsx_pcdm(String ffsx_pcdm) {
		this.ffsx_pcdm = ffsx_pcdm;
	}

	public String getFfsx_nf01() {
		return ffsx_nf01;
	}

	public void setFfsx_nf01(String ffsx_nf01) {
		this.ffsx_nf01 = ffsx_nf01;
	}

	public Integer getFfsx_flag01() {
		return ffsx_flag01;
	}

	public void setFfsx_flag01(Integer ffsx_flag01) {
		this.ffsx_flag01 = ffsx_flag01;
	}

	public String getFfsx_nf02() {
		return ffsx_nf02;
	}

	public void setFfsx_nf02(String ffsx_nf02) {
		this.ffsx_nf02 = ffsx_nf02;
	}

	public Integer getFfsx_flag02() {
		return ffsx_flag02;
	}

	public void setFfsx_flag02(Integer ffsx_flag02) {
		this.ffsx_flag02 = ffsx_flag02;
	}

	public String getFfsx_nf03() {
		return ffsx_nf03;
	}

	public void setFfsx_nf03(String ffsx_nf03) {
		this.ffsx_nf03 = ffsx_nf03;
	}

	public Integer getFfsx_flag03() {
		return ffsx_flag03;
	}

	public void setFfsx_flag03(Integer ffsx_flag03) {
		this.ffsx_flag03 = ffsx_flag03;
	}

	public String getFfsx_nf04() {
		return ffsx_nf04;
	}

	public void setFfsx_nf04(String ffsx_nf04) {
		this.ffsx_nf04 = ffsx_nf04;
	}

	public Integer getFfsx_flag04() {
		return ffsx_flag04;
	}

	public void setFfsx_flag04(Integer ffsx_flag04) {
		this.ffsx_flag04 = ffsx_flag04;
	}

	// public String getFfsx_nf05() {
	// return ffsx_nf05;
	// }
	// public void setFfsx_nf05(String ffsx_nf05) {
	// this.ffsx_nf05 = ffsx_nf05;
	// }
	// public Integer getFfsx_flag05() {
	// return ffsx_flag05;
	// }
	// public void setFfsx_flag05(Integer ffsx_flag05) {
	// this.ffsx_flag05 = ffsx_flag05;
	// }
	public String getFfsx_lxdm() {
		return ffsx_lxdm;
	}

	public void setFfsx_lxdm(String ffsx_lxdm) {
		this.ffsx_lxdm = ffsx_lxdm;
	}

	public Integer getFfsx_kldm() {
		return ffsx_kldm;
	}

	public void setFfsx_kldm(Integer ffsx_kldm) {
		this.ffsx_kldm = ffsx_kldm;
	}
}
