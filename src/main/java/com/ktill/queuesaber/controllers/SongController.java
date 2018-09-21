package com.ktill.queuesaber.controllers;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SongController {

    @GetMapping("/all")
    public String getSongs(@CookieValue(value = "queuesaberCookie", defaultValue = StringUtils.EMPTY) String queuesaberCookie){
        if (StringUtils.isBlank(queuesaberCookie)){
            //cookie not set, redirect to index page
            return "redirect:/index";
        }
        return "songs";
    }


}
