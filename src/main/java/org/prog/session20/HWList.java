package org.prog.session20;

import org.prog.session1.Car;

import java.util.HashMap;
import java.util.Map;

public class HWList {

        public static void main(String[] args) {

            Car car1 = new Car("BMW");
            Car car2 = new Car("Audi");
            Car car3 = new Car("Toyota");

            String owner1 = "John";
            String owner2 = "Mary";
            String owner3 = "Alex";

            // Map with owners as keys and cars as values
            Map<String, Car> ownerCars = new HashMap<>();

            ownerCars.put(owner1, car1);
            ownerCars.put(owner2, car2);
            ownerCars.put(owner3, car3);

            // Assign random color to each car
            for (Car car : ownerCars.values()) {
                car.setColor(randomColor());
            }

            // Print result
            ownerCars.forEach((owner, car) ->
                    System.out.println(owner + " owns " + car));
        }

        public static String randomColor() {
            String[] colors = {"Red", "Blue", "Black", "White", "Green"};
            int index = (int) (Math.random() * colors.length);
            return colors[index];
        }
    }

