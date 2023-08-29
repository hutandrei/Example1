package interfaces;

public class Rectangle implements Shape{

    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");

    }
}
