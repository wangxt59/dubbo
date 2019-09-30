package com.wang.consumer.service.impl;

import com.wang.pojo.Article;
import com.wang.service.ArticleService;
import org.springframework.stereotype.Service;
import com.alibaba.dubbo.config.annotation.Reference;

import java.util.List;

@Service
public class TestCustomer  {
    @Reference
    ArticleService articleService;


    public List<Article> test()    {
        return articleService.findAll();
    }
}
