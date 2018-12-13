package com.itheima.dao;

import com.itheima.domain.Items;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ItemsDao {


    @Select("select * from items")
    public List<Items> findAll();


    @Select("select * from items where id=#{id}")
    Items findById(Integer id);

    @Update("update items set name=#{name},price=#{price},detail=#{detail}")
    void update(Items items);

}
