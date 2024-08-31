package com.calculator.controller;

import com.calculator.dto.CalRequest;
import com.calculator.dto.CalResponse;
import com.calculator.service.exService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class calController {

    @Autowired
    exService exService;

    @GetMapping("/home")
    public String home(){
        return "welcome to our app";
    }

    @PostMapping("/add")
    public CalResponse add(@RequestParam int a, @RequestParam("b") int num2){
        return exService.add(a,num2);
    }

    @PostMapping("/add2")
    public CalResponse add2(@RequestBody CalRequest cal){
       return exService.add2(cal);
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "Aapka Swagat Hai";
    }


}
