package com.gtnes.controllerr;

import com.gtnes.model.UserObject;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody
    public String save(){
        System.out.println("新增用户");
        return "{module: '新增用户'}";
    }

    // 路由传参
    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String get(@PathVariable Integer id){
        System.out.println("获取用户信息 ID：" + id);
        return "{module: '获取用户信息 ID: "+id+"'}";
    }

    // 请求体传参
    @RequestMapping(value = "/users/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody UserObject userObject){
        String name = userObject.getName();
        int age = userObject.getAge();
        System.out.println("修改用户信息 ID：" + name + age);
        return "{module: '修改用户信息 ID:" + name + age +" '}";
    }

}
