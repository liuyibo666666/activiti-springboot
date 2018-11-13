package com.zs.activitispringboot.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Created by IDEA
 * @author:LiuYiBo(小博)
 * @Date: 2018/11/9
 * @Time: 21:34
 */
@RestController
@RequestMapping("/home")
public class home {


    @GetMapping("/hello")
    @ResponseBody
    public Map<String,Object> home(){
        Map<String,Object> map = new HashMap<>(16);
        map.put("msg","hello world!");
        return map;
    }

}
