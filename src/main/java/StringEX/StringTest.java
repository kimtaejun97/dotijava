package StringEX;

class Person{
    int name;
    int id;


}

public class StringTest {
    public static void main(String[] args){
        String str1 = new String("java ");
        String str2 = new String("programming");
        System.out.println(str1.hashCode());

        str1 = str1.concat(str2);

        System.out.println("java programming".hashCode());
        System.out.println(str1.hashCode());

        StringBuilder buff = new StringBuilder("Java");
        System.out.println(buff.hashCode()); //1915910607
        buff.append(" Programming");
        System.out.println(buff.hashCode()); //1915910607
        System.out.println(buff);




    }
}
