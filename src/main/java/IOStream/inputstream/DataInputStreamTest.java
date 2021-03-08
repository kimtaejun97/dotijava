package IOStream.inputstream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamTest {
    public static void main(String[] args){
        try(DataInputStream dis = new DataInputStream(new FileInputStream("out.txt"))){
            System.out.println(dis.read());
            System.out.println(dis.readInt());
            System.out.println(dis.readChar());
            System.out.println(dis.readUTF());
            System.out.println(dis.readUTF());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
