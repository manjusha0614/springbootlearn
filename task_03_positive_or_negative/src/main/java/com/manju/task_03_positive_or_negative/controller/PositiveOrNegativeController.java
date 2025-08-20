package com.manju.task_03_positive_or_negative.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PositiveOrNegativeController {
    @RequestMapping(value = "/num",method = RequestMethod.GET)
    public String num(@RequestParam int n){
        if(n>0){
            return "positive";
        }
        else if(n>0){
            return "negative";
        }
        else{
            return "zero";
        }
    }
}
