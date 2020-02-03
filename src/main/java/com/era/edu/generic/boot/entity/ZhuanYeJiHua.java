package com.era.edu.generic.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "ZhuanYeJiHua")
public class ZhuanYeJiHua implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 年份 */
	@Column(name = "jh_nf")
	private String jh_nf;
//	/** 专业唯一ID */
//	@Id
//	@Column(name = "jh_zyid")
//	private Integer jh_zyid;
	/** 院校代码 */
	@Id
	@Column(name = "jh_yxdm")
	private String jh_yxdm;
	/** 科类代码 */
	@Id
	@Column(name = "jh_kldm")
	private String jh_kldm;
	/** 学校专业编号 */
	@Column(name = "jh_zydh")
	private String jh_zydh;
	/** 学校专业名称 */
	@Column(name = "jh_zydhmc")
	private String jh_zydhmc;
	/** 学校专业名称描述 */
	@Column(name = "jh_zydhmc_zj")
	private String jh_zydhmc_zj;
	/** 国家专业代码 */
	@Id
	@Column(name = "jh_zydm")
	private String jh_zydm;
	/** 国家专业名称 **/
	@Column(name = "jh_zymc")
	private String jh_zymc;
	/** 批次信息 */
	@Column(name = "jh_pcdm")
	private String jh_pcdm;
	/** 省报考院校编号 */
	@Column(name = "jh_yxbh_s")
	private String jh_yxbh_s;
	/** 外语语种 */
	@Column(name = "jh_wyyzdm")
	private String jh_wyyzdm;
	/** 学制 */
	@Column(name = "jh_xzdm")
	private Integer jh_xzdm;
	/** 学费 */
	@Column(name = "jh_sfbz")
	private Integer jh_sfbz;
	/** 计划人数 */
	@Column(name = "jh_zsjhs")
	private Integer jh_zsjhs;
	/** 志愿备注 */
	@Column(name = "jh_zybz_s")
	private String jh_zybz_s;
//	/** 学校总计划人数 */
//	@Column(name = "jh_xszsjhs")
//	private Integer jh_xszsjhs;
	/** 院校备注 */
	@Column(name = "jh_yxbz")
	private String jh_yxbz;
	/** 计划状态 */
	@Column(name = "jh_status")
	private Integer jh_status;
	/** 外语名称 */
	@Column(name = "stwy_wymc")
	private String stwy_wymc;
	/** 性别限制 */
	@Column(name = "jhx_xb")
	private Integer jhx_xb;
	/** 性别限制备注 */
	@Column(name = "jhx_xbbz")
	private String jhx_xbbz;
	/** 身高限制1 */
	@Column(name = "jhx_sg1")
	private Integer jhx_sg1;
	/** 身高限制1备注 */
	@Column(name = "jhx_sg1bz")
	private String jhx_sg1bz;
	/** 身高限制2 */
	@Column(name = "jhx_sg2")
	private Integer jhx_sg2;
	/** 身高限制1备注 */
	@Column(name = "jhx_sg2bz")
	private String jhx_sg2bz;
//	/** 连读 */
//	@Column(name = "jhx_ld")
//	private Integer jhx_ld;
	/** 中外合资办学 */
	@Column(name = "jhx_hzbx")
	private Integer jhx_hzbx;
//	/** 高收费 */
//	@Column(name = "jhx_gsf")
//	private Integer jhx_gsf;
	/** 预科班 */
	@Column(name = "jhx_ykb")
	private Integer jhx_ykb;
	/** 民族限制 */
	@Column(name = "jhx_mz")
	private String jhx_mz;
	/** 色盲限制 */
	@Column(name = "jhx_smxz")
	private String jhx_smxz;
	/** 视力限制 */
	@Column(name = "jhx_slxz")
	private String jhx_slxz;
