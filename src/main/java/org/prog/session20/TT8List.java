package org.prog.session20;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TT8List {

    public static void main(String[] args) {
        List<String> stringList1 = new ArrayList<>();
        List<String> stringList2 = new LinkedList<>();

        stringList1.add("a");
        stringList1.add("b");
        stringList1.add("c");

        stringList2.add("d");
        stringList2.add("e");
        stringList2.add("f");

        stringList1.remove("a");
        System.out.println(stringList1.contains("a"));

    }
}
