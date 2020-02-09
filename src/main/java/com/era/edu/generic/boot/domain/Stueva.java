package com.era.edu.generic.boot.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="stueva")
public class Stueva  implements Serializable{
    private static final long serialVersionUID = 2L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer evaId;
    private Integer stuId;
    private char isEnn;
    private char isHol;
    private String ennResult;
    private String holResult;
    private char isRealised;
    private String guideSubjectList;
    private String inteleResult;
    private String myEnnAnswer;
    private String myInteleAnswer;
    private char isSi;
    private String mySiAnswer;
    private String siResult;
    private char isMsslm;
    private String msslmAnswer;
    private char isMssmhs;
    private String mssmhsAnswer;
    private char isMsea;
    private String mseaAnswer;
    private char isTms;
    private String tmsAnswer;
    private char isCct;
    private Integer cctAnswer;
    private char isHs;
    private String hsAnswer;
    private char isPf;
    private String pfAnswer;

    private Date ennTime;
    private Date holTime;
    private Date siTime;
    private Date msslmTime;
    private Date mssmhsTime;
    private Date mseaTime;
    private Date tmsTime;
    private Date cctTime;
    private Date hsTime;
    private Date pfTime;
    private Date guideSubjectUpdateTime;

    public Stueva() {
    }

    public Stueva(Integer stuId, char isEnn, char isHol, String ennResult, String holResult, char isRealised, String guideSubjectList, String inteleResult, String myEnnAnswer, String myInteleAnswer, char isSi, String mySiAnswer, String siResult, char isMsslm, String msslmAnswer,char isMssmhs,String mssmhsAnswer,char isMsea,String mseaAnswer,char isTms,String tmsAnswer,char isCct,Integer cctAnswer,char isHs,String hsAnswer,char isPf,String pfAnswer) {
        this.stuId = stuId;
        this.isEnn = isEnn;
        this.isHol = isHol;
        this.ennResult = ennResult;
        this.holResult = holResult;
        this.isRealised = isRealised;
        this.guideSubjectList = guideSubjectList;
        this.inteleResult = inteleResult;
        this.myEnnAnswer = myEnnAnswer;
        this.myInteleAnswer = myInteleAnswer;
        this.isSi = isSi;
        this.mySiAnswer = mySiAnswer;
        this.siResult = siResult;
        this.isMsslm = isMsslm;
        this.msslmAnswer = msslmAnswer;
        this.isMssmhs=isMssmhs;
        this.mssmhsAnswer=mssmhsAnswer;
        this.isMsea=isMsea;
        this.mseaAnswer=mseaAnswer;
        this.isTms=isTms;
        this.tmsAnswer=tmsAnswer;
        this.isCct=isCct;
        this.cctAnswer=cctAnswer;
        this.isHs=isHs;
        this.hsAnswer=hsAnswer;
        this.isPf = isPf;
        this.pfAnswer = pfAnswer;
    }
    public Stueva(Integer evaId,Integer stuId, char isEnn, char isHol, String ennResult, String holResult, char isRealised, String guideSubjectList, String inteleResult, String myEnnAnswer, String myInteleAnswer, char isSi, String mySiAnswer, String siResult, char isMsslm, String msslmAnswer,char isMssmhs,String mssmhsAnswer,char isMsea,String mseaAnswer,char isTms,String tmsAnswer,char isCct,Integer cctAnswer,char isHs,String hsAnswer,char isPf,String pfAnswer) {
        this.evaId = evaId;
        this.stuId = stuId;
        this.isEnn = isEnn;
        this.isHol = isHol;
        this.ennResult = ennResult;
        this.holResult = holResult;
        this.isRealised = isRealised;
        this.guideSubjectList = guideSubjectList;
        this.inteleResult = inteleResult;
        this.myEnnAnswer = myEnnAnswer;
        this.myInteleAnswer = myInteleAnswer;
        this.isSi = isSi;
        this.mySiAnswer = mySiAnswer;
        this.siResult = siResult;
        this.isMsslm = isMsslm;
        this.msslmAnswer = msslmAnswer;
        this.isMssmhs=isMssmhs;
        this.mssmhsAnswer=mssmhsAnswer;
        this.isMsea=isMsea;
        this.mseaAnswer=mseaAnswer;
        this.isTms=isTms;
        this.tmsAnswer=tmsAnswer;
        this.isCct=isCct;
        this.cctAnswer=cctAnswer;
        this.isHs=isHs;
        this.hsAnswer=hsAnswer;
        this.isPf = isPf;
        this.pfAnswer = pfAnswer;
    }
    public Stueva(Integer stuId) {
        this.stuId = stuId;
        this.isEnn = '0';
        this.isHol = '0';
        this.ennResult = "000000000";
        this.holResult = "0,0,0,0,0,0";
        this.isRealised = '0';
        this.guideSubjectList = "";
        this.inteleResult = "0,0,0,0,0,0,0,0";

        this.isSi='0';
        this.isMsslm='0';
        this.isMssmhs='0';
        this.isMsea='0';
        this.isTms='0';
        this.isCct='0';
        this.isHs='0';
        this.isPf='0';

    }
    public Stueva(Integer stuId, char isEnn, char isHol, String ennResult, String holResult,char isRealised,String guideSubjectList,String inteleResult) {
        this.stuId = stuId;
        this.isEnn = isEnn;
        this.isHol = isHol;
        this.ennResult = ennResult;
        this.holResult = holResult;
        this.isRealised = isRealised;
        this.guideSubjectList = guideSubjectList;
        this.inteleResult = inteleResult;
    }

