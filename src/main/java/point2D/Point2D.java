package point2D;

import java.util.List;

public class Point2D {
    float x;
    float y;

    public Point2D() {
        x=0;
        y=0;
    }

    public Point2D(float x, float y){

    }

    float getX() {
        return x;
    }
    float getY() {
        return y;
    }

    float [] getXY(){
        float array[]= {x, y};
        return array;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    String toString (float x, float y){
        return ("("+x+","+y+")");
    }
}
