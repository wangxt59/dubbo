package com.wang.service; 

import com.wang.pojo.Enterprise;
import com.wang.utils.PageResult;

import java.util.*;

/**
 * enterprise业务逻辑层
 */
public interface EnterpriseService {


    public List<Enterprise> findAll();


    public PageResult<Enterprise> findPage(int page, int size);


    public List<Enterprise> findList(Map<String, Object> searchMap);


    public PageResult<Enterprise> findPage(Map<String, Object> searchMap, int page, int size);


    public Enterprise findById(String id);

    public void add(Enterprise enterprise);


    public void update(Enterprise enterprise);


    public void delete(String id);

}
