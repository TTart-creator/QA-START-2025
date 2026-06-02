package org.prog.session20;

import java.util.Random;

public class TrainStatic {

    public static void main(String[] args) {
        Random rand = new Random();
        Train train = new Train();

        train.id = rand.nextInt(1000, 10000);

        String[] cities = new String[5];
            cities[0] = "Kyiv";
            cities[1] = "Kharkiv";
            cities[2] = "Odessa";
            cities[3] = "Lviv";
            cities[4] = "Konotop";

            train.destinations = cities[rand.nextInt(cities.length)];
            train.hours = rand.nextInt(24);
            train.minutes = rand.nextInt(60);

            System.out.println(train.id);
            System.out.println(train.destinations);
            System.out.println(train.hours);
            System.out.println(train.minutes);

    }
}
