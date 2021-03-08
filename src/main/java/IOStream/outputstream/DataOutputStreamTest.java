package IOStream.outputstream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {
    public static void main(String[] args){
        try(DataOutputStream  dos = new DataOutputStream(new FileOutputStream("out.txt"))){
            dos.write(100);
            dos.writeInt(100);
            dos.writeChar('a');
            dos.writeUTF("hello");
            dos.writeUTF("가나다");



        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
