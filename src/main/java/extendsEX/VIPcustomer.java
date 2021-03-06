package extendsEX;

public class VIPcustomer extends Customer{

    public VIPcustomer(String name, int id) {
        super(name, id);
        this.bonus_ratio=0.2;
        this.grade="VIP";
        System.out.println("VIPcustomer 생성자 호출.");

    }

}
