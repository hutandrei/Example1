package homework;

public class MovableCircle implements Movable{

    private MovablePoint centru;    //instance of MovablePoint class
    private int raza;               //field to declare circle radius




    //constructor
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int raza) {
        centru = new MovablePoint(x, y, xSpeed, ySpeed);
        this.raza=raza;
    }


    @Override
    public void moveUp() {

        centru.y += centru.ySpeed;
        System.out.printf("Am mutat centrul cercului de raza %d cu %d pe coordonata y la noua pozitie: {x=%d, y=%d}\n",raza, centru.ySpeed,centru.getX(),centru.getY());
    }

    @Override
    public void moveDown() {
        centru.y= centru.y- centru.ySpeed;
        System.out.printf("Am mutat centrul cercului de raza %d cu -%d pe coordonata y la noua pozitie: {x=%d, y=%d}\n",raza, centru.ySpeed,centru.x,centru.y);
    }

    @Override
    public void moveLeft() {
        centru.x= centru.x+centru.xSpeed;
        System.out.printf("Am mutat centrul cercului de raza %d cu %d pe coordonata x la noua pozitie: {x=%d, y=%d}\n",raza, centru.xSpeed,centru.x,centru.y);
    }

    @Override
    public void moveRight() {
        centru.x= centru.x-centru.xSpeed;
        System.out.printf("Am mutat centrul cercului de raza %d cu -%d pe coordonata x la noua pozitie: {x=%d, y=%d}\n",raza, centru.xSpeed,centru.x,centru.y);
    }

    @Override
    public String toString() {
        return "MovableCircle cu centrul la " +
                "coordonatele {X=" + centru.x+
                ", Y=" + centru.y+
                "}, raza = " + raza;

    }


}
