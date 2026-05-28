package org.prog.session4;

import org.prog.session20.Car4;

public class Session4 {

    /**
     *
     * ############################
     * ###############10###########
     * ############################
     * ############################
     * @param args
     */

    public static void main(String[] args) {
        Car4 car1 = new Car4();
        car1.color = "red";
        Car4 car2 = new Car4();
        car2.color = "red";

//        String s1 = "red";
//        String s2 = "red";
//
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());

        System.out.println(car1.equals(car2));
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

        System.out.println(car1.toString());
        System.out.println(car2.toString());


    }
}
