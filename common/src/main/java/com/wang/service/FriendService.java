package com.wang.service;

import com.wang.utils.PageResult;
import com.wang.pojo.Friend;

import java.util.*;

/**
 * friend业务逻辑层
 */
public interface FriendService {


    public List<Friend> findAll();


    public PageResult<Friend> findPage(int page, int size);


    public List<Friend> findList(Map<String, Object> searchMap);


    public PageResult<Friend> findPage(Map<String, Object> searchMap, int page, int size);


    public Friend findById(Long id);

    public void add(Friend friend);


    public void update(Friend friend);


    public void delete(Long id);

}
