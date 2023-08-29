package point2D;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Point2D prim = new Point2D(3,5);
       // System.out.println(Arrays.toString(prim.getXY()));
       // System.out.println(prim.getXY().toString());


        prim.setX(1);
        prim.setY(2);
        System.out.println(Arrays.toString(prim.getXY()));
        System.out.println(prim.toString(3,5));

    }
}
