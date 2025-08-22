package com.manju.task_010_sum_n_natural_numbers.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumOfNaturalNumbersController {

    @RequestMapping(value = "/num",method = RequestMethod.GET)
    public String number(@RequestParam int n){
        return "sum of n natural numbers:"+n*(n+1)/2;
    }
}
