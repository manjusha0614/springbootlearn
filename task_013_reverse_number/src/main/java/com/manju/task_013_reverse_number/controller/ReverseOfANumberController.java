package com.manju.task_013_reverse_number.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseOfANumberController {

    @RequestMapping(value = "/num",method = RequestMethod.GET)
    public String num(@RequestParam int number){
        int reversed=0;
        while(number>0){
            int reminder=number%10;
            reversed=reversed*10+reminder;
            number=number/10;
        }
        return "reversed:" +reversed;
    }
}
