package IOStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("RAF.txt", "rw");
        raf.writeInt(100);
        raf.writeChar('a');
        raf.writeUTF("안녕하세요");

        //파일 포인터를 맨 앞으로.
        raf.seek(0);
        System.out.println(raf.readInt());
        System.out.println(raf.readChar());
        System.out.println(raf.readUTF());
    }
}