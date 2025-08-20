package com.manju.task_2_odd_or_even.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OddOrEvenController {

    @RequestMapping(value = "/num",method = RequestMethod.GET)
    public String num(@RequestParam int num){
        if (num % 2 ==0) {
            return "Even";
        } else  {
            return "Odd";
        }
    }
}
