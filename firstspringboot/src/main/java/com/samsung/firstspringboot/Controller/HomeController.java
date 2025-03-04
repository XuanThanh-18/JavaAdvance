package com.samsung.firstspringboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/home") // defind rout for controller
public class HomeController {
    @GetMapping("/hello")  // defind rout for action
    public String index(){
        return "hello";
    }

    @GetMapping("/data1")
    @ResponseBody  // du lieu tra ve la rest ko phai view
    public String Data1(@RequestParam(defaultValue = "") String name
    ,@RequestParam(defaultValue = "18") String age
    ,@RequestParam (required = false )String address){
        return "Hello World " + name + " " + age + " " + address;
    }

    @GetMapping("/data2")
    @ResponseBody  // du lieu tra ve la rest ko phai view
    public String Data2(@RequestParam List<String> name){
        return "Hello World " + name ;
    }

    @GetMapping("/path/{id}")
    @ResponseBody
    public String Hello(@PathVariable int id){
        return "Hello World " + id ;
    }

    @GetMapping("/combine/{category}")
    public String Combine(@PathVariable String category , @RequestParam(required = false) String sort){
        return "Danh muc " + category + " , sap xep: " +  (sort == null ? "tang" : "Giam") ;
    }
}
