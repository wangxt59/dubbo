package com.wang.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wang.pojo.Article;
import com.wang.service.ArticleService;
import com.wang.utils.PageResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class TestImpl implements ArticleService {


    @Override
    public List<Article> findAll() {
        Article article=new Article();
        article.setTitle("tigongzhe");
        List list=new ArrayList();
        list.add(article);
        System.out.println("调用了provider");
        return list;
    }

    @Override
    public PageResult<Article> findPage(int page, int size) {
        return null;
    }

    @Override
    public List<Article> findList(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public PageResult<Article> findPage(Map<String, Object> searchMap, int page, int size) {
        return null;
    }

    @Override
    public Article findById(String id) {
        return null;
    }

    @Override
    public void add(Article article) {

    }

    @Override
    public void update(Article article) {

    }

    @Override
    public void delete(String id) {

    }
}
