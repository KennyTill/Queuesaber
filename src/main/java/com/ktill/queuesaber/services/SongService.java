package com.ktill.queuesaber.services;

import com.ktill.queuesaber.components.DataLoader;
import com.ktill.queuesaber.models.SongModel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor()
public class SongService {
    private final DataLoader loader;
    @Getter
    private List<SongModel> songs = new ArrayList<>();

    @PostConstruct
    public void init(){
        this.songs = loader.loadSongs();
    }



}
