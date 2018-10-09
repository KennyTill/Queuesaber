package com.ktill.queuesaber.components;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ktill.queuesaber.models.SongModel;
import lombok.RequiredArgsConstructor;

import java.io.File;

@RequiredArgsConstructor
public class JSONFileInfoLoader {

    private final String fileLocation;

    public SongModel loadInfo() {
        File file = new File(fileLocation + "/info.json");
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
           SongModel song = mapper.readValue(file, SongModel.class);
           return song;
        } catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
