package org.mytools.myslasses;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Car myCar = new Car( wheelCount: 3, brand: "mercedes");
        Car myCar2 = new Car();

        System.out.println(myCar.toString());
        System.out.println(myCar2.toString());

        myCar.doBlink();

        System.out.println("myCar: " + myCar.getWheelCount() + " wheels!");
        System.out.println("myCar is: " + myCar.getWheelCount());

        System.out.println("myCar2: " + myCar2.getWheelCount() + " wheels!");
        System.out.println("myCar2 is: " + myCar2.getWheelCount());

        //myCar.similarCar.doBlink();
        //myCar.similarCars[]

        myCar2.doBlink();

    }
}
