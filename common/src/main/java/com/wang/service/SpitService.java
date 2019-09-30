package com.wang.service;
import com.wang.utils.PageResult;
import com.wang.pojo.Spit;

import java.util.*;

/**
 * spit业务逻辑层
 */
public interface SpitService {


    public List<Spit> findAll();


    public PageResult<Spit> findPage(int page, int size);


    public List<Spit> findList(Map<String, Object> searchMap);


    public PageResult<Spit> findPage(Map<String, Object> searchMap, int page, int size);


    public Spit findById(String _id);

    public void add(Spit spit);


    public void update(Spit spit);


    public void delete(String _id);

}
