package com.deniszacharov;

import java.util.HashSet;
import java.util.Set;

public class DifferentString {
    public  int differentChar(String a, String b) {

        Set stringA = new HashSet();
        Set stringB = new HashSet();
        if (stringA.size() != stringB.size()) {
            return -1;
        }
        for (int i : a.toCharArray()) {
            stringA.add(String.valueOf(i));
        }
        for (int i : b.toCharArray()) {
            stringB.add(String.valueOf(i));
        }
        if (stringA.equals(stringB)) {
            return 0;
        }

        if (stringA.size() >= stringB.size()) {
            stringA.removeAll(stringB);
            return stringA.size();
        } else {
            stringB.removeAll(stringA);
            return stringB.size();
        }
    }
}
