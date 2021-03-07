package ClassEX;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

class Person{
      public int id;
      protected String name;

    public Person(String name){
        this.name = name;
    }
    Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }
}

public class classEX {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person("kim");

        System.out.println(person.getName());
        Class cls1 = person.getClass();
        Class cls2 = Person.class;
        Class cls3 = Class.forName("Study.ClassEX.Person"); //동적 로딩

        Constructor[] cons = cls3.getConstructors();
        for (Constructor c : cons){
            System.out.println(c);
        }

        Field[] fields = cls3.getFields();
        for (Field f : fields){
            System.out.println(f);

        }

    }
}
