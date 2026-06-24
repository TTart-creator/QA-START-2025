package org.prog.session20;

import org.prog.session2.TT3;

public class Static {
    public static void main(String[] args) {
        TT3.wheelShape = "round";

        TT3 tcar = new TT3();
        tcar.color = "red";
//        tcar.goTo();

        TT3 scar = new TT3();


        System.out.println(tcar.wheelShape);
        System.out.println(scar.wheelShape);
        System.out.println(Math.max(10, 50));
    }
}


