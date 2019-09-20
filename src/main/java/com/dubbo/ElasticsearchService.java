package com.dubbo;

import com.dubbo.commons.ServerResponse;
import com.dubbo.entity.Article;

public interface ElasticsearchService {

    //发表文章
    ServerResponse addArticle(Article article);

    ServerResponse deleteArticle(String articleId);

    ServerResponse updateArticle(Article article);

    ServerResponse selectArticle(String articleText);

    ServerResponse searchArticle(String userInputText,int pageNum);
}
