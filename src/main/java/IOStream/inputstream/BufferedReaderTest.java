package IOStream.inputstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
    public static void main(String[] args){
        String str =null;
        try(BufferedReader bfr = new BufferedReader(new FileReader("out.txt"))){
            while((str = bfr.readLine()) != null){
                System.out.println(str);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
