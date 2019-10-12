package com.dubbo.commons;

public class Const {

    public interface Role{
        String ROLE_CONSUMER="1";    //普通用户
        String ROLE_ADMIN="0";   //管理员
        String COMMENT_ID="commentId";
    }

    public interface RedisKey{
        //防止存入实体信息是不同类型实体的key值发生冲突,所以加上前缀
        String BeforeUserKeyId="BeforeUserKeyId";
        String BeforeArticleKeyId="BeforeArticleKeyId";
        String BeforeCommentKeyId="BeforeCommentKeyId";
    }
}
