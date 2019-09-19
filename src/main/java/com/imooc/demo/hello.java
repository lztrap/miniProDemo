package com.imooc.demo;

import com.imooc.demo.entity.TbArea;
import com.imooc.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @Autowired
    private AreaService areaService;

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello(){

        return "hello spring boot!";
    }

    @RequestMapping(value="/get", method = RequestMethod.GET)
    public String testget(){

        TbArea tbArea = areaService.getAreaById(1);

        return tbArea.getAreaName();
    }

}
