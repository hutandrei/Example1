package interfaces;

public class Circle implements Shape, Shape3D {
    double pi=3.14;
    int raza;

    @Override
    public double getArea() {
        return pi*raza*raza;
    }

    @Override
    public void draw() {

    }


//
//
//    @Override
//    public void rollAround() {
//        System.out.println("Rolls very quick");
//    }
//
//    @Override
//    public void rollAroundIn3D() {


}