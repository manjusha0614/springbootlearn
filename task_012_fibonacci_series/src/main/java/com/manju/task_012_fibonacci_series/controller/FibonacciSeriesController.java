package com.manju.task_012_fibonacci_series.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciSeriesController {
    @RequestMapping(value = "/num",method = RequestMethod.GET)
    public String num(@RequestParam int n){
        int first =0;
        int second =1;
        StringBuilder result = new StringBuilder("Fibonacci series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            result.append(first).append(" ");
            int next = first + second;
            first = second;
            second = next;
        }
        return result.toString();
    }
}
