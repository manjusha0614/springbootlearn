package com.manju.task_07_simple_interest_calculator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleIntrestCalculatorController {

    @RequestMapping(value = "/numbers",method = RequestMethod.GET)
    public String num(@RequestParam int p,@RequestParam int t,@RequestParam int r){
        int simpleintrest = p*t*r/100;
        return "simpleintrest:" +p*t*r/100;
    }
}
