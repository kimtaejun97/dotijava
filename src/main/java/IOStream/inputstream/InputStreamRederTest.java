package IOStream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamRederTest {

    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("src/main/java/IOStream/a.txt"))) {
            int i = 0;
            while (((i = isr.read()) != -1)) {
                //한글 읽기 가능
                System.out.println((char)i);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

