package org.prog.session20;

public class TT5 {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = "abc";

/*        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());*/

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

    }
}
