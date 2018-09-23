package com.ktill.queuesaber.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class SongModel {
    private final String songName;
    private final String authorName;
    private final String key;
    private final String[] difficulties;
}
