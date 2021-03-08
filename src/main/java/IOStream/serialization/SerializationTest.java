package IOStream.serialization;

import java.io.*;

class Person implements Serializable {

    String name;
    transient String title;
    public Person(){}
    public Person(String name, String title){
        this.name =name;
        this.title = title;
    }

    public String toString(){
        return name +","+title;
    }
}

public class SerializationTest {
    public static void main(String[] args){
        Person p1 = new Person("kim", "Manager");
        try(ObjectOutputStream  oos = new ObjectOutputStream(new FileOutputStream("serial.dat"))){
            oos.writeObject(p1);
        }catch(IOException e){
            e.printStackTrace();
        }

        try(ObjectInputStream  oos = new ObjectInputStream(new FileInputStream("serial.dat"))){
           Object obj =  oos.readObject();
           if( obj instanceof Person)
               obj = (Person)obj;
           System.out.println(obj);
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }



    }
}
