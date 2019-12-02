package com.dubbo;

import com.dubbo.commons.ServerResponse;
import com.dubbo.entity.Article;

import java.util.List;

public interface ElasticsearchService {

    //发表文章
    ServerResponse addArticle(Article article);

    //删除文章
    ServerResponse deleteArticle(String articleId);

    //更新文章
    ServerResponse updateArticle(Article article);

    //get文章
    ServerResponse selectArticle(String articleText);

    //搜索文章
    ServerResponse searchArticle(String userInputText,int pageNum);

    //更新文章热点
    ServerResponse updateArticleHeat(String articleId,Integer articleHeat);

    //首页推荐
    ServerResponse homeArticleInteger(Integer pageNum);

    //得到自己的文章
    ServerResponse getOwnArticle(List<String> articleIdList);

    //得到文章标题
    String getArticleTitle(String articleId);
}
