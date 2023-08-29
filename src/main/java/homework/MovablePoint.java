package homework;

public class MovablePoint implements Movable{

    int x;
    int y;
    int xSpeed;
    int ySpeed;

    //contructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }



    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void moveUp() {
        y=y+ySpeed;
        System.out.printf("Ne-am mutat cu %d pe coordonata y la noua pozitie: {x=%d, y=%d}\n",ySpeed,x,y);
    }

    @Override
    public void moveDown() {
        y=y-ySpeed;
        System.out.printf("Ne-am mutat cu -%d pe coordonata y la noua pozitie: {x=%d, y=%d}\n",ySpeed,x,y);

    }

    @Override
    public void moveLeft() {
        x=x+xSpeed;
        System.out.printf("Ne-am mutat cu %d pe coordonata x la noua pozitie: {x=%d, y=%d}\n",xSpeed,x,y);
    }

    @Override
    public void moveRight() {
        x=x-xSpeed;
        System.out.printf("Ne-am mutat cu -%d pe coordonata x la noua pozitie: {x=%d, y=%d}\n",xSpeed,x,y);
    }

    @Override
    public String toString() {
        return "MovablePoint cu coordonatele {" +
                "x=" + x +
                ", y=" + y +
                "} si se poate deplasa cu {xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
