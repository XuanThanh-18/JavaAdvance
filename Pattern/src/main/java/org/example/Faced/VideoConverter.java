package org.example.Faced;

import org.example.Decorator.Coffee;

public class VideoConverter {
    public void convertVideoFile(String filename,String format){
        VideoFile videoFile = new VideoFile();
        videoFile.readVideoFile();
        BitrateReader bitrateReader = new BitrateReader();
        bitrateReader.readBitrateFile(filename);
        CodecFactory codecFactory = new CodecFactory();
        SaveVideoFile saveVideoFile = new SaveVideoFile();
        saveVideoFile.saveVideoFile(filename);
    }
}