//	/** 状态 */
//	@Column(name = "jhx_status")
//	private Integer jhx_status;
	/** 专业计划数 */
	@Column(name = "jhf_zsjhs01")
	private Integer jhf_zsjhs01;
	/** 最高分数 */
	@Column(name = "jhf_zgfs01")
	private Float jhf_zgfs01;
	/** 最低分数 */
	@Column(name = "jhf_zdfs01")
	private Float jhf_zdfs01;
	/** 最低位次 */
	@Column(name = "jhf_zdwc01")
	private Integer jhf_zdwc01;
	/** 专业计划数 */
	@Column(name = "jhf_zsjhs02")
	private Integer jhf_zsjhs02;
	/** 最高分数 */
	@Column(name = "jhf_zgfs02")
	private Float jhf_zgfs02;
	/** 最低分数 */
	@Column(name = "jhf_zdfs02")
	private Float jhf_zdfs02;
	/** 最低位次 */
	@Column(name = "jhf_zdwc02")
	private Integer jhf_zdwc02;
	/** 专业计划数 */
	@Column(name = "jhf_zsjhs03")
	private Integer jhf_zsjhs03;
	/** 最高分数 */
	@Column(name = "jhf_zgfs03")
	private Float jhf_zgfs03;
	/** 最低分数 */
	@Column(name = "jhf_zdfs03")
	private Float jhf_zdfs03;
	/** 最低位次 */
	@Column(name = "jhf_zdwc03")
	private Integer jhf_zdwc03;
//	/** 专业计划数 */
//	@Column(name = "jhf_zsjhs04")
//	private Integer jhf_zsjhs04;
//	/** 最高分数 */
//	@Column(name = "jhf_zgfs04")
//	private Float jhf_zgfs04;
//	/** 最低分数 */
//	@Column(name = "jhf_zdwc04")
//	private Float jhf_zdwc04;
//	/** 最低位次 */
//	@Column(name = "jhf_zdfs04")
//	private Integer jhf_zdfs04;
//	/** 专业计划数 */
//	@Column(name = "jhf_zsjhs05")
//	private Integer jhf_zsjhs05;
//	/** 最高分数 */
//	@Column(name = "jhf_zgfs05")
//	private Float jhf_zgfs05;
//	/** 最低分数 */
//	@Column(name = "jhf_zdfs05")
//	private Float jhf_zdfs05;
//	/** 最低位次 */
//	@Column(name = "jhf_zdwc05")
//	private Integer jhf_zdwc05;
//	/** 状态 */
//	@Column(name = "jhf_status")
//	private Integer jhf_status;
	/** 批次名称 */
	@Column(name = "stpc_pcmc")
	private String stpc_pcmc;
	/** 收藏状态 */
	@Column(name = "sc_status")
	private Integer sc_status;
	@Column(name = "tianbao")
	private Integer tianbao;
	/** 年份 */
	@Column(name = "ffs_nf01")
	private String ffs_nf01;
	/** 状态 */
	@Column(name = "ffs_flag01")
	private Integer ffs_flag01;
	/** 年份 */
	@Column(name = "ffs_nf02")
	private String ffs_nf02;
	/** 状态 */
	@Column(name = "ffs_flag02")
	private Integer ffs_flag02;
	/** 年份 */
	@Column(name = "ffs_nf03")
	private String ffs_nf03;
	/** 状态 */
	@Column(name = "ffs_flag03")
	private Integer ffs_flag03;
	
	
	public String getJh_nf() {
		return jh_nf;
	}
	public void setJh_nf(String jh_nf) {
		this.jh_nf = jh_nf;
	}
