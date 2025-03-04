package GSonExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
public class GsonDataReader {
    public static void main(String[] args) throws FileNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL resource = classLoader.getResource("Data.json");

        if (resource == null) {
            System.out.println("File không tồn tại trong classpath!");
            return;
        }

        // Giải mã đường dẫn
        String filePath = URLDecoder.decode(resource.getFile(), StandardCharsets.UTF_8);
        File file = new File(filePath);

        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Employee>>() {}.getType();

        FileReader fileReader = new FileReader(file.getPath());
        List<Employee> employees = gson.fromJson(fileReader, listType);

        for(Employee employee : employees){
            System.out.println(employee.Fullname);
            System.out.println(employee.Major);
            System.out.println(employee.ExperienceYear);
        }

    }
}
