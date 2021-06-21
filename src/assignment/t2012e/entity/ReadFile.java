package assignment.t2012e.entity;

import assignment.t2012e.controller.StudentController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");

        // Ghi file
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String s = "test hello";
        fileOutputStream.write(s.getBytes());
        fileOutputStream.close();

        // nếu file chưa tồn tại thì tạo
        if (!file.exists()){
            file.createNewFile();
        }

        // Đọc dữ liệu từ file vào
        FileInputStream fileInputStream = new FileInputStream(file);

        int readTest = fileInputStream.read(); // ĐỌc từng ký tự trong file, ở đây là đọc ký tự đầu tiên và gán readTest
        while (readTest > 0){ // Đọc từ đầu đến cuối, từ dưới lên trên
            System.out.print((char)readTest);// vì trong java đều có 1 mã code đều là ký tự int nên mỗi ký tự phải ép kiểu char
            readTest = fileInputStream.read();
        }
        fileInputStream.close();
    }
}
