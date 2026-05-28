package org.prog.session2;

import javax.xml.transform.Source;

public class TT3 {

    private String color;
    private String model;
    public String brand;
    public String refuel;
    private String destination;

    public static void main(String[] args) {

        TT3 tcar = new TT3();
        TT3 scar = new TT3();

        tcar.color = "red";
        tcar.brand = "3";
        scar.color = "black";
        tcar.destination = "Alabama";

        System.out.println(tcar.color);
        System.out.println(scar.color);
        System.out.println(tcar.brand);
        System.out.println(tcar.destination);

        tcar.goTo();
        scar.goTo();
    }

    public void goTo() {
        System.out.println(color + " " + destination + " car is going somewhere");
    }
}

