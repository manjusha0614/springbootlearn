package com.manju.task_017_primes_1_to_100.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeNumbersFrom1To100Controller {

    @RequestMapping(value ="/num",method = RequestMethod.GET)
    public String number(){
        StringBuilder result = new StringBuilder("Prime Numbers from 1 to 100: ");

        for (int number = 2; number <= 100; number++) {
            if (isPrime(number)) {
                result.append(number).append(" ");
            }
        }

        return result.toString();
    }
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
