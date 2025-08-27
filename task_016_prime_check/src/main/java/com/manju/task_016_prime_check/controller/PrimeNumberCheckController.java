package com.manju.task_016_prime_check.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeNumberCheckController {

    @RequestMapping(value ="/num",method = RequestMethod.GET)
    public String number(@RequestParam int number){
    if (number <= 1) {
        return "The number " + number + " is NOT a Prime number.";
    }
        for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            return "The number " + number + " is NOT a Prime number.";
        }
    }
        return "The number " + number + " is a Prime number.";
}
}
