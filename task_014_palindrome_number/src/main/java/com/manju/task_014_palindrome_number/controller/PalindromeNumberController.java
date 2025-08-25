package com.manju.task_014_palindrome_number.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromeNumberController {

    @RequestMapping(value = "/num",method = RequestMethod.GET)
    public String number(@RequestParam int number){
        int reversed = 0;
        int originalNumber = number;
        while (number > 0) {
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number / 10;
        }
        if (originalNumber == reversed) {
            return "The number " + originalNumber + " is a Palindrome.";
        } else {
            return "The number " + originalNumber + " is NOT a Palindrome.";
        }
    }
}