//	public Integer getJh_zyid() {
//		return jh_zyid;
//	}
//	public void setJh_zyid(Integer jh_zyid) {
//		this.jh_zyid = jh_zyid;
//	}
	public String getJh_yxdm() {
		return jh_yxdm;
	}
	public void setJh_yxdm(String jh_yxdm) {
		this.jh_yxdm = jh_yxdm;
	}
	public String getJh_kldm() {
		return jh_kldm;
	}
	public void setJh_kldm(String jh_kldm) {
		this.jh_kldm = jh_kldm;
	}
	public String getJh_zydh() {
		return jh_zydh;
	}
	public void setJh_zydh(String jh_zydh) {
		this.jh_zydh = jh_zydh;
	}
	public String getJh_zydhmc() {
		return jh_zydhmc;
	}
	public void setJh_zydhmc(String jh_zydhmc) {
		this.jh_zydhmc = jh_zydhmc;
	}
	public String getJh_zydhmc_zj() {
		return jh_zydhmc_zj;
	}
	public void setJh_zydhmc_zj(String jh_zydhmc_zj) {
		this.jh_zydhmc_zj = jh_zydhmc_zj;
	}
	public String getJh_zydm() {
		return jh_zydm;
	}
	public void setJh_zydm(String jh_zydm) {
		this.jh_zydm = jh_zydm;
	}
	public String getJh_zymc() {
		return jh_zymc;
	}
	public void setJh_zymc(String jh_zymc) {
		this.jh_zymc = jh_zymc;
	}
	public String getJh_pcdm() {
		return jh_pcdm;
	}
	public void setJh_pcdm(String jh_pcdm) {
		this.jh_pcdm = jh_pcdm;
	}
	public String getJh_yxbh_s() {
		return jh_yxbh_s;
	}
	public void setJh_yxbh_s(String jh_yxbh_s) {
		this.jh_yxbh_s = jh_yxbh_s;
	}
	public String getJh_wyyzdm() {
		return jh_wyyzdm;
	}
	public void setJh_wyyzdm(String jh_wyyzdm) {
		this.jh_wyyzdm = jh_wyyzdm;
	}
	public Integer getJh_xzdm() {
		return jh_xzdm;
	}
	public void setJh_xzdm(Integer jh_xzdm) {
		this.jh_xzdm = jh_xzdm;
	}
	public Integer getJh_sfbz() {
		return jh_sfbz;
	}
	public void setJh_sfbz(Integer jh_sfbz) {
		this.jh_sfbz = jh_sfbz;
	}
	public Integer getJh_zsjhs() {
		return jh_zsjhs;
	}
	public void setJh_zsjhs(Integer jh_zsjhs) {
		this.jh_zsjhs = jh_zsjhs;
	}
	public String getJh_zybz_s() {
		return jh_zybz_s;
	}
	public void setJh_zybz_s(String jh_zybz_s) {
		this.jh_zybz_s = jh_zybz_s;
	}
//	public Integer getJh_xszsjhs() {
//		return jh_xszsjhs;
//	}
//	public void setJh_xszsjhs(Integer jh_xszsjhs) {
//		this.jh_xszsjhs = jh_xszsjhs;
//	}
	public String getJh_yxbz() {
		return jh_yxbz;
	}
	public void setJh_yxbz(String jh_yxbz) {
		this.jh_yxbz = jh_yxbz;
	}
	public Integer getJh_status() {
		return jh_status;
	}
	public void setJh_status(Integer jh_status) {
		this.jh_status = jh_status;
	}
	public String getStwy_wymc() {
		return stwy_wymc;
	}
	public void setStwy_wymc(String stwy_wymc) {
		this.stwy_wymc = stwy_wymc;
	}
	public Integer getJhx_xb() {
		return jhx_xb;
	}
	public void setJhx_xb(Integer jhx_xb) {
		this.jhx_xb = jhx_xb;
	}
	public String getJhx_xbbz() {
		return jhx_xbbz;
	}
	public void setJhx_xbbz(String jhx_xbbz) {
		this.jhx_xbbz = jhx_xbbz;
	}
	public Integer getJhx_sg1() {
		return jhx_sg1;
	}
	public void setJhx_sg1(Integer jhx_sg1) {
		this.jhx_sg1 = jhx_sg1;
	}
	public String getJhx_sg1bz() {
		return jhx_sg1bz;
	}
	public void setJhx_sg1bz(String jhx_sg1bz) {
		this.jhx_sg1bz = jhx_sg1bz;
	}
	public Integer getJhx_sg2() {
		return jhx_sg2;
	}
	public void setJhx_sg2(Integer jhx_sg2) {
		this.jhx_sg2 = jhx_sg2;
	}
	public String getJhx_sg2bz() {
		return jhx_sg2bz;
	}
	public void setJhx_sg2bz(String jhx_sg2bz) {
		this.jhx_sg2bz = jhx_sg2bz;
	}
