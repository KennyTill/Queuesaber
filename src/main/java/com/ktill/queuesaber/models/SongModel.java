package com.ktill.queuesaber.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class SongModel {
    private final String songName;
    private final String songSubName;
    private final String authorName;
    private final Integer beatsPerMinute;
    private final String coverImagePath;
    private final DifficultyLevels[] difficultyLevels;
}
