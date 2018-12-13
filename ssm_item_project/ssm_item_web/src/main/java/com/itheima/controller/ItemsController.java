package com.itheima.controller;


import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){


        ModelAndView mv = new ModelAndView();

        List<Items> itemsList = itemsService.findAll();

        mv.addObject("itemsList",itemsList);

        mv.setViewName("itemsList");

        return mv;


    }

    @RequestMapping("/editItems")
    public ModelAndView  editItems(Integer id){


        ModelAndView mv = new ModelAndView();

        Items item = itemsService.findByID(id);

        mv.addObject("items",item);

        mv.setViewName("editItems");

        return mv;


    }

    @RequestMapping("/updateItems")
    public String updateItems(Items items){

        ModelAndView mv = new ModelAndView();

        itemsService.update(items);


        return "redirect:/editItems";

    }






}
