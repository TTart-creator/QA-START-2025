package org.prog.session20;

import java.util.Random;
import java.util.UUID;

public class Plane {
    public String count;
    public String name;
    public String maxcount;

    public static void main(String[] args) {
        Plane currentpassengers = new Plane();
        Plane maxpassengers = new Plane();
        Plane flightID = new Plane();

        currentpassengers.count = "five";
        maxpassengers.count = "ten";
        flightID.name = "AA-1001";


/*        System.out.println(UUID.randomUUID().toString());
        Random random = new Random();
        random.nextInt(10);
        for (int i = 0; i < 50; i++) {
            System.out.println(random.nextInt(100, 200));
        }*/



       System.out.println(currentpassengers.count);
        System.out.println(maxpassengers.count);
        System.out.println(flightID.name);
    }
    }
