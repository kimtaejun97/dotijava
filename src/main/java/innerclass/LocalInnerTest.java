package innerclass;

class Outer{
    public Runnable getRunnable(){
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 내부 클래스");
            }
        };
    }
}


public class LocalInnerTest {
    public static void main(String[] args){
        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable();
        runnable.run();

        outer.getRunnable().run();
    }
}
