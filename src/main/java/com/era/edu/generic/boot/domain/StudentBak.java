package com.era.edu.generic.boot.domain;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="student")
public class StudentBak {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer stuId;
	@Column
	private String stuTchrId;
	@Column
	private String stuTel;
	@Column
	private String stuName;
	@Column
	private String stuPassword;
	@Column
	private String stuExamCode;
	@Column
	private String stuSubjectCode;
	@Column
	private String stuSex;
	@Column
	private String stuRace;
	@Column
	private String stuHighschoolCode;
	@Column
	private String stuHeight;
	@Column
	private String stuEmail;
	@Column
	private String stuQq;
	@Column
	private String stuLanguageCode;
	@Column
	private String stuPoint;
	@Column
	private String stuPointRank;
	@Column
	private String stuPointEqualNum;
	@Column
	private String stuProvinceCode;
	@Column
	private String stuCityCode;
	@Column
	private String stuDistrictCode;
	@Column
	private String stuEyesight;
	@Column
	private String stuColourWeakness;
	@Column
	private String stuPointDetail;
	@Column
	private Date stuRegisterDate;
	@Column
	private String stuYear;
	@Column
	private String stuHighschoolClass;
	@Column
	private String stuGoodSubject;
	@Column
	private String stuIntentSubject;
	@Column
	private String stuIntentCollege;
	@Column
	private String stuIntentCity;
	@Column
	private String stuAfterGraduation;
	@Column
	private String stuSpecialType;
	@Column
	private String stuOtherInfo;

	public StudentBak() {
		this.stuTel = null;
		this.stuName = null;
		this.stuPassword = null;
		this.stuExamCode = null;
		this.stuSubjectCode = null;
		this.stuSex = "0";
		this.stuRace = "00";
		this.stuHighschoolCode = null;
		this.stuHeight = null;
		this.stuEmail = null;
		this.stuQq = null;
		this.stuLanguageCode = null;
		this.stuPoint = null;
		this.stuPointRank = null;
		this.stuPointEqualNum = null;
		this.stuProvinceCode = null;
		this.stuCityCode = null;
		this.stuDistrictCode = null;
		this.stuEyesight = "9";
		this.stuColourWeakness = "9";
		this.stuPointDetail = "0,0,0,0,0,0";
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		this.stuRegisterDate = new Date();
		this.stuHighschoolCode = "0";
		this.stuYear = null;
		this.stuHighschoolClass = null;
		this.stuTchrId = null;
		this.stuGoodSubject = "请选择科类(文理)";
		this.stuIntentSubject = "0,0,0,0,0,";
		this.stuIntentCollege = null;
		this.stuIntentCity = null;
		this.stuAfterGraduation = "0,0,0";
		this.stuSpecialType = "0,0";
		this.stuOtherInfo = null;
	}
	public void setInfo(String stuTel, String stuName, String stuPassword, String stuSubjectCode, String stuSex, String stuRace, String stuHeight, String stuEmail, String stuQq, String stuLanguageCode, String stuPoint, String stuProvinceCode, String stuCityCode, String stuDistrictCode, String stuEyesight, String stuColourWeakness,String stuPointDetail, String stuHighschoolCode, String stuYear, String stuHighschoolClass,String stuGoodSubject,String stuIntentSubject,String stuIntentCollege,String stuIntentCity,String stuAfterGraduation,String stuSpecialType,String stuOtherInfo) {
		this.stuTel = stuTel;
		this.stuName = stuName;
		this.stuPassword = stuPassword;
		this.stuSubjectCode = stuSubjectCode;
		this.stuSex = stuSex;
		this.stuRace = stuRace;
		this.stuHeight = stuHeight;
		this.stuEmail = stuEmail;
		this.stuQq = stuQq;
		this.stuLanguageCode = stuLanguageCode;
		this.stuPoint = stuPoint;
		this.stuProvinceCode = stuProvinceCode;
		this.stuCityCode = stuCityCode;
		this.stuDistrictCode = stuDistrictCode;
		this.stuEyesight = stuEyesight;
		this.stuColourWeakness = stuColourWeakness;
		this.stuPointDetail = stuPointDetail;

		this.stuHighschoolCode = stuHighschoolCode;
		this.stuYear = stuYear;
		this.stuHighschoolClass = stuHighschoolClass;

		this.stuGoodSubject = stuGoodSubject;
		this.stuIntentSubject = stuIntentSubject;
		this.stuIntentCollege = stuIntentCollege;
		this.stuIntentCity = stuIntentCity;
		this.stuAfterGraduation = stuAfterGraduation;
		this.stuSpecialType = stuSpecialType;
		this.stuOtherInfo = stuOtherInfo;
	}

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getStuTel() {
		return stuTel;
	}

