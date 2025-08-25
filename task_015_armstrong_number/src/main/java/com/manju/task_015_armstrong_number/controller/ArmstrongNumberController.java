package com.manju.task_015_armstrong_number.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArmstrongNumberController {

    @RequestMapping(value = "/num",method = RequestMethod.GET)
    public String num(@RequestParam int number ){
        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length();
        while (number > 0) {
            int digit = number % 10;
            result += Math.pow(digit, n);
            number = number / 10;
        }
        if (originalNumber == result) {
            return "The number " + originalNumber + " is an Armstrong number.";
        } else {
            return "The number " + originalNumber + " is NOT an Armstrong number.";
        }
    }
}