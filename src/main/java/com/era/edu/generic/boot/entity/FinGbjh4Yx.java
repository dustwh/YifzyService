package com.era.edu.generic.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "FinGbjh4Yx")
public class FinGbjh4Yx implements Serializable {

	private static final long serialVersionUID = 1L;
	/** id */
	@Column(name = "fg_id")
	private String fg_id;
	/** 年份 */
	@Id
	@Column(name = "fg_nf")
	private String fg_nf;
	/** 国标院校编码 */
	@Id
	@Column(name = "fg_yxdm")
	private String fg_yxdm;
	/** 院校名称 */
	@Column(name = "fg_yxmc")
	private String fg_yxmc;
	/** 科类编码 */
	@Id
	@Column(name = "fg_kldm")
	private String fg_kldm;
	/** 科类名称 */
	@Column(name = "fg_klmc")
	private String fg_klmc;
	/** 批次编码 */
	@Id
	@Column(name = "fg_pcdm")
	private String fg_pcdm;
	/** 批次名称 */
	@Column(name = "fg_pcmc")
	private String fg_pcmc;
	/** 省报考编码 */
	@Id
	@Column(name = "fg_yxdh")
	private String fg_yxdh;
	/** 省专业编码 */
	@Id
	@Column(name = "fg_zydh")
	private String fg_zydh;
	/** 资源名称 */
	@Column(name = "fg_zymc")
	private String fg_zymc;

	@Column(name = "fg_gbzydm")
	private String fg_gbzydm;

	/** 串联专业编号 */
	@Column(name = "fg_gbzydm15")
	private String fg_gbzydm15;
	/** 状态 */
	@Column(name = "fg_flag")
	private String fg_flag;
	/** 备注 */
	@Column(name = "fg_remark")
	private String fg_remark;
	/** 录取数 */
	@Column(name = "fg_renshu")
	private String fg_renshu;
	/** 最低分1 */
	@Column(name = "fg_zdfs")
	private String fg_zdfs;

	/** 省报考编码 */
	@Column(name = "current_year_yxdh")
	private String current_year_yxdh;
	/** 批次编码 */
	@Column(name = "current_year_pcdm")
	private String current_year_pcdm;

	public String getFg_id() {
		return fg_id;
	}

	public void setFg_id(String fg_id) {
		this.fg_id = fg_id;
	}

	public String getFg_nf() {
		return fg_nf;
	}

	public void setFg_nf(String fg_nf) {
		this.fg_nf = fg_nf;
	}

	public String getFg_yxdm() {
		return fg_yxdm;
	}

	public void setFg_yxdm(String fg_yxdm) {
		this.fg_yxdm = fg_yxdm;
	}

	public String getFg_yxmc() {
		return fg_yxmc;
	}

	public void setFg_yxmc(String fg_yxmc) {
		this.fg_yxmc = fg_yxmc;
	}

	public String getFg_kldm() {
		return fg_kldm;
	}

	public void setFg_kldm(String fg_kldm) {
		this.fg_kldm = fg_kldm;
	}

	public String getFg_klmc() {
		return fg_klmc;
	}

	public void setFg_klmc(String fg_klmc) {
		this.fg_klmc = fg_klmc;
	}

	public String getFg_pcmc() {
		return fg_pcmc;
	}

	public void setFg_pcmc(String fg_pcmc) {
		this.fg_pcmc = fg_pcmc;
	}

	public String getFg_zymc() {
		return fg_zymc;
	}

	public void setFg_zymc(String fg_zymc) {
		this.fg_zymc = fg_zymc;
	}

	public String getFg_gbzydm15() {
		return fg_gbzydm15;
	}

	public void setFg_gbzydm15(String fg_gbzydm15) {
		this.fg_gbzydm15 = fg_gbzydm15;
	}

	public String getFg_flag() {
		return fg_flag;
	}

	public void setFg_flag(String fg_flag) {
		this.fg_flag = fg_flag;
	}

	public String getFg_remark() {
		return fg_remark;
	}

	public void setFg_remark(String fg_remark) {
		this.fg_remark = fg_remark;
	}

	public String getFg_renshu() {
		return fg_renshu;
	}

	public void setFg_renshu(String fg_renshu) {
		this.fg_renshu = fg_renshu;
	}

	public String getFg_zdfs() {
		return fg_zdfs;
	}

	public void setFg_zdfs(String fg_zdfs) {
		this.fg_zdfs = fg_zdfs;
	}

	public String getFg_pcdm() {
		return fg_pcdm;
	}

	public void setFg_pcdm(String fg_pcdm) {
		this.fg_pcdm = fg_pcdm;
	}

	public String getFg_yxdh() {
		return fg_yxdh;
	}

	public void setFg_yxdh(String fg_yxdh) {
		this.fg_yxdh = fg_yxdh;
	}

	public String getFg_zydh() {
		return fg_zydh;
	}

	public void setFg_zydh(String fg_zydh) {
		this.fg_zydh = fg_zydh;
	}

	public String getCurrent_year_yxdh() {
		return current_year_yxdh;
	}

	public void setCurrent_year_yxdh(String current_year_yxdh) {
		this.current_year_yxdh = current_year_yxdh;
	}

	public String getCurrent_year_pcdm() {
		return current_year_pcdm;
	}

	public void setCurrent_year_pcdm(String current_year_pcdm) {
		this.current_year_pcdm = current_year_pcdm;
	}

	public String getFg_gbzydm() {
		return fg_gbzydm;
	}

	public void setFg_gbzydm(String fg_gbzydm) {
		this.fg_gbzydm = fg_gbzydm;
	}

}
