package IOStream.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args){
        int i = 0;
        byte[] buff = new byte[5];
        try{
            File file = new File("src/main/java/IOStream/a.txt");
            FileInputStream fis = new FileInputStream(file);
            while((i = fis.read()) !=-1)
                System.out.println((char)i);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
