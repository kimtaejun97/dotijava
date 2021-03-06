package interfaceEX;

public abstract class PSCalculator implements Calc {
    @Override
    public int plus(int num1, int num2) {
        return num1 +num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1-num2;
    }
}
