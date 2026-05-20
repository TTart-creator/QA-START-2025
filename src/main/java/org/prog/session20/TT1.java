package org.prog.session20;

public class TT1 {

    public static void main(String[] args) {
        int[] hotelRooms = new int[10];

        hotelRooms[0] = 2;
       hotelRooms[1] = 7;
       hotelRooms[2] = 3;
       hotelRooms[3] = 5;
        hotelRooms[4] = 4;
        hotelRooms[5] = 1;
        hotelRooms[6] = 6;
        hotelRooms[7] = 8;
       hotelRooms[8] = 9;
        hotelRooms[9] = 10;


        for (int i=0; i < hotelRooms.length; i++)

        System.out.println("Hotel Room " + i + " is " + hotelRooms[i]);

        String username = "admin";
        System.out.println(username + "@gmail.com");



        String email = "admin@gmail,com";
        String badEmail = "admin@@gmail.com";

        System.out.println(email.indexOf("@") == email.lastIndexOf("@"));
        System.out.println(badEmail.indexOf("@") == badEmail.lastIndexOf("@"));


    }

}