package com.ktill.queuesaber;

import com.ktill.queuesaber.components.DataLoader;
import com.ktill.queuesaber.components.JSONDataLoader;
import com.ktill.queuesaber.models.SongModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class queuesaberApplication {
    public static void main(String[] args){
        SpringApplication.run(queuesaberApplication.class, args);
        DataLoader dataLoader = new JSONDataLoader();
        List<SongModel> songs = dataLoader.loadSongs("/Users/kennethtill/records.json");
        System.out.println(songs.size());
    }
}
