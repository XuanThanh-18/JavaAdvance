package org.example.Faced;

public class AppTest {
    public static void main(String[] args) {
        String myVideo = "TranXuanThanh";
        String fomat = "MP4";
        VideoConverter converter = new VideoConverter();
        converter.convertVideoFile(myVideo, fomat);
    }
}
