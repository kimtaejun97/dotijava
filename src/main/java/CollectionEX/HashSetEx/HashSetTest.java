package CollectionEX.HashSetEx;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();

        boolean firstA = set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        boolean secondA = set.add("aaa");

        System.out.println(firstA);
        System.out.println(secondA);
    }
}
