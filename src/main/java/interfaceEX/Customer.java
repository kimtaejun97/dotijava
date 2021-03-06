package interfaceEX;

public class Customer implements Buy,Sell {
    @Override
    public void buy() {
        System.out.println("Buy");
    }

    @Override
    public void sell() {
        System.out.println("Sell");
    }
}
