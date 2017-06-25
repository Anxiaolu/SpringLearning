/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.controller;

import cn.edu.sdut.softlab.entity.Category;
import cn.edu.sdut.softlab.entity.Item;
import cn.edu.sdut.softlab.formatter.Dateformatter;
import cn.edu.sdut.softlab.service.CategoryService;
import cn.edu.sdut.softlab.service.ItemService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.transaction.UserTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author huanlu
 */
@Controller
public class ItemController {
    
    private Logger logger;
    
    
    private UserTransaction utx;
    
    private Dateformatter dateformatter;
    
    @Autowired
    ItemService itemService;
    
    @Autowired
    CategoryService categoryService;
    
    @RequestMapping(value = "item_add", method = RequestMethod.POST)
    public String addItem(@ModelAttribute Item item) throws Exception{
        logger.info("Item add called!");
        Category category = categoryService.findCategoryById(item.getCategory().getId());
        item.setCategory(category);
        //item.setDateBought(dateformatter.parse(item.getDateBought(), Locale.ITALY));
        try {
            utx.begin();
            itemService.create(item);
            logger.log(Level.INFO, "Added {0}", item);
        } finally{
            utx.commit();
        }
        return "Item_list";
    }
    
    @RequestMapping(value = "Item_list")
    public String listItem(Model model){
        logger.info("Itemlist called!");
        List<Item> items = itemService.findAll(Item.class);
        model.addAttribute("items",items);
        return "Item_list";
    }
}
