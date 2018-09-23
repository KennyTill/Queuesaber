package com.ktill.queuesaber.components;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ktill.queuesaber.models.SongModel;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JSONDataLoader implements DataLoader {

    public List<SongModel> loadSongs(String fileLocation) {
        //magic goes here.
        List<SongModel> songs = new ArrayList<>();

        try{
            //reading the file and loading it
            File file = new File(fileLocation);
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            TypeReference<Map<String, SongModel>> typeReference = new TypeReference<Map<String, SongModel>>() {};

            Map<String, SongModel> songMap = mapper.readValue(file, typeReference);
            songs.addAll(songMap.values());
        } catch (IOException ex){
            String message = String.format("Unable to read file at [%s]", fileLocation);
            throw new RuntimeException(message, ex);
        }

        return songs;
    }
}
