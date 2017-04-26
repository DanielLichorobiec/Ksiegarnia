package org.mytools.myslasses;

/**
 * Created by admin on 26.04.2017.
 */
public class Car {

    int wheelCount = 4;
    String brand = "skoda";

    Car[] similarCars = new Car[10];

    //Car similarCar = new Car();
    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Car[] getSimilarCars() {
        return similarCars;
    }

    public void setSimilarCars(Car[] similarCars) {
        this.similarCars = similarCars;
    }

    Car() {
        wheelCount = 9;
        brand = "star";
        System.out.println("in constructor");
    }

    public Car(int wheelCount, String brand) {
        this.wheelCount = wheelCount;
        this.brand = brand;
    }

    void doBlink() {
        System.out.println("blink blink!");
    }

}