    public Stueva(Integer evaId,Integer stuId, char isEnn, char isHol, String ennResult, String holResult,char isRealised,String guideSubjectList,String inteleResult) {
        this.evaId = evaId;
        this.stuId = stuId;
        this.isEnn = isEnn;
        this.isHol = isHol;
        this.ennResult = ennResult;
        this.holResult = holResult;
        this.isRealised = isRealised;
        this.guideSubjectList = guideSubjectList;
        this.inteleResult = inteleResult;
    }
    public Stueva(Integer stuId, char isEnn, char isHol, String ennResult, String holResult,char isRealised,String guideSubjectList,String inteleResult,String myEnnAnswer,String myInteleAnswer,char isSi,String mySiAnswer,String siResult) {
        this.stuId = stuId;
        this.isEnn = isEnn;
        this.isHol = isHol;
        this.ennResult = ennResult;
        this.holResult = holResult;
        this.isRealised = isRealised;
        this.guideSubjectList = guideSubjectList;
        this.inteleResult = inteleResult;
        this.myEnnAnswer=myEnnAnswer;
        this.myInteleAnswer=myInteleAnswer;
        this.isSi=isSi;
        this.mySiAnswer=mySiAnswer;
        this.siResult=siResult;
    }

    public Stueva(Integer evaId,Integer stuId, char isEnn, char isHol, String ennResult, String holResult,char isRealised,String guideSubjectList,String inteleResult,String myEnnAnswer,String myInteleAnswer,char isSi,String mySiAnswer,String siResult) {
        this.evaId = evaId;
        this.stuId = stuId;
        this.isEnn = isEnn;
        this.isHol = isHol;
        this.ennResult = ennResult;
        this.holResult = holResult;
        this.isRealised = isRealised;
        this.guideSubjectList = guideSubjectList;
        this.inteleResult = inteleResult;
        this.myEnnAnswer=myEnnAnswer;
        this.myInteleAnswer=myInteleAnswer;
        this.isSi=isSi;
        this.mySiAnswer=mySiAnswer;
        this.siResult=siResult;
    }

    public Integer getEvaId() {
        return evaId;
    }

