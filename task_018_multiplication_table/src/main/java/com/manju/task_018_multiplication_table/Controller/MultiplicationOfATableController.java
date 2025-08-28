package com.manju.task_018_multiplication_table.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplicationOfATableController {

    @RequestMapping(value ="/num",method = RequestMethod.GET)
    public String number(@RequestParam int num) {
        StringBuilder result = new StringBuilder("Multiplication Table of " + num + ": ");

        for (int i = 1; i <= 10; i++) {
            result.append(num).append(" * ").append(i).append(" = ").append(num * i).append(" ");
        }

        return result.toString();
    }
}
