package extendsEX;

import extendsEX.Customer;
import extendsEX.VIPcustomer;

public class Market {
    public static void main(String[] args){
        VIPcustomer vc = new VIPcustomer("kimtaejn", 1234);
        vc.getGrade();

        Customer vc2 = new VIPcustomer("kim",1235);

    }
}
