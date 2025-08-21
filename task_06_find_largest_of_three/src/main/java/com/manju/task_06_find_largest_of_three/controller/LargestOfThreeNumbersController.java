package com.manju.task_06_find_largest_of_three.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LargestOfThreeNumbersController {

    @RequestMapping(value = "/numbers",method = RequestMethod.GET)
    public String num(@RequestParam int a,@RequestParam int b,@RequestParam int c){
        if(a>b&&a>c){
            return "a is largest:"+a;
        }
        else if(b>c&&b>a){
            return "b is largest:"+b;
        }
       else {
           return "c is largest:"+c;
        }
    }
}
