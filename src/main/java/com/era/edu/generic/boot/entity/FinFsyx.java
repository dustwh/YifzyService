package com.era.edu.generic.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "tb_fin_fsyx")
public class FinFsyx implements Serializable {

	private static final long serialVersionUID = 1L;
	/** 国标院校代码 */
	@Id
	@Column(name = "ffsx_yxdm")
	private String ffsx_yxdm;
	/** 院校类型代码 */
	@Id
	@Column(name = "ffsx_lxdm")
	private String ffsx_lxdm;
	/** 科类代码 */
	@Id
	@Column(name = "ffsx_kldm")
	private String ffsx_kldm;
	/** 批次代码 */
	@Id
	@Column(name = "ffsx_pcdm")
	private String ffsx_pcdm;
	/** 批次名称 */
	@Column(name = "stpc_pcmc")
	private String stpc_pcmc;
	/** 院校报考代码 */
	@Id
	@Column(name = "ffsx_yxdh")
	private String ffsx_yxdh;
	/** 院校类型名称 ***/
	@Column(name = "ffsx_lxmc")
	private String ffsx_lxmc;
	/** 当年学校计划人数 */
	@Column(name = "ffsx_jhrs")
	private Integer ffsx_jhrs;
	/** 年份 */
	@Column(name = "ffsx_nf01")
	private String ffsx_nf01;
	/** 状态 */
	@Column(name = "ffsx_flag01")
	private Integer ffsx_flag01;
	/** 录取人数 */
	@Column(name = "ffsx_lqrs01")
	private Integer ffsx_lqrs01;
	/** 最高分数 */
	@Column(name = "ffsx_zgfs01")
	private Float ffsx_maxfs01;
	/** 最低分数 */
	@Column(name = "ffsx_zdfs01")
	private Float ffsx_minfs01;
	/** 最低位次 */
	@Column(name = "ffsx_zdwc01")
	private Integer ffsx_minwc01;
	/** 年份 */
	@Column(name = "ffsx_nf02")
	private String ffsx_nf02;
	/** 状态 */
	@Column(name = "ffsx_flag02")
	private Integer ffsx_flag02;
	/** 录取人数 */
	@Column(name = "ffsx_lqrs02")
	private Integer ffsx_lqrs02;
	/** 最高分数 */
	@Column(name = "ffsx_zgfs02")
	private Float ffsx_maxfs02;
	/** 最低分数 */
	@Column(name = "ffsx_zdfs02")
	private Float ffsx_minfs02;
	/** 最低位次 */
	@Column(name = "ffsx_zdwc02")
	private Integer ffsx_minwc02;
	/** 年份 */
	@Column(name = "ffsx_nf03")
	private String ffsx_nf03;
	/** 状态 */
	@Column(name = "ffsx_flag03")
	private Integer ffsx_flag03;
	/** 录取人数 */
	@Column(name = "ffsx_lqrs03")
	private Integer ffsx_lqrs03;
	/** 最高分数 */
	@Column(name = "ffsx_zgfs03")
	private Float ffsx_maxfs03;
	/** 最低分数 */
	@Column(name = "ffsx_zdfs03")
	private Float ffsx_minfs03;
	/** 最低位次 */
	@Column(name = "ffsx_zdwc03")
	private Integer ffsx_minwc03;
	public String getFfsx_yxdm() {
		return ffsx_yxdm;
	}
	public void setFfsx_yxdm(String ffsx_yxdm) {
		this.ffsx_yxdm = ffsx_yxdm;
	}
	public String getFfsx_lxdm() {
		return ffsx_lxdm;
	}
	public void setFfsx_lxdm(String ffsx_lxdm) {
		this.ffsx_lxdm = ffsx_lxdm;
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
	public String getFfsx_lxmc() {
		return ffsx_lxmc;
	}
	public void setFfsx_lxmc(String ffsx_lxmc) {
		this.ffsx_lxmc = ffsx_lxmc;
	}
	public Integer getFfsx_jhrs() {
		return ffsx_jhrs;
	}
	public void setFfsx_jhrs(Integer ffsx_jhrs) {
		this.ffsx_jhrs = ffsx_jhrs;
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
	public Integer getFfsx_lqrs01() {
		return ffsx_lqrs01;
	}
	public void setFfsx_lqrs01(Integer ffsx_lqrs01) {
		this.ffsx_lqrs01 = ffsx_lqrs01;
	}
	public Float getFfsx_maxfs01() {
		return ffsx_maxfs01;
	}
	public void setFfsx_maxfs01(Float ffsx_maxfs01) {
		this.ffsx_maxfs01 = ffsx_maxfs01;
	}
	public Float getFfsx_minfs01() {
		return ffsx_minfs01;
	}
	public void setFfsx_minfs01(Float ffsx_minfs01) {
		this.ffsx_minfs01 = ffsx_minfs01;
	}
	public Integer getFfsx_minwc01() {
		return ffsx_minwc01;
	}
	public void setFfsx_minwc01(Integer ffsx_minwc01) {
		this.ffsx_minwc01 = ffsx_minwc01;
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
	public Integer getFfsx_lqrs02() {
		return ffsx_lqrs02;
	}
	public void setFfsx_lqrs02(Integer ffsx_lqrs02) {
		this.ffsx_lqrs02 = ffsx_lqrs02;
	}
	public Float getFfsx_maxfs02() {
		return ffsx_maxfs02;
	}
	public void setFfsx_maxfs02(Float ffsx_maxfs02) {
		this.ffsx_maxfs02 = ffsx_maxfs02;
	}
	public Float getFfsx_minfs02() {
		return ffsx_minfs02;
	}
	public void setFfsx_minfs02(Float ffsx_minfs02) {
		this.ffsx_minfs02 = ffsx_minfs02;
	}
	public Integer getFfsx_minwc02() {
		return ffsx_minwc02;
	}
	public void setFfsx_minwc02(Integer ffsx_minwc02) {
		this.ffsx_minwc02 = ffsx_minwc02;
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
	public Integer getFfsx_lqrs03() {
		return ffsx_lqrs03;
	}
	public void setFfsx_lqrs03(Integer ffsx_lqrs03) {
		this.ffsx_lqrs03 = ffsx_lqrs03;
	}
	public Float getFfsx_maxfs03() {
		return ffsx_maxfs03;
	}
	public void setFfsx_maxfs03(Float ffsx_maxfs03) {
		this.ffsx_maxfs03 = ffsx_maxfs03;
	}
	public Float getFfsx_minfs03() {
		return ffsx_minfs03;
	}
	public void setFfsx_minfs03(Float ffsx_minfs03) {
		this.ffsx_minfs03 = ffsx_minfs03;
	}
	public Integer getFfsx_minwc03() {
		return ffsx_minwc03;
	}
	public void setFfsx_minwc03(Integer ffsx_minwc03) {
		this.ffsx_minwc03 = ffsx_minwc03;
	}
	public String getStpc_pcmc() {
		return stpc_pcmc;
	}
	public void setStpc_pcmc(String stpc_pcmc) {
		this.stpc_pcmc = stpc_pcmc;
	}

}
