package com.era.edu.generic.boot.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tb_fin_fsyx")
public class DaXueFenShu implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/** 院校代码 */
	/** id */
	@EmbeddedId
	private DaXueFenShuId id;

	/** 专业计划数 */
	@Column(name = "ffsx_lqrs01")
	private Integer dxf_zsjhs01;
	/** 最高分数 */
	@Column(name = "ffsx_zgfs01")
	private Float dxf_zgfs01;
	/** 最低分数 */
	@Column(name = "ffsx_zdfs01")
	private Float dxf_zdfs01;
	/** 最低位次 */
	@Column(name = "ffsx_zdwc01")
	private Integer dxf_zdwc01;
	/** 专业计划数 */
	@Column(name = "ffsx_lqrs02")
	private Integer dxf_zsjhs02;
	/** 最高分数 */
	@Column(name = "ffsx_zgfs02")
	private Float dxf_zgfs02;
	/** 最低分数 */
	@Column(name = "ffsx_zdfs02")
	private Float dxf_zdfs02;
	/** 最低位次 */
	@Column(name = "ffsx_zdwc02")
	private Integer dxf_zdwc02;
	/** 专业计划数 */
	@Column(name = "ffsx_lqrs03")
	private Integer dxf_zsjhs03;
	/** 最高分数 */
	@Column(name = "ffsx_zgfs03")
	private Float dxf_zgfs03;
	/** 最低分数 */
	@Column(name = "ffsx_zdfs03")
	private Float dxf_zdfs03;
	/** 最低位次 */
	@Column(name = "ffsx_zdwc03")
	private Integer dxf_zdwc03;
	/** 专业计划数 */
	@Column(name = "ffsx_lqrs04")
	private Integer dxf_zsjhs04;
	/** 最高分数 */
	@Column(name = "ffsx_zgfs04")
	private Float dxf_zgfs04;
	/** 最低分数 */
	@Column(name = "ffsx_zdfs04")
	private Float dxf_zdfs04;
	/** 最低位次 */
	@Column(name = "ffsx_zdwc04")
	private Integer dxf_zdwc04;
//	/** 专业计划数 */
//	@Column(name = "ffsx_lqrs05")
//	private Integer dxf_zsjhs05;
//	/** 最高分数 */
//	@Column(name = "ffsx_zgfs05")
//	private Float dxf_zgfs05;
//	/** 最低分数 */
//	@Column(name = "ffsx_zdfs05")
//	private Float dxf_zdfs05;
//	/** 最低位次 */
//	@Column(name = "ffsx_zdwc05")
//	private Integer dxf_zdwc05;
	/** 年份 */
	@Column(name = "ffsx_nf01")
	private String ffsx_nf01;
	/** 状态 */
	@Column(name = "ffsx_flag01")
	private Integer ffsx_flag01;
	/** 年份 */
	@Column(name = "ffsx_nf02")
	private String ffsx_nf02;
	/** 状态 */
	@Column(name = "ffsx_flag02")
	private Integer ffsx_flag02;
	/** 年份 */
	@Column(name = "ffsx_nf03")
	private String ffsx_nf03;
	/** 状态 */
	@Column(name = "ffsx_flag03")
	private Integer ffsx_flag03;
	/** 年份 */
	@Column(name = "ffsx_nf04")
	private String ffsx_nf04;
	/** 状态 */
	@Column(name = "ffsx_flag04")
	private Integer ffsx_flag04;
//	/** 年份 */
//	@Column(name = "ffsx_nf05")
//	private String ffsx_nf05;
//	/** 状态 */
//	@Column(name = "ffsx_flag05")
//	private Integer ffsx_flag05;

//	public String getDxf_yxdm() {
//		return dxf_yxdm;
//	}
//	public void setDxf_yxdm(String dxf_yxdm) {
//		this.dxf_yxdm = dxf_yxdm;
//	}
//	public String getDxf_yxbh_s() {
//		return dxf_yxbh_s;
//	}
//	public void setDxf_yxbh_s(String dxf_yxbh_s) {
//		this.dxf_yxbh_s = dxf_yxbh_s;
//	}
//	public String getDxf_pcdm() {
//		return dxf_pcdm;
//	}
//	public void setDxf_pcdm(String dxf_pcdm) {
//		this.dxf_pcdm = dxf_pcdm;
//	}
//	public String getDxf_kldm() {
//		return dxf_kldm;
//	}
//	public void setDxf_kldm(String dxf_kldm) {
//		this.dxf_kldm = dxf_kldm;
//	}
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
	public Integer getDxf_zdwc04() {
		return dxf_zdwc04;
	}
	public void setDxf_zdwc04(Integer dxf_zdwc04) {
		this.dxf_zdwc04 = dxf_zdwc04;
	}
	public Float getDxf_zdfs04() {
		return dxf_zdfs04;
	}
	public void setDxf_zdfs04(Float dxf_zdfs04) {
		this.dxf_zdfs04 = dxf_zdfs04;
	}
//	public Integer getDxf_zsjhs05() {
//		return dxf_zsjhs05;
//	}
//	public void setDxf_zsjhs05(Integer dxf_zsjhs05) {
//		this.dxf_zsjhs05 = dxf_zsjhs05;
//	}
//	public Float getDxf_zgfs05() {
//		return dxf_zgfs05;
//	}
//	public void setDxf_zgfs05(Float dxf_zgfs05) {
//		this.dxf_zgfs05 = dxf_zgfs05;
//	}
//	public Float getDxf_zdfs05() {
//		return dxf_zdfs05;
//	}
//	public void setDxf_zdfs05(Float dxf_zdfs05) {
//		this.dxf_zdfs05 = dxf_zdfs05;
//	}
//	public Integer getDxf_zdwc05() {
//		return dxf_zdwc05;
//	}
//	public void setDxf_zdwc05(Integer dxf_zdwc05) {
//		this.dxf_zdwc05 = dxf_zdwc05;
//	}

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
//	public String getFfsx_nf05() {
//		return ffsx_nf05;
//	}
//	public void setFfsx_nf05(String ffsx_nf05) {
//		this.ffsx_nf05 = ffsx_nf05;
//	}
//	public Integer getFfsx_flag05() {
//		return ffsx_flag05;
//	}
//	public void setFfsx_flag05(Integer ffsx_flag05) {
//		this.ffsx_flag05 = ffsx_flag05;
//	}

//	public String getFfsx_lxdm() {
//		return ffsx_lxdm;
//	}
//	public void setFfsx_lxdm(String ffsx_lxdm) {
//		this.ffsx_lxdm = ffsx_lxdm;
//	}

	public DaXueFenShuId getId() {
		return id;
	}

	public void setId(DaXueFenShuId id) {
		this.id = id;
	}
}
