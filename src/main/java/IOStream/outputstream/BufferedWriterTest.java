package IOStream.outputstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
    public static void main(String[] args){
        char[] ch = {'b','c','d','e'};
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"))){
            bw.write('a');
            bw.write("가나다ABC");
            bw.write("ABCDEF",0,3);
            bw.write(ch);
            bw.write(ch,0,2);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
