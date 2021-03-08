package IOStream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTEst {
    public static void main(String[] args){
        char a = 'A';
        char[] buff = {'B','C','D','E'};

        try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("out.txt"))){
            osw.write(a);
            osw.write(buff);
            osw.write(buff,1,2);
            osw.write("가나다라");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
