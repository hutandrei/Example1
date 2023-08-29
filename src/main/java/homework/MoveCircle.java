package homework;

public class MoveCircle extends Move{

    Movable point = new MovableCircle(2,2,1,1,10);
    @Override
    public void moveIt() {
        System.out.println(point);
        point.moveUp();
        point.moveRight();
        point.moveDown();
        point.moveLeft();
    }

}
