package com.logicbig.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyMvcController {

    @RequestMapping(value = "/abc", method = RequestMethod.GET)
    public String prepareView() {
        return "my-page";
    }
}