package com.manju.task_04_swap_two_numbers.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwapTwoNumbersController {
    @RequestMapping(value = "/num",method = RequestMethod.GET)
    public String num(@RequestParam int a,@RequestParam int b){
        int temp=a;
        a=b;
        b=temp;
        return "a:" +a+ "b:" + b ;
    }
}
