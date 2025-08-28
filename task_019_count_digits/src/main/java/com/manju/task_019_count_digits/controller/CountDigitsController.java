package com.manju.task_019_count_digits.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountDigitsController {

    @RequestMapping(value = "/num", method = RequestMethod.GET)
    public String number(@RequestParam int number) {
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return "count:" +count;
    }
}
