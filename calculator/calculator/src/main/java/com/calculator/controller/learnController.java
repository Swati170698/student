package com.calculator.controller;

import com.calculator.dto.CalRequest;
import com.calculator.service.LearnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/learn")
@RestController
public class learnController {

    @Autowired
    LearnService service;

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome Swati Madam Aapka Swagat Hai";
    }

    @PostMapping("/add")
    public int add(@RequestParam int a, @RequestParam("b") int num2){
        return a+num2;
    }

    @PostMapping("/add2")
    public int add2(@RequestBody CalRequest request){

       return 0;
    }

}
