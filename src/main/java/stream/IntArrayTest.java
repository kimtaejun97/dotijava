package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5};

        IntStream is = Arrays.stream(arr);
        int sum = is.sum();
        int sum2 = is.sum();
        System.out.println(sum);


    }
}
