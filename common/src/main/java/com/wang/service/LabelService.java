package com.wang.service;
import com.wang.utils.PageResult;
import com.wang.pojo.Label;

import java.util.*;

/**
 * label业务逻辑层
 */
public interface LabelService {


    public List<Label> findAll();


    public PageResult<Label> findPage(int page, int size);


    public List<Label> findList(Map<String, Object> searchMap);


    public PageResult<Label> findPage(Map<String, Object> searchMap, int page, int size);


    public Label findById(String id);

    public void add(Label label);


    public void update(Label label);


    public void delete(String id);

}
