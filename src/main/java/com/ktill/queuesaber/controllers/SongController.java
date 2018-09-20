package com.ktill.queuesaber.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SongController {

    @GetMapping("/all")
    public String getSongs(){
        return "songs";
    }


}
