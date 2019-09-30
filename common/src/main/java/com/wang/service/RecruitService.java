package com.wang.service;
import com.wang.utils.PageResult;
import com.wang.pojo.Recruit;

import java.util.*;

/**
 * recruit业务逻辑层
 */
public interface RecruitService {


    public List<Recruit> findAll();


    public PageResult<Recruit> findPage(int page, int size);


    public List<Recruit> findList(Map<String, Object> searchMap);


    public PageResult<Recruit> findPage(Map<String, Object> searchMap, int page, int size);


    public Recruit findById(String id);

    public void add(Recruit recruit);


    public void update(Recruit recruit);


    public void delete(String id);

}
