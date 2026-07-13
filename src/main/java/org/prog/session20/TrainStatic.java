package org.prog.session20;

import java.util.Random;

public class TrainStatic {

    public static void main(String[] args) {

        String[] cities = new String[5];
        cities[0] = "Kyiv";
        cities[1] = "Kharkiv";
        cities[2] = "Odessa";
        cities[3] = "Lviv";
        cities[4] = "Konotop";

        Random rand = new Random();

        Train[] trains = new Train[50];

        for (int i = 0; i < trains.length; i++) {

            trains[i] = new Train();
            trains[i].id = rand.nextInt(1000, 10000);
            trains[i].destinations = cities[rand.nextInt(cities.length)];
            trains[i].hours = rand.nextInt(24);
            trains[i].minutes = rand.nextInt(60);
        }

        Clock clock = new Clock();
        clock.hour = 0;
        clock.minute = 0;

        /*    Random rand = new Random();*/


/*
      System.out.println(train.id);
        System.out.println(train.destinations);
        System.out.println(train.hours);
        System.out.println(train.minutes);*/

        for (int i = 0; i < 1440; i++) {
            clock.tick();
            for (int j = 0; j < trains.length; j++) {
                if (clock.hour == trains[j].hours && clock.minute == trains[j].minutes) {
                    System.out.println(" Train " + trains[j].id + " departs to " + " " + trains[j].destinations +
                            " at " + clock.hour + ":" + clock.minute);
                    break;
                }

            }

        }

    }
}
