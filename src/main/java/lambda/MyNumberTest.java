package lambda;

public class MyNumberTest {
    public static void main(String[] args){
        MyNumber maxNum = (x,y) -> (x >=y)?x:y;
        int max = maxNum.getMaxNumber(10,20);

        MyNumber mn = new MyNumber() {
            @Override
            public int getMaxNumber(int x, int y) {
                return (x >=y)?x:y;
            }
        };
    }
}
