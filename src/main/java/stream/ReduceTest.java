package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

    @Override
    public String apply(String s1, String s2) {
        if(s1.getBytes().length >= s2.getBytes().length){
            return s1;
        }
        else return s2;
    }
}

public class ReduceTest {
    public static void main(String[] args){
        String[] str = {"Hello", "Hello~~~~~~", "Good morning"};

        //lambda식을 이용한 구현.
        String longStr = Arrays.stream(str).reduce("",(s1,s2)->{
            if(s1.getBytes().length >= s2.getBytes().length){
                return s1;
            }
            else return s2;
        });

        System.out.println(longStr);

        //BinaryOperator interface를 구현한 클래스를 이용.
        String longStr2 = Arrays.stream(str).reduce("",new CompareString());
        System.out.println(longStr2);

        String longStr3 = Arrays.stream(str).reduce(new CompareString()).get();
        System.out.println(longStr3);

    }
}
