package interfaceEX;

public class CalcTest {
    public static void main(String[] args){
        Calc.static_method();

        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();

        Sell seller = customer;
        seller.sell();

       


    }
}
