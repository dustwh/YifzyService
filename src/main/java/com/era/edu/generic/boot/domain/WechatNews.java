package com.era.edu.generic.boot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="wechat_news")
public class WechatNews implements Serializable {
    private static final long serialVersionUID = 3L;
    @Id
    private Integer newsId;
    private String newsTittle;
    private String newsContent;
    public WechatNews(){

    }
    public WechatNews(Integer newsId, String newsTittle, String newsContent) {
        this.newsId=newsId;
        this.newsTittle=newsTittle;
        this.newsContent=newsContent;
    }

    public WechatNews(String newsTittle, String newsContent) {
        this.newsTittle=newsTittle;
        this.newsContent=newsContent;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewsTittle() {
        return newsTittle;
    }

    public void setNewsTittle(String newsTittle) {
        this.newsTittle = newsTittle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
}