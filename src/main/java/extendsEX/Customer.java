package extendsEX;

public class Customer {
    protected String name;
    protected int id;
    protected String grade;
    protected double bonus_ratio;

    public Customer(){
        System.out.println("Customer() 생성자 호출");
    }

    public Customer(String name, int id){
        grade = "SILVER";
        bonus_ratio = 0.1;
        this.name = name;
        this.id = id;
        System.out.println("Customer(String int) 생성자 호출.");

    }
    public void getGrade(){
        System.out.println("등급: "+this.grade);
    }

}
