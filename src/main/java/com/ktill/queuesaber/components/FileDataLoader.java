package com.ktill.queuesaber.components;

import com.ktill.queuesaber.models.SongModel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.ArrayUtils;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Primary
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class FileDataLoader implements DataLoader {

    private final String filePath;

    public List<SongModel> loadSongs() {
        List<SongModel> songs = new ArrayList<>(); //TODO make async collection
//        File file = new File(filePath);

        //get list of subdirectories in the song folder.
        Path installPath = Paths.get(filePath);

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(installPath)) {

            List<SongModel> collect = StreamSupport.stream(stream.spliterator(), false)
                    .map(Path::toFile)
                    .filter(File::isDirectory)
                    .map(x -> x.listFiles(File::isDirectory))
                    .filter(x -> !ArrayUtils.isEmpty(x))
                    .map(x -> x[0])
                    .map(File::getAbsolutePath)
                    .map(JSONFileInfoLoader::new)
                    .map(JSONFileInfoLoader::loadInfo)
                    .collect(Collectors.toList());
            return collect;


        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


    }
}
