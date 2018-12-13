package com.itheima.service;

import com.itheima.domain.Items;

import java.util.List;

public interface ItemsService {

    public List<Items> findAll();

    Items findByID(Integer id);

    void update(Items items);
}
