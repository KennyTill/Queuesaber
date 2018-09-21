package com.ktill.queuesaber.controllers;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Splash screen/index controller. This is the first page a user will see and it will allow them to set their username
 */
@Controller
public class IndexController {

    @GetMapping({"", "/", "index", "index.html"})
    public String getIndex(@CookieValue(name = "queuesaberCookie", value = "playerName", required = false) String playerName){
        if (StringUtils.isBlank(playerName)) {
            return "index";
        }
        return "songs";
    }
}
