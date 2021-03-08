import java.util.ArrayList;
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

public class Array {
    public static void main(String[] args){
        Person ps1 = new Person();
        Person ps2  =new Person();

        Person[] arr = new Person[] {ps1, ps2};
        Person[] arr2 = new Person[2];
        arr2=arr;
//        System.arraycopy(arr,0,arr2,0,arr.length);

//        int[] arr = new int[] {1,2,3};
//        int[] arr2 = new int[3];
//        System.arraycopy(arr,0,arr2,0,arr.length);


        System.out.println(arr.hashCode());
        System.out.println(arr2.hashCode());
        System.out.println(arr ==arr2);
        System.out.println(arr.equals(arr2));

        //Array List
        ArrayList<String> arl = new ArrayList<String>();
        ArrayList arl2 = new ArrayList();
        ArrayList<Short> arl3 = new ArrayList<Short>();
        ArrayList<Integer> arl4 = new ArrayList<Integer>();
        ArrayList<Float> arl5 = new ArrayList<Float>();
        ArrayList<Character> arl6 = new ArrayList<Character>();



        arl.add("kimtaejun");

        /*
        제네릭 타입을 명시하지 않으면 타입에 상관없이 추가가 가능하나
        권장되지 않음.
        데이터를 꺼내올 때 Object type으로 꺼내오게 됨.
        */
        arl2.add("kimtaejun");
        arl2.add(123);

        /*
        Object 타입으로 가져오기 때문에 String 변수에
        가져올 수 없음. String으로의 캐스팅이 필요함.
        */
        String s = arl2.get(0).toString();

        System.out.println(arl);
        System.out.println(arl2);
        System.out.println(arl2.size()); //length 필드가 아닌 size()메소드를 가지고있음.
        System.out.println(arl2.get(0)); //arl2[index]와 같이 접근 불가능.
        System.out.println(arl2.remove(0)); //제거한 데이터를 반환.
        System.out.println(s);

        


    }
}
