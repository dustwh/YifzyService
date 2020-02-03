package com.era.edu.generic.boot.domain;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="threesixdata")
public class ThreeSix implements Serializable{
	private static final long serialVersionUID = 3L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idthreesixdata;
	private String schoolname;
	private String province;
	private String level;
	private String fatherMajor;
	private String demand;
	private String opt_demand;
	private String includedMajor;
	private Integer score;
	private char hasScore;
	private String ext_info1;

	public ThreeSix() {
	}

	public ThreeSix(Integer idthreesixdata,String schoolname, String province, String level, String fatherMajor, String demand,String opt_demand, String includedMajor, Integer score, char hasScore,String ext_info1) {
		this.idthreesixdata = idthreesixdata;
		this.schoolname = schoolname;
		this.province = province;
		this.level = level;
		this.fatherMajor = fatherMajor;
		this.demand = demand;
		this.opt_demand = opt_demand;
		this.includedMajor = includedMajor;
		this.score = score;
		this.hasScore = hasScore;
		this.ext_info1 = ext_info1;
	}
	public ThreeSix(String schoolname, String province, String level, String fatherMajor, String demand,String opt_demand, String includedMajor, Integer score, char hasScore,String ext_info1) {
		this.schoolname = schoolname;
		this.province = province;
		this.level = level;
		this.fatherMajor = fatherMajor;
		this.demand = demand;
		this.opt_demand = opt_demand;
		this.includedMajor = includedMajor;
		this.score = score;
		this.hasScore = hasScore;
		this.ext_info1 = ext_info1;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getIdthreesixdata() {
		return idthreesixdata;
	}

	public void setIdthreesixdata(Integer idthreesixdata) {
		this.idthreesixdata = idthreesixdata;
	}

	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getFatherMajor() {
		return fatherMajor;
	}

	public void setFatherMajor(String fatherMajor) {
		this.fatherMajor = fatherMajor;
	}

	public String getDemand() {
		return demand;
	}

	public void setDemand(String demand) {
		this.demand = demand;
	}

	public String getIncludedMajor() {
		return includedMajor;
	}

	public void setIncludedMajor(String includedMajor) {
		this.includedMajor = includedMajor;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public char getHasScore() {
		return hasScore;
	}

	public void setHasScore(char hasScore) {
		this.hasScore = hasScore;
	}

	public String getOpt_demand() {
		return opt_demand;
	}

	public void setOpt_demand(String opt_demand) {
		this.opt_demand = opt_demand;
	}

	public String getExt_info1() {
		return ext_info1;
	}

	public void setExt_info1(String ext_info1) {
		this.ext_info1 = ext_info1;
	}
}