//	public Integer getJhx_ld() {
//		return jhx_ld;
//	}
//	public void setJhx_ld(Integer jhx_ld) {
//		this.jhx_ld = jhx_ld;
//	}
	public Integer getJhx_hzbx() {
		return jhx_hzbx;
	}
	public void setJhx_hzbx(Integer jhx_hzbx) {
		this.jhx_hzbx = jhx_hzbx;
	}
//	public Integer getJhx_gsf() {
//		return jhx_gsf;
//	}
//	public void setJhx_gsf(Integer jhx_gsf) {
//		this.jhx_gsf = jhx_gsf;
//	}
	public Integer getJhx_ykb() {
		return jhx_ykb;
	}
	public void setJhx_ykb(Integer jhx_ykb) {
		this.jhx_ykb = jhx_ykb;
	}
	public String getJhx_mz() {
		return jhx_mz;
	}
	public void setJhx_mz(String jhx_mz) {
		this.jhx_mz = jhx_mz;
	}
	public String getJhx_smxz() {
		return jhx_smxz;
	}
	public void setJhx_smxz(String jhx_smxz) {
		this.jhx_smxz = jhx_smxz;
	}
	public String getJhx_slxz() {
		return jhx_slxz;
	}
	public void setJhx_slxz(String jhx_slxz) {
		this.jhx_slxz = jhx_slxz;
	}
//	public Integer getJhx_status() {
//		return jhx_status;
//	}
//	public void setJhx_status(Integer jhx_status) {
//		this.jhx_status = jhx_status;
//	}
	public Integer getJhf_zsjhs01() {
		return jhf_zsjhs01;
	}
	public void setJhf_zsjhs01(Integer jhf_zsjhs01) {
		this.jhf_zsjhs01 = jhf_zsjhs01;
	}
	public Float getJhf_zgfs01() {
		return jhf_zgfs01;
	}
	public void setJhf_zgfs01(Float jhf_zgfs01) {
		this.jhf_zgfs01 = jhf_zgfs01;
	}
	public Float getJhf_zdfs01() {
		return jhf_zdfs01;
	}
	public void setJhf_zdfs01(Float jhf_zdfs01) {
		this.jhf_zdfs01 = jhf_zdfs01;
	}
	public Integer getJhf_zdwc01() {
		return jhf_zdwc01;
	}
	public void setJhf_zdwc01(Integer jhf_zdwc01) {
		this.jhf_zdwc01 = jhf_zdwc01;
	}
	public Integer getJhf_zsjhs02() {
		return jhf_zsjhs02;
	}
	public void setJhf_zsjhs02(Integer jhf_zsjhs02) {
		this.jhf_zsjhs02 = jhf_zsjhs02;
	}
	public Float getJhf_zgfs02() {
		return jhf_zgfs02;
	}
	public void setJhf_zgfs02(Float jhf_zgfs02) {
		this.jhf_zgfs02 = jhf_zgfs02;
	}
	public Float getJhf_zdfs02() {
		return jhf_zdfs02;
	}
	public void setJhf_zdfs02(Float jhf_zdfs02) {
		this.jhf_zdfs02 = jhf_zdfs02;
	}
	public Integer getJhf_zdwc02() {
		return jhf_zdwc02;
	}
	public void setJhf_zdwc02(Integer jhf_zdwc02) {
		this.jhf_zdwc02 = jhf_zdwc02;
	}
	public Integer getJhf_zsjhs03() {
		return jhf_zsjhs03;
	}
	public void setJhf_zsjhs03(Integer jhf_zsjhs03) {
		this.jhf_zsjhs03 = jhf_zsjhs03;
	}
	public Float getJhf_zgfs03() {
		return jhf_zgfs03;
	}
	public void setJhf_zgfs03(Float jhf_zgfs03) {
		this.jhf_zgfs03 = jhf_zgfs03;
	}
	public Float getJhf_zdfs03() {
		return jhf_zdfs03;
	}
	public void setJhf_zdfs03(Float jhf_zdfs03) {
		this.jhf_zdfs03 = jhf_zdfs03;
	}
	public Integer getJhf_zdwc03() {
		return jhf_zdwc03;
	}
	public void setJhf_zdwc03(Integer jhf_zdwc03) {
		this.jhf_zdwc03 = jhf_zdwc03;
	}
