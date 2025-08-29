package com.manju.task_023_string_palindrome.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringPalindromeController {

    @RequestMapping(value = "/num", method = RequestMethod.GET)
    public String number(@RequestParam String original) {
        String reversed = "";
        int length = original.length();

        for (int i = length - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        if (original.equals(reversed)) {
            return "The string '" + original + "' is a Palindrome!";
        } else {
            return "The string '" + original + "' is NOT a Palindrome!";
        }
    }
}
