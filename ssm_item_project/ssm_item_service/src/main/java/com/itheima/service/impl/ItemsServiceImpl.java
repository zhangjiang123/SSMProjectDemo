package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    public List<Items> findAll() {

        List<Items> itemsList = itemsDao.findAll();
        return itemsList;
    }

    public Items findByID(Integer id) {


        Items items =itemsDao.findById(id);


        return items;
    }

    public void update(Items items) {

        itemsDao.update(items);

    }


}
