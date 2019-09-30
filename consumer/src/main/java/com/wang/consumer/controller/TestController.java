package com.wang.consumer.controller;


import com.wang.consumer.service.impl.TestCustomer;
import com.wang.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    public TestCustomer testCustomer;

    @RequestMapping("test")
    public List<Article> test(){
        System.out.println("test");
        return testCustomer.test();
    }
}
