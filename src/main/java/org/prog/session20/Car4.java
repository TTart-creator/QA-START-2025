package org.prog.session20;

public class Car4 {


    public String color;

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

