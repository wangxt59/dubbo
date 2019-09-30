package com.wang.service;
import com.wang.utils.PageResult;
import com.wang.pojo.Problem;

import java.util.*;

/**
 * problem业务逻辑层
 */
public interface ProblemService {


    public List<Problem> findAll();


    public PageResult<Problem> findPage(int page, int size);


    public List<Problem> findList(Map<String, Object> searchMap);


    public PageResult<Problem> findPage(Map<String, Object> searchMap, int page, int size);


    public Problem findById(String id);

    public void add(Problem problem);


    public void update(Problem problem);


    public void delete(String id);

}
