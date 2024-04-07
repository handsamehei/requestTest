package com.example.controlller;

import com.example.users.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
//将参数请求封装成实体类
public class MyController {
    @RequestMapping("/requst")
    public String myqingqiu(User user){
        System.out.println(user);
        return "ok";
    }
//    简单参数请求以及  参数名不匹配注解@RequestParam

    @RequestMapping("/requst1")
    public String qinqiu(@RequestParam(value = "name") String username,String id ) {
        System.out.println(username+":"+id);
        return "ok,user";

    }
//    数组参数
    @RequestMapping("/arrays")
    public String arryRequs(String[] hobby){
        System.out.println(Arrays.toString(hobby));
        return "ok,array";
    }
//    集合参数
    @RequestMapping("/list")
    public String listrequst(@RequestParam List<String> hobby){
        System.out.println(hobby);
        return "list";
    }
//    时间参数
    @RequestMapping("/date")
    public String dateRequst(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime dateTime){
        System.out.println(dateTime);
        return "date";
    }
//    json参数
    @RequestMapping("/json")
    public String jsonRequst(@RequestBody User user){
        System.out.println(user);

        return "json";
    }
//路径参数
    @RequestMapping("/path/{id}/{name}")
    public String pathRequst(@PathVariable Integer id,@PathVariable String name){
        System.out.println(id);
        System.out.println(name);
        return "path";
    }


}
