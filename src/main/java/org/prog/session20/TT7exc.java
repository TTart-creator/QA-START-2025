package org.prog.session20;

public class TT7exc {
    public static int counter = 0;

    public static void main(String[] args) {
        System.out.println("---------------------");
        smth1(false);
        System.out.println("---------------------");
        smth1(true);
        System.out.println("---------------------");
    }

    public static void smth1(boolean err) {
        try {
            System.out.println("Befor smth 2");
            smth2(err);
            System.out.println("After smth 2");

/*        } catch(ArithmeticException e) {
            System.out.println("AE EXCEPTION HERE!");
        } catch(RuntimeException e) {
            System.out.println("RT EXCEPTION HERE!");*/
        } catch(Exception e) {
            System.out.println("EXCEPTION HERE!");

        }  finally {

        }
    }

    public static void smth2(boolean err) {
        smth3(err);
    }

    public static void smth3(boolean err) {
        smth4(err);
    }

    public static void smth4(boolean err) {
        if (err) {
            throw new RuntimeException();
        } else {
            System.out.println("No error this time!");
        }
    }
}

