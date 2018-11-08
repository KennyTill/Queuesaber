package com.ktill.queuesaber.controllers;

import com.ktill.queuesaber.models.SongModel;
import com.ktill.queuesaber.services.SongService;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SongController {

    private SongService songService;

    @GetMapping("/all")
    public @ResponseBody String getSongs(@CookieValue(value = "queuesaberCookie", defaultValue = StringUtils.EMPTY) String queuesaberCookie){
        if (StringUtils.isBlank(queuesaberCookie)){
            //cookie not set, redirect to index page
            return "redirect:/index";
        }
        StringBuilder sb = new StringBuilder();
        List<SongModel> songs = songService.getSongs();

        for (SongModel song : songs) {
            sb.append(song.getSongName() + "\n");
        }
        return sb.toString();
//        return "songs";
    }


}
