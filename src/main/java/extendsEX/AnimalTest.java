package extendsEX;

class Animal{
    public void who(){
        System.out.println("None");
    }
}
class Tiger extends Animal{
    public void who(){
        System.out.println("Tiger");
    }
}
class Eagle extends Animal{
    public void who(){
        System.out.println("Eagle");
    }
}
class Cat extends Animal{
    public void who(){
        System.out.println("Cat");
    }
}


public class AnimalTest {
    public static void main(String[] args){
        AnimalTest test = new AnimalTest();
        test.who(new Tiger());
        test.who(new Eagle());
        test.who(new Cat());
    }

    public void who(Animal animal){
        animal.who();
    }
}
