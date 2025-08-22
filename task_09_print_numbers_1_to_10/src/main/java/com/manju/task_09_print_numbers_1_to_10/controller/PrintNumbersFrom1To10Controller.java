package com.manju.task_09_print_numbers_1_to_10.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrintNumbersFrom1To10Controller {
    @RequestMapping(value = "/num",method = RequestMethod.GET)
    public String num( ){
        StringBuilder result = new StringBuilder("Numbers from 1 to 10: ");
        for(int i=1;i<=10;i++) {
            result.append(i).append(" ");

        }
        return result.toString();
    }
}
