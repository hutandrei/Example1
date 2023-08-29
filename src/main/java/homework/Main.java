package homework;

public class Main {
    public static void main(String[] args) {

        Move mutaPunctul =new MovePoint();
        Move mutaCercul = new MoveCircle();
        mutaPunctul.initial();
        mutaPunctul.moveIt();
        mutaCercul.initial();
        mutaCercul.moveIt();
    }
}
