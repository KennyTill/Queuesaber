package com.ktill.queuesaber.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SongModel {

    private final String trackName;
    private final String artistInfo;
    private final String trackID;
    private final String[] difficulties;
    private final Integer length;
}
