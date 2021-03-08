package IOStream.inputstream;

import java.io.IOException;
import java.util.Scanner;

public class SystemInTest {
    public static void main(String[] args){
        System.out.println("In : ");
        int i = 0;
        try{
            while((i = System.in.read()) !='\n')
                System.out.print((char)i);
        }catch(IOException e){
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int num = scanner.nextInt();

        System.out.println(line);
        System.out.println(num);


    }
}
