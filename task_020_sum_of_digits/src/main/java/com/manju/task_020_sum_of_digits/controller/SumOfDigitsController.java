package com.manju.task_020_sum_of_digits.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumOfDigitsController {

    @RequestMapping(value ="/num",method= RequestMethod.GET)
    public String number(@RequestParam int number){
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return "sum:" +sum;
    }
}
