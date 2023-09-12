package com.etc.class0905.controller;

import com.etc.class0905.dao.TuserDao;
import com.etc.class0905.entity.Tuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class TuserController {
    //从容器中去除dao对象
    @Autowired
    TuserDao tuserDao;

    @ResponseBody
    @RequestMapping("/save")
    public Object saveUser(Tuser tuser) {
        return tuserDao.save(tuser);
    }

    /**
     * 登录功能
     *
     * @param tuser
     * @return
     */


    @RequestMapping("/login")
    @ResponseBody
    public Object findByNameAndPassword(Tuser tuser) {
        return tuserDao.findByNameAndPassword(tuser.getName(), tuser.getPassword());
    }
}
