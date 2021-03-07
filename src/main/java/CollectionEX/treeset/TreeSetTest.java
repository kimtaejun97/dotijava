package CollectionEX.treeset;

import CollectionEX.Member;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

    @Override
    public int compare(String str1, String str2) {
        //내림 차순 정렬
        return str2.compareTo(str1);
    }
}

public class TreeSetTest {
    public static void main(String[] args){
        TreeSet<String> treeset = new TreeSet<>();

        treeset.add("Kim");
        treeset.add("Pakr");
        treeset.add("Lee");

        System.out.println(treeset);  //Kim, Lee, Park
        //String class 에서는 Comparable이 이미 구현되어있음. 기본적으로 오름차순 정렬.

        //Comparator 인터페이스의 compare 메소드를 구현
        TreeSet<String> treeset2 = new TreeSet<String>(new MyCompare());

        treeset2.add("Kim");
        treeset2.add("Pakr");
        treeset2.add("Lee");

        System.out.println(treeset2);  //Park, Lee, Kim
    }
}
