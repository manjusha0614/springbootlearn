package com.manju.task_08_check_leap_year.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeapYearController {

    @RequestMapping(value = "/num", method = RequestMethod.GET)
    public String num(@RequestParam int n) {
        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
            return "is a leap year";
        }
        else{
           return "not a leap year";
        }
    }

}
