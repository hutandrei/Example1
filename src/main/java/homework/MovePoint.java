package homework;

public class MovePoint extends Move {

    Movable point = new MovablePoint(5,5,2,3);

    @Override
    public void moveIt() {
        System.out.println(point);
        point.moveUp();
        point.moveLeft();
        point.moveDown();
        point.moveRight();

    }


}

