package com.wang.service;
import com.wang.utils.PageResult;
import com.wang.pojo.Gathering;

import java.util.*;

/**
 * gathering业务逻辑层
 */
public interface GatheringService {


    public List<Gathering> findAll();


    public PageResult<Gathering> findPage(int page, int size);


    public List<Gathering> findList(Map<String, Object> searchMap);


    public PageResult<Gathering> findPage(Map<String, Object> searchMap, int page, int size);


    public Gathering findById(String id);

    public void add(Gathering gathering);


    public void update(Gathering gathering);


    public void delete(String id);

}
