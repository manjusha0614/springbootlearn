package com.manju.task_011_factorial_number.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialOfNumberController {

    @RequestMapping(value = "/num",method = RequestMethod.GET)
    public String num(@RequestParam int number){
        long result = 1;

        for(int i=1;i<=number;i++) {
            result = result * i;
        }
        return "factorial of"+ number + " "+"is"+" "+result;
    }
}
