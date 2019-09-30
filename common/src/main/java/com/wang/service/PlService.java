package com.wang.service;
import com.wang.utils.PageResult;
import com.wang.pojo.Pl;

import java.util.*;

/**
 * pl业务逻辑层
 */
public interface PlService {


    public List<Pl> findAll();


    public PageResult<Pl> findPage(int page, int size);


    public List<Pl> findList(Map<String, Object> searchMap);


    public PageResult<Pl> findPage(Map<String, Object> searchMap, int page, int size);


    public Pl findById(String problem_id);

    public void add(Pl pl);


    public void update(Pl pl);


    public void delete(String problem_id);

}
