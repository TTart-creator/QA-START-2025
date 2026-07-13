package SessionTT;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.prog.session2.Car2;
import org.prog.session2.CarService;
import org.testng.asserts.Assertion;

import java.util.stream.Stream;

public class JunitTestTT {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Start");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Finish");
    }

/*     @BeforeEach
     public void setUp() {
         System.out.println("Comming SOOOOOnnnnn!");
     }*/

     @AfterEach
     public void setUp() {
        System.out.println("Done");
     }

    @Test
    public void test() {
        Car2 car = new Car2();
        CarService carService = new CarService();
        car.color = "red";
        carService.paintCar(car, "blue");
        Assertions.assertEquals("red", car.color, "Car color should be red!");
    }


    @ParameterizedTest
    @ValueSource(strings = {"red", "blue", "black"})
    /*    @MethodSource("argumentsStream")*/
    public void test1(String color) {
        Car2 car = new Car2();
        CarService carService = new CarService();
        car.color = "red";
        carService.paintCar(car, color);
        Assertions.assertEquals(color, car.color, "Car color should be" + color);
    }
    @ParameterizedTest
    @ValueSource(strings = {"red", "blue", "black"})
/*    @MethodSource("argumentsStream")*/
    public void test2(String color) {
        Car2 car = new Car2();
        CarService carService = new CarService();
        car.color = "red";
        carService.paintCar(car, color);
        Assertions.assertEquals(color, car.color, "Car color should be" + color);
    }

    @ParameterizedTest
    @ValueSource(strings = {"red", "blue", "black"})
    /*    @MethodSource("argumentsStream")*/
    public void test3(String color) {
        Car2 car = new Car2();
        CarService carService = new CarService();
        car.color = "red";
        carService.paintCar(car, color);
        Assertions.assertEquals(color, car.color, "Car color should be" + color);
    }


/*
    public static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of("blue");
                Arguments.of("red");
                Arguments.of("black");
*/

    }


