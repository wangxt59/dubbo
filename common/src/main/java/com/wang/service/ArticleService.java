package com.wang.service; 

import com.wang.pojo.Article;
import com.wang.utils.PageResult;

import java.util.*;

/**
 * article业务逻辑层
 */
public interface ArticleService {


    public List<Article> findAll();


    public PageResult<Article> findPage(int page, int size);


    public List<Article> findList(Map<String, Object> searchMap);


    public PageResult<Article> findPage(Map<String, Object> searchMap, int page, int size);


    public Article findById(String id);

    public void add(Article article);


    public void update(Article article);


    public void delete(String id);

}
