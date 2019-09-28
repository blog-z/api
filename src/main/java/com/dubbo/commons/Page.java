package com.dubbo.commons;


import java.io.Serializable;
import java.util.List;

public class Page implements Serializable {

    private long pageNum; //当前页，此值是从前端传过来的
    private long pageSize; //每页显示的数据条数
    private long totalRecord; //总数据条数，是从数据库查询得到

    private long totalPage;  //总页数，通过totalRecord和pageSize计算可以得来
    private long startIndex; //开始索引，从数据库查询结果中要从第几行开始拿，有了startIndex和pageSize，就知道了limit语句两个数据，就能显示每页的数据了


    //将每页数据放在list集合中
    private List<SearchElasticsearchArticleJson> list;

    //分页显示的页数，比如在页面上显示1,2,3,4,5页，start就是1,end就是5,这个也是算出来的
    private long start;
    private long end;

    public Page(long pageNum,long pageSize,long totalRecord,List<SearchElasticsearchArticleJson> list){
        this.pageNum=pageNum;
        this.pageSize=pageSize;
        this.totalRecord=totalRecord;

        //计算totalPage
        if (totalRecord%pageSize==0){
            //整除说明，正好每页显示pageSize数据，没有多余的数据
            this.totalPage=totalRecord/pageSize;    //总页数=总数据/每页显示数据条数
        }else {
            this.totalPage=totalRecord/pageSize+1;
        }

        this.list=list;



        //开始索引  数据库中索引是从0开始，所以pageNum-1;并且每次向前进pageSize
        this.startIndex=(pageNum-1)*pageSize;

        //前端显示页数下标
        this.start=1;
        this.end=5;

        //如果总页数小于5
        if (totalPage <= 5) {
            this.end=totalPage;
        }else {
            //总页数大于5，就当前页计算，为了让当前页显示在中间
            this.start=pageNum-2;
            this.end=pageNum+2;
            //但是如果当前页是第一页或第二页
            if (start<=0){
                this.start=1;
                this.end=5;
            }
            //如果当前页是倒数第一页或第二页
            if (end>this.totalPage){
                this.start=end-5;
                this.end=totalPage;
            }
        }
    }

    public Page(){}

    public long getPageNum() {
        return pageNum;
    }

    public void setPageNum(long pageNum) {
        this.pageNum = pageNum;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

    public long getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(long startIndex) {
        this.startIndex = startIndex;
    }

    public List<SearchElasticsearchArticleJson> getList() {
        return list;
    }

    public void setList(List<SearchElasticsearchArticleJson> list) {
        this.list = list;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }


}




















