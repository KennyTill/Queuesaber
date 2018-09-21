package com.ktill.queuesaber.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class SongModel {

    private final String trackName;
    private final String artistInfo;
    private final String trackID;
    private final String[] difficulties;
    private final Integer length;
}
