package com.wang.filter;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author cheng
 * @ClassName: MyFilter
 * @Description:自定义过滤器
 * @date 2017年9月26日 上午9:19:38
 */
// 加入spring ioc容器
@Component
/*
 * @WebFilter将一个实现了javax.servlet.Filter接口的类定义为过滤器
 * 属性filterName声明过滤器的名称,可选
 * 属性urlPatterns指定要过滤 的URL模式,也可使用属性value来声明.(指定要过滤的URL模式是必选属性)
 */
@WebFilter(filterName = "myFilter", urlPatterns = "/*")
//指定过滤器的执行顺序,值越小越靠后执行
@Order(1)
public class MyFilter1 implements Filter {

    /**
     * 执行过滤操作
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        chain.doFilter(request, response);
        System.out.println("执行过滤操作。。。111");
    }

    /**
     * 过滤器初始化
     */
    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("过滤器初始化。。。111");
    }

    /**
     * 过滤器销毁
     */
    @Override
    public void destroy() {
        System.out.println("过滤器销毁。。。111");
    }

}