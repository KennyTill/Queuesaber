package com.ktill.queuesaber.components;

import com.ktill.queuesaber.models.SongModel;

import java.util.List;

public interface DataLoader {
    List<SongModel> loadSongs(String fileLocation);
}
