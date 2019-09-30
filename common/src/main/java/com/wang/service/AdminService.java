package com.wang.service; 

import com.wang.pojo.Admin;
import com.wang.utils.PageResult;

import java.util.*;

/**
 * admin业务逻辑层
 */
public interface AdminService {


    public List<Admin> findAll();


    public PageResult<Admin> findPage(int page, int size);


    public List<Admin> findList(Map<String, Object> searchMap);


    public PageResult<Admin> findPage(Map<String, Object> searchMap, int page, int size);


    public Admin findById(String id);

    public void add(Admin admin);


    public void update(Admin admin);


    public void delete(String id);

}
