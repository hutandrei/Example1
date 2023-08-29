package org.example;

public class Car {
    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        if (speed>0) {
            this.speed = speed;
        }
        else {
            System.out.println("Speed value is wrong");
        }

    }
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }

    public void printInfo() {
    }
}
