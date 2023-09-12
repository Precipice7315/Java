package com.etc.class0905.controller;

import com.etc.class0905.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/product")
public class ProductController {
    //因为我们会用到ProductDao，所以先从spring容器中找到对象
    @Autowired
    ProductDao productDao;

    @ResponseBody
    @RequestMapping("/getAll")
    public Object getAll() {
        return productDao.findAll();
    }
}
