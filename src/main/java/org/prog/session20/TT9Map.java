package org.prog.session20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TT9Map {
    public static void main(String[] args) {

        Map<String, List<String>> map = new HashMap<>();
        map.put("123456", new ArrayList<>());
        List<String> userJournal = map.get("113456");
        map.get("123456").add("FOP1");
        map.get("123456").add("FOP2");
        map.get("123456").add("FOP3");

        List<String> List1 = map.get("123456");
        for (String s: List1) {
            System.out.println("Citizen 123456 has : " + s);
        }



 /*       map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", null);
        map.put(null,"value4");

        System.out.println(map.get("key1"));
        System.out.println(map.get("key2"));
        System.out.println(map.get("key3"));
        System.out.println(map.get("key4"));
        System.out.println(map.get(null));

*/
    }
}
