package com.ktill.queuesaber.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Splash screen/index controller. This is the first page a user will see and it will allow them to set their username
 */
@Controller
public class IndexController {

    //TODO: Check cookie for existing username

    //TODO: Set cookie after username is entered

    @GetMapping({"", "/", "index", "index.html"})
    public String getIndex(){
        return "index";
    }
}
