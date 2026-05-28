package org.prog.session20;

public class Plane {
    private String count;
    private String name;
    private String maxcount;

    public static void main(String[] args) {
        Plane currentpassengers = new Plane();
        Plane maxpassengers = new Plane();
        Plane flightID = new Plane();

        currentpassengers.count = "five";
        maxpassengers.count = "ten";
        flightID.name = "AA-1001";

        System.out.println(currentpassengers.count);
        System.out.println(maxpassengers.count);
        System.out.println(flightID.name);

    }
}