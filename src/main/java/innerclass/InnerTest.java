package innerclass;
class OutClass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inclass;


    public OutClass() {
        inclass = new InClass();
    }

    private class InClass {
        int inNum = 200;
//        OutClass의 인스턴스가 생성된 후에 생성될 수 있기 때문에 static으로 이용 불가능.
//        static int sInNum =100;

        void inTest() {
            System.out.println(num);
            System.out.println(sNum);
        }
    }

    public void usingInTest() {
        inclass.inTest();
    }

    static class InStaticClass {
        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
//            static class가 생성되었을 때, 생성되지 않았을수도 있는 변수에는 접근할 수 없다.
//            num+=10
            iNum += 20;
            sNum += 20;
            sInNum += 20;
        }

        static void sTest() {
//            static method가 호출되었을 때, 생성되지 않았을수도 있는 변수에는 접근할 수 없다.
//            num+=10
//            iNum+=20;
            sNum += 20;
            sInNum += 20;
        }
    }
}



public class InnerTest {
    public static void main(String[] args) {
        OutClass outclass = new OutClass();
        outclass.usingInTest();

        OutClass.InStaticClass.sTest();
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();
    }
}
