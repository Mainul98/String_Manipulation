package json_file_manipulation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Read {
    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("./src/main/resources/test.txt");
        //System.out.println(reader.read());
       // int r = reader.read();
        //System.out.println((char)r);
        int character;
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
        reader.close();

    }
}
