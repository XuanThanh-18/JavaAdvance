package InputOutput;

import java.io.*;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class FileReaderExample {

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

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}

