package ObjectEX;

class Person{
    String name;

    public Person(){
        this("None");
    }
    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isTrue = false;
        Person ps = (Person)obj;
        if (this.name == ps.getName())
            isTrue = true;
        return isTrue;
    }

}


public class Over_equals {

    public int add(int num1, int num2){
        return num1+num2;
    }
    public int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public float add(float num1, float num2, float num3){
        return num1+num2+num3;
    }


    public static void main(String[] args){
        Person ps = new Person("taejun");
        Person ps2 = new Person("taejun");
        String str1 = "kimtaejun";
        String str2 = "kimtaejun";
        String str3 = new String("kimtaejun");



        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println("kimtaejun".hashCode());
        System.out.println(str3.hashCode());
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode("kimtaejun"));
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        System.out.println(ps);
        System.out.println(ps2);







    }
}
