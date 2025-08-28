package com.manju.task_022_reverse_string.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RevereseaStringController {

    @RequestMapping(value = "/num", method = RequestMethod.GET)
    public String number(@RequestParam String original){
        StringBuilder reversed= new StringBuilder(" ");
        int length = original.length();
        for(int i=length-1;i>=0;i--){
            reversed.append(original.charAt(i));

        }
        return "reversed:" +reversed;
    }
}
