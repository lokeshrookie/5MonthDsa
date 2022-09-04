package Tutorial;

import java.io.*;
import java.io.IOException;
import java.util.logging.FileHandler;

public class file extends FileHandler {
    public file() throws IOException, SecurityException {
    }

    public file(String pattern) throws IOException, SecurityException {
        super(pattern);
    }

    public file(String pattern, boolean append) throws IOException, SecurityException {
        super(pattern, append);
    }

    public file(String pattern, int limit, int count) throws IOException, SecurityException {
        super(pattern, limit, count);
    }

    public file(String pattern, int limit, int count, boolean append) throws IOException, SecurityException {
        super(pattern, limit, count, append);
    }

    public file(String pattern, long limit, int count, boolean append) throws IOException {
        super(pattern, limit, count, append);
    }

    public static void main(String[] args) throws IOException {
        File f = new File("hello.txt");
        boolean value = f.createNewFile();
        if(value){
            System.out.println("File is created");
        }
        else{
            System.out.println("File is not created");
        }

        FileReader reader = new FileReader(f);

        System.out.println(reader.read());





    }
}
