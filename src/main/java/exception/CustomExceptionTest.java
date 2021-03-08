package exception;

import java.util.ArrayList;

class CustomException extends Exception{
    public CustomException(String msg){
        super(msg);
    }
}

public class CustomExceptionTest{
    public static void main(String[] args) {
        ArrayList<Integer> numlist =new ArrayList<>();
        numlist.add(1);
        numlist.add(2);
        numlist.add(3);


        for(int i :numlist){
            if (i ==2){
                try{
                    throw new CustomException("Number is 2");

                }catch(CustomException e){
                    System.out.println(e);
                }
            }
        }

    }



}
