package com.wang.service;
import com.wang.utils.PageResult;
import com.wang.pojo.User;

import java.util.*;

/**
 * user业务逻辑层
 */
public interface UserService {


    public List<User> findAll();


    public PageResult<User> findPage(int page, int size);


    public List<User> findList(Map<String, Object> searchMap);


    public PageResult<User> findPage(Map<String, Object> searchMap, int page, int size);


    public User findById(Long id);

    public void add(User user);


    public void update(User user);


    public void delete(Long id);

}
