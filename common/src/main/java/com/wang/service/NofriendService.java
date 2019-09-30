package com.wang.service;
import com.wang.utils.PageResult;
import com.wang.pojo.Nofriend;

import java.util.*;

/**
 * nofriend业务逻辑层
 */
public interface NofriendService {


    public List<Nofriend> findAll();


    public PageResult<Nofriend> findPage(int page, int size);


    public List<Nofriend> findList(Map<String, Object> searchMap);


    public PageResult<Nofriend> findPage(Map<String, Object> searchMap, int page, int size);


    public Nofriend findById(Long id);

    public void add(Nofriend nofriend);


    public void update(Nofriend nofriend);


    public void delete(Long id);

}
