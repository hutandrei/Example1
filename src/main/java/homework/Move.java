package homework;

public abstract class Punct{
    public abstract void move();

    public void run() {
        Movable point = new MovablePoint(1,2,3,4);
        System.out.println(point);
    }
}