    public void setEvaId(Integer evaId) {
        this.evaId = evaId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public char getIsEnn() {
        return isEnn;
    }

    public void setIsEnn(char isEnn) {
        this.isEnn = isEnn;
    }

    public char getIsHol() {
        return isHol;
    }

    public void setIsHol(char isHol) {
        this.isHol = isHol;
    }

    public String getEnnResult() {
        return ennResult;
    }

    public void setEnnResult(String ennResult) {
        this.ennResult = ennResult;
    }

    public String getHolResult() {
        return holResult;
    }

    public void setHolResult(String holResult) {
        this.holResult = holResult;
    }

    public char getIsRealised() {
        return isRealised;
    }

    public void setIsRealised(char isRealised) {
        this.isRealised = isRealised;
    }

    public String getGuideSubjectList() {
        return guideSubjectList;
    }

    public void setGuideSubjectList(String guideSubjectList) {
        this.guideSubjectList = guideSubjectList;
    }

    public String getInteleResult() {
        return inteleResult;
    }

    public void setInteleResult(String inteleResult) {
        this.inteleResult = inteleResult;
    }

    public String getMyEnnAnswer() {
        return myEnnAnswer;
    }

    public void setMyEnnAnswer(String myEnnAnswer) {
        this.myEnnAnswer = myEnnAnswer;
    }

    public String getMyInteleAnswer() {
        return myInteleAnswer;
    }

    public void setMyInteleAnswer(String myInteleAnswer) {
        this.myInteleAnswer = myInteleAnswer;
    }

    public char getIsSi() {
        return isSi;
    }

    public void setIsSi(char isSi) {
        this.isSi = isSi;
    }

    public String getMySiAnswer() {
        return mySiAnswer;
    }

    public void setMySiAnswer(String mySiAnswer) {
        this.mySiAnswer = mySiAnswer;
    }

    public String getSiResult() {
        return siResult;
    }

    public void setSiResult(String siResult) {
        this.siResult = siResult;
    }

    public char getIsMsslm() {
        return isMsslm;
    }

    public void setIsMsslm(char isMsslm) {
        this.isMsslm = isMsslm;
    }

    public String getMsslmAnswer() {
        return msslmAnswer;
    }

    public void setMsslmAnswer(String msslmAnswer) {
        this.msslmAnswer = msslmAnswer;
    }

    public char getIsMssmhs() {
        return isMssmhs;
    }

    public void setIsMssmhs(char isMssmhs) {
        this.isMssmhs = isMssmhs;
    }

    public String getMssmhsAnswer() {
        return mssmhsAnswer;
    }

    public void setMssmhsAnswer(String mssmhsAnswer) {
        this.mssmhsAnswer = mssmhsAnswer;
    }

    public char getIsMsea() {
        return isMsea;
    }

    public void setIsMsea(char isMsea) {
        this.isMsea = isMsea;
    }

    public String getMseaAnswer() {
        return mseaAnswer;
    }

    public void setMseaAnswer(String mseaAnswer) {
        this.mseaAnswer = mseaAnswer;
    }

    public char getIsTms() {
        return isTms;
    }

    public void setIsTms(char isTms) {
        this.isTms = isTms;
    }

    public String getTmsAnswer() {
        return tmsAnswer;
    }

    public void setTmsAnswer(String tmsAnswer) {
        this.tmsAnswer = tmsAnswer;
    }

    public char getIsCct() {
        return isCct;
    }

    public void setIsCct(char isCct) {
        this.isCct = isCct;
    }

    public Integer getCctAnswer() {
        return cctAnswer;
    }

    public void setCctAnswer(Integer cctAnswer) {
        this.cctAnswer = cctAnswer;
    }

    public char getIsHs() {
        return isHs;
    }

    public void setIsHs(char isHs) {
        this.isHs = isHs;
    }

    public String getHsAnswer() {
        return hsAnswer;
    }

    public void setHsAnswer(String hsAnswer) {
        this.hsAnswer = hsAnswer;
    }

    public char getIsPf() {
        return isPf;
    }

    public void setIsPf(char isPf) {
        this.isPf = isPf;
    }

    public String getPfAnswer() {
        return pfAnswer;
    }

    public void setPfAnswer(String pfAnswer) {
        this.pfAnswer = pfAnswer;
    }

    public Date getEnnTime() {
        return ennTime;
    }

    public void setEnnTime(Date ennTime) {
        this.ennTime = ennTime;
    }

    public Date getHolTime() {
        return holTime;
    }

    public void setHolTime(Date holTime) {
        this.holTime = holTime;
    }

    public Date getSiTime() {
        return siTime;
    }

    public void setSiTime(Date siTime) {
        this.siTime = siTime;
    }

    public Date getMsslmTime() {
        return msslmTime;
    }

    public void setMsslmTime(Date msslmTime) {
        this.msslmTime = msslmTime;
    }

    public Date getMssmhsTime() {
        return mssmhsTime;
    }

    public void setMssmhsTime(Date mssmhsTime) {
        this.mssmhsTime = mssmhsTime;
    }

    public Date getMseaTime() {
        return mseaTime;
    }

    public void setMseaTime(Date mseaTime) {
        this.mseaTime = mseaTime;
    }

    public Date getTmsTime() {
        return tmsTime;
    }

    public void setTmsTime(Date tmsTime) {
        this.tmsTime = tmsTime;
    }

    public Date getCctTime() {
        return cctTime;
    }

    public void setCctTime(Date cctTime) {
        this.cctTime = cctTime;
    }

    public Date getHsTime() {
        return hsTime;
    }

    public void setHsTime(Date hsTime) {
        this.hsTime = hsTime;
    }

    public Date getPfTime() {
        return pfTime;
    }

    public void setPfTime(Date pfTime) {
        this.pfTime = pfTime;
    }
}