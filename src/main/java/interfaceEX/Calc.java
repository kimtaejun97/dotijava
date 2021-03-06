package interfaceEX;

public interface Calc {
    double PI = 3.141592;

    int plus(int num1, int num2);
    int substract(int num1, int num2);
    int multiply(int num1, int num2);
    int divide(int num1, int num2);

    static void static_method(){
        System.out.println("static method");
    }
    private void private_method(){
        System.out.println("interface내부에서만 이용하는 메소드");
    }
    default void default_method(){
        System.out.println("implements 한 class에서 오버라이딩 가능");
    }

}
