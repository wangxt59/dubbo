package com.wang.service;
import com.wang.utils.PageResult;
import com.wang.pojo.Reply;

import java.util.*;

/**
 * reply业务逻辑层
 */
public interface ReplyService {


    public List<Reply> findAll();


    public PageResult<Reply> findPage(int page, int size);


    public List<Reply> findList(Map<String, Object> searchMap);


    public PageResult<Reply> findPage(Map<String, Object> searchMap, int page, int size);


    public Reply findById(String id);

    public void add(Reply reply);


    public void update(Reply reply);


    public void delete(String id);

}
