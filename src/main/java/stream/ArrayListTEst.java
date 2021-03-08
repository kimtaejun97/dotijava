package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListTEst {
    public static void main(String[] args){
        ArrayList<String> sList = new ArrayList<>();

        sList.add("kim");
        sList.add("park");
        sList.add("Lee");

        Stream<String> stream  = sList.stream();
//        for( String s : sList)
//            System.out.println(s);
        stream.forEach(s->System.out.println(s));
        sList.stream().sorted().forEach(s ->System.out.println(s));
    }
}
