package com.dubbo.commons;

import java.io.Serializable;

public class SearchElasticsearchArticleJson implements Serializable {

    private String article_id;
    private String article_user_id;
    private String article_title;
    private String article_content;
    private String create_time;
    private String update_time;

    public SearchElasticsearchArticleJson(String article_id, String article_user_id, String article_title, String article_content, String create_time, String update_time) {
        this.article_id = article_id;
        this.article_user_id = article_user_id;
        this.article_title = article_title;
        this.article_content = article_content;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    public SearchElasticsearchArticleJson(){

    }

    public String getArticle_id() {
        return article_id;
    }

    public void setArticle_id(String article_id) {
        this.article_id = article_id;
    }

    public String getArticle_user_id() {
        return article_user_id;
    }

    public void setArticle_user_id(String article_user_id) {
        this.article_user_id = article_user_id;
    }

    public String getArticle_title() {
        return article_title;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title;
    }

    public String getArticle_content() {
        return article_content;
    }

    public void setArticle_content(String article_content) {
        this.article_content = article_content;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }
}
