package org.prog.session22;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class HomeWorktt {

        @Test
        public void test() {

            Set<String> set = new HashSet<>();
            set.add("A");
            set.add("A");
            System.out.println( set.size());

        }
    }
