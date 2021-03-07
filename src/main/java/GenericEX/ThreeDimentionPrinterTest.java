package GenericEX;

import java.util.ArrayList;

public class ThreeDimentionPrinterTest {
    public static void main(String[] args){
        //제네릭 사용 x
        ThreeDimentionPrinter tdp = new ThreeDimentionPrinter();
        tdp.setMaterial(new Plastic());
        Plastic plastic1 = (Plastic)tdp.getMaterial();

        //제네릭 사용
        ThreeDimentionPrinter<Plastic> plasticprinter = new ThreeDimentionPrinter<Plastic>();
        plasticprinter.setMaterial(new Plastic());
        Plastic plastic2 = plasticprinter.getMaterial();

        ThreeDimentionPrinter<Powder> powderprinter = new ThreeDimentionPrinter<Powder>();
        powderprinter.setMaterial(new Powder());
        Powder powder = powderprinter.getMaterial();

        ThreeDimentionPrinter<Plastic> plt = new ThreeDimentionPrinter<>();
        var plt2 = new ThreeDimentionPrinter<Plastic>();

        ThreeDimentionPrinter printer = new ThreeDimentionPrinter();
        printer.setMaterial(new Plastic());
        Plastic plastic = (Plastic)printer.getMaterial();

        ArrayList list = new ArrayList();
        list.add(123);
        list.add("456");
        System.out.println((int)list.get(0));
        System.out.println(list.get(0).toString());

    }
}
