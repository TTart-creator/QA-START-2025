package org.prog.session1;

import org.prog.session20.Car4;

public class ComparisonDemo {

    public static void main(String[] args) {
        Car1 myCar = new Car1();
        Car1 bobsCar = new Car1();
        Car1 aliceCar = new Car1();
        Car1 thatCar = myCar;

        myCar.color = "red";
        bobsCar.color = "red";
        aliceCar.color = "red";

        Car1[] cars1 = new Car1[3];
        Car1[] cars2 = new Car1[3];

        cars1[0] = myCar;
        cars1[1] = bobsCar;

        cars2[0] = thatCar;
        cars2[1] = aliceCar;
        System.out.println(cars1[0] == cars2[0]);
    }
}
