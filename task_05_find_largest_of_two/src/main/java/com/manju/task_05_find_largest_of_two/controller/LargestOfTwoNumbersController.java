package com.manju.task_05_find_largest_of_two.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LargestOfTwoNumbersController {

    @RequestMapping(value = "/numbers", method = RequestMethod.GET)
    public String num(@RequestParam int a,@RequestParam int b){
        if(a>b){
            return "a is largest:"+a;
        }
        else{
            return "b is largest:"+b;
        }
    }
}
