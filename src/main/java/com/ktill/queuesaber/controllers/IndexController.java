package com.ktill.queuesaber.controllers;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * Splash screen/index controller. This is the first page a user will see and it will allow them to set their username
 */
@Controller
public class IndexController {

    @GetMapping({"", "/", "index", "index.html"})
    public String getIndex(@CookieValue(name = "queuesaberCookie"
            , defaultValue = StringUtils.EMPTY) String queuesaberCookie){

        if (StringUtils.isBlank(queuesaberCookie)) {
            //cookie isn't set, show index template
            return "index";
        }

        return "redirect:/all";
    }

    @GetMapping("/login")
    public @ResponseBody String login(@RequestParam("userName") String userName, HttpServletResponse response){
        //set a cookie here with the user's display name
        response.addCookie(new Cookie("queuesaberCookie", userName));
        return "redirect:/all";
    }
}
