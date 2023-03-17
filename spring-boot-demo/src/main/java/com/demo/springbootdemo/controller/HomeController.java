package com.demo.springbootdemo.controller;


import com.demo.springbootdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody this both are combined in rest controller
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Hellow World!!";
    }

    //@RequestMapping(value ="/user",method = RequestMethod.GET)
    @GetMapping("/user")
    public User user() {
        User user = new User();
        user.setId("1");
        user.setName("Maddy");
        user.setEmailId("maddy@gmail.com");
        return user;
    }

    @GetMapping("/user/{id}")
    public String pathVarialble(@PathVariable String id) {
        return "The Path Variable is : " + id;
    }

    //localhost:8081/requestParam?name=maddy
    @GetMapping("/requestParam")
    public String requestParams(@RequestParam String name, @RequestParam(name = "email", required = false) String email) {
        return name + " " + email;
    }
}
