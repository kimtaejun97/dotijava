package ObjectEX;

class Point implements Cloneable{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x=" +x +"y="+y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneEX {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point pt = new Point(10,20);
        Point clonept = (Point)pt.clone();

        System.out.println(System.identityHashCode(pt));
        System.out.println(System.identityHashCode(clonept));

        System.out.println(pt.toString());
        System.out.println(clonept.toString());

    }


}
