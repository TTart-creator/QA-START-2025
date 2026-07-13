package SessionTT;

import org.prog.session1.Car;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HomeWorkTestNG_TT {

        @Test
        public void test(String[] args) {

            Set<String> set = new HashSet<>();
            set.add("A");
            set.add("A");
            System.out.println( set.size());

        }
}