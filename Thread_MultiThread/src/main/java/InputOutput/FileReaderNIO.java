package InputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.nio.file.Files;
public class FileReaderNIO {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL resource = classLoader.getResource("MyProfile.txt");

        if (resource == null) {
            System.out.println("File không tồn tại trong classpath!");
            return;
        }

        // Giải mã đường dẫn
        String filePath = URLDecoder.decode(resource.getFile(), StandardCharsets.UTF_8);
        File file = new File(filePath);

        List<String> line = Files.readAllLines(file.toPath());
        line.forEach(System.out::println);

//        Files.writeString(Path.of(file.getPath()) , "\n anh yeu em ", StandardOpenOption.APPEND);
//        Files.writeString(Path.of(file.getPath()) , "\n anh yeu em ", StandardOpenOption.CREATE);
    }
}