//	public Integer getJhf_zsjhs04() {
//		return jhf_zsjhs04;
//	}
//	public void setJhf_zsjhs04(Integer jhf_zsjhs04) {
//		this.jhf_zsjhs04 = jhf_zsjhs04;
//	}
//	public Float getJhf_zgfs04() {
//		return jhf_zgfs04;
//	}
//	public void setJhf_zgfs04(Float jhf_zgfs04) {
//		this.jhf_zgfs04 = jhf_zgfs04;
//	}
//	public Float getJhf_zdwc04() {
//		return jhf_zdwc04;
//	}
//	public void setJhf_zdwc04(Float jhf_zdwc04) {
//		this.jhf_zdwc04 = jhf_zdwc04;
//	}
//	public Integer getJhf_zdfs04() {
//		return jhf_zdfs04;
//	}
//	public void setJhf_zdfs04(Integer jhf_zdfs04) {
//		this.jhf_zdfs04 = jhf_zdfs04;
//	}
//	public Integer getJhf_zsjhs05() {
//		return jhf_zsjhs05;
//	}
//	public void setJhf_zsjhs05(Integer jhf_zsjhs05) {
//		this.jhf_zsjhs05 = jhf_zsjhs05;
//	}
//	public Float getJhf_zgfs05() {
//		return jhf_zgfs05;
//	}
//	public void setJhf_zgfs05(Float jhf_zgfs05) {
//		this.jhf_zgfs05 = jhf_zgfs05;
//	}
//	public Float getJhf_zdfs05() {
//		return jhf_zdfs05;
//	}
//	public void setJhf_zdfs05(Float jhf_zdfs05) {
//		this.jhf_zdfs05 = jhf_zdfs05;
//	}
//	public Integer getJhf_zdwc05() {
//		return jhf_zdwc05;
//	}
//	public void setJhf_zdwc05(Integer jhf_zdwc05) {
//		this.jhf_zdwc05 = jhf_zdwc05;
//	}
//	public Integer getJhf_status() {
//		return jhf_status;
//	}
//	public void setJhf_status(Integer jhf_status) {
//		this.jhf_status = jhf_status;
//	}
	public String getStpc_pcmc() {
		return stpc_pcmc;
	}
	public void setStpc_pcmc(String stpc_pcmc) {
		this.stpc_pcmc = stpc_pcmc;
	}
	public Integer getSc_status() {
		return sc_status;
	}
	public void setSc_status(Integer sc_status) {
		this.sc_status = sc_status;
	}
	public Integer getTianbao() {
		return tianbao;
	}
	public void setTianbao(Integer tianbao) {
		this.tianbao = tianbao;
	}
	public String getFfs_nf01() {
		return ffs_nf01;
	}
	public void setFfs_nf01(String ffs_nf01) {
		this.ffs_nf01 = ffs_nf01;
	}
	public Integer getFfs_flag01() {
		return ffs_flag01;
	}
	public void setFfs_flag01(Integer ffs_flag01) {
		this.ffs_flag01 = ffs_flag01;
	}
	public String getFfs_nf02() {
		return ffs_nf02;
	}
	public void setFfs_nf02(String ffs_nf02) {
		this.ffs_nf02 = ffs_nf02;
	}
	public Integer getFfs_flag02() {
		return ffs_flag02;
	}
	public void setFfs_flag02(Integer ffs_flag02) {
		this.ffs_flag02 = ffs_flag02;
	}
	public String getFfs_nf03() {
		return ffs_nf03;
	}
	public void setFfs_nf03(String ffs_nf03) {
		this.ffs_nf03 = ffs_nf03;
	}
	public Integer getFfs_flag03() {
		return ffs_flag03;
	}
	public void setFfs_flag03(Integer ffs_flag03) {
		this.ffs_flag03 = ffs_flag03;
	}
	

}
