package com.dubbo.entity;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    private String articleId;

    private String articleUserId;

    private String articleTitle;

    private String articleContent;

    private Integer articleHeat;

    private Date createTime;

    private Date updateTime;

    public Article(String articleId, String articleUserId, String articleTitle, String articleContent, Integer articleHeat, Date createTime, Date updateTime) {
//        super(articleId);
        this.articleId = articleId;
        this.articleUserId = articleUserId;
        this.articleTitle = articleTitle;
        this.articleContent = articleContent;
        this.articleHeat = articleHeat;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId == null ? null : articleId.trim();
    }

    public String getArticleUserId() {
        return articleUserId;
    }

    public void setArticleUserId(String articleUserId) {
        this.articleUserId = articleUserId == null ? null : articleUserId.trim();
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    public Integer getArticleHeat() {
        return articleHeat;
    }

    public void setArticleHeat(Integer articleHeat) {
        this.articleHeat = articleHeat;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
