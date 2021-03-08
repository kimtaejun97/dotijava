package IOStream.outputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args){
        try(java.io.FileOutputStream fos = new java.io.FileOutputStream("out.txt")){
            byte[] buff = {'B','C','D','E','F'};

            fos.write('A');
            fos.write(buff);
            fos.write(buff,1,3);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
