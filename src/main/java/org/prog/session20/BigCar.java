package org.prog.session20;

import org.prog.session2.TT3;

public class BigCar extends TT3 {


   public static void main(String[] args) {
       BigCar TT3 = new BigCar();
        TT3.color = "red";
       TT3.model = "Fiat";

       TT3.goTo();
       System.out.println(TT3.carDescription());
    }

   private void goTo() {
    }

    private String carDescription() {
        return "ohuennaya tachka";
    }
}