	public void setStuTel(String stuTel) {
		this.stuTel = stuTel;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuPassword() {
		return stuPassword;
	}

	public void setStuPassword(String stuPassword) {
		this.stuPassword = stuPassword;
	}

	public String getStuExamCode() {
		return stuExamCode;
	}

	public void setStuExamCode(String stuExamCode) {
		this.stuExamCode = stuExamCode;
	}

	public String getStuSubjectCode() {
		return stuSubjectCode;
	}

	public void setStuSubjectCode(String stuSubjectCode) {
		this.stuSubjectCode = stuSubjectCode;
	}

	public String getStuSex() {
		return stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	public String getStuRace() {
		return stuRace;
	}

	public void setStuRace(String stuRace) {
		this.stuRace = stuRace;
	}

	public String getStuHighschoolCode() {
		return stuHighschoolCode;
	}

	public void setStuHighschoolCode(String stuHighschoolCode) {
		this.stuHighschoolCode = stuHighschoolCode;
	}

	public String getStuHeight() {
		return stuHeight;
	}

	public void setStuHeight(String stuHeight) {
		this.stuHeight = stuHeight;
	}

	public String getStuEmail() {
		return stuEmail;
	}

	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}

	public String getStuQq() {
		return stuQq;
	}

	public void setStuQq(String stuQq) {
		this.stuQq = stuQq;
	}

	public String getStuLanguageCode() {
		return stuLanguageCode;
	}

	public void setStuLanguageCode(String stuLanguageCode) {
		this.stuLanguageCode = stuLanguageCode;
	}

	public String getStuPoint() {
		return stuPoint;
	}

	public void setStuPoint(String stuPoint) {
		this.stuPoint = stuPoint;
	}

	public String getStuPointRank() {
		return stuPointRank;
	}

	public void setStuPointRank(String stuPointRank) {
		this.stuPointRank = stuPointRank;
	}

	public String getStuPointEqualNum() {
		return stuPointEqualNum;
	}

	public void setStuPointEqualNum(String stuPointEqualNum) {
		this.stuPointEqualNum = stuPointEqualNum;
	}

	public String getStuProvinceCode() {
		return stuProvinceCode;
	}

	public void setStuProvinceCode(String stuProvinceCode) {
		this.stuProvinceCode = stuProvinceCode;
	}

	public String getStuCityCode() {
		return stuCityCode;
	}

	public void setStuCityCode(String stuCityCode) {
		this.stuCityCode = stuCityCode;
	}

	public String getStuDistrictCode() {
		return stuDistrictCode;
	}

	public void setStuDistrictCode(String stuDistrictCode) {
		this.stuDistrictCode = stuDistrictCode;
	}

	public String getStuEyesight() {
		return stuEyesight;
	}

	public void setStuEyesight(String stuEyesight) {
		this.stuEyesight = stuEyesight;
	}

	public String getStuColourWeakness() {
		return stuColourWeakness;
	}

	public void setStuColourWeakness(String stuColourWeakness) {
		this.stuColourWeakness = stuColourWeakness;
	}

	public String getStuPointDetail() {
		return stuPointDetail;
	}

	public void setStuPointDetail(String stuPointDetail) {
		this.stuPointDetail = stuPointDetail;
	}

	public Date getStuRegisterDate() {
		return stuRegisterDate;
	}

	public void setStuRegisterDate(Date stuRegisterDate) {
		this.stuRegisterDate = stuRegisterDate;
	}

	public String getStuYear() {
		return stuYear;
	}

	public void setStuYear(String stuYear) {
		this.stuYear = stuYear;
	}

	public String getStuHighschoolClass() {
		return stuHighschoolClass;
	}

	public void setStuHighschoolClass(String stuHighschoolClass) {
		this.stuHighschoolClass = stuHighschoolClass;
	}

	public String getStuTchrId() {
		return stuTchrId;
	}

	public void setStuTchrId(String stuTchrId) {
		this.stuTchrId = stuTchrId;
	}

	public String getStuGoodSubject() {
		return stuGoodSubject;
	}

	public void setStuGoodSubject(String stuGoodSubject) {
		this.stuGoodSubject = stuGoodSubject;
	}

	public String getStuIntentSubject() {
		return stuIntentSubject;
	}

	public void setStuIntentSubject(String stuIntentSubject) {
		this.stuIntentSubject = stuIntentSubject;
	}

	public String getStuIntentCollege() {
		return stuIntentCollege;
	}

	public void setStuIntentCollege(String stuIntentCollege) {
		this.stuIntentCollege = stuIntentCollege;
	}

	public String getStuIntentCity() {
		return stuIntentCity;
	}

	public void setStuIntentCity(String stuIntentCity) {
		this.stuIntentCity = stuIntentCity;
	}

	public String getStuAfterGraduation() {
		return stuAfterGraduation;
	}

	public void setStuAfterGraduation(String stuAfterGraduation) {
		this.stuAfterGraduation = stuAfterGraduation;
	}

	public String getStuSpecialType() {
		return stuSpecialType;
	}

	public void setStuSpecialType(String stuSpecialType) {
		this.stuSpecialType = stuSpecialType;
	}

	public String getStuOtherInfo() {
		return stuOtherInfo;
	}

	public void setStuOtherInfo(String stuOtherInfo) {
		this.stuOtherInfo = stuOtherInfo;
	}

	@Override
	public String toString() {
		return "Student{" +
				"stuId='" + stuId + '\'' +
				", stuTel='" + stuTel + '\'' +
				", stuName='" + stuName + '\'' +
				", stuPassword='" + stuPassword + '\'' +
				", stuExamCode='" + stuExamCode + '\'' +
				", stuSubjectCode='" + stuSubjectCode + '\'' +
				", stuSex='" + stuSex + '\'' +
				", stuRace='" + stuRace + '\'' +
				", stuHighschoolCode='" + stuHighschoolCode + '\'' +
				", stuHeight='" + stuHeight + '\'' +
				", stuEmail='" + stuEmail + '\'' +
				", stuQq='" + stuQq + '\'' +
				", stuLanguageCode='" + stuLanguageCode + '\'' +
				", stuPoint='" + stuPoint + '\'' +
				", stuPointRank='" + stuPointRank + '\'' +
				", stuPointEqualNum='" + stuPointEqualNum + '\'' +
				", stuProvinceCode='" + stuProvinceCode + '\'' +
				", stuCityCode='" + stuCityCode + '\'' +
				", stuDistrictCode='" + stuDistrictCode + '\'' +
				", stuEyesight='" + stuEyesight + '\'' +
				", stuColourWeakness='" + stuColourWeakness + '\'' +
				", stuPointDetail='" + stuPointDetail + '\'' +
				", stuRegisterDate=" + stuRegisterDate +
				", stuHighschoolCode='" + stuHighschoolCode + '\'' +
				", stuYear='" + stuYear + '\'' +
				", stuHighschoolClass='" + stuHighschoolClass + '\'' +
				", stuTchrId='" + stuTchrId + '\'' +
				", stuGoodSubject='" + stuGoodSubject + '\'' +
				", stuIntentSubject='" + stuIntentSubject + '\'' +
				", stuIntentCollege='" + stuIntentCollege + '\'' +
				", stuIntentCity='" + stuIntentCity + '\'' +
				", stuAfterGraduation='" + stuAfterGraduation + '\'' +
				", stuSpecialType='" + stuSpecialType + '\'' +
				", stuOtherInfo='" + stuOtherInfo + '\'' +
				'}';
	}
}
