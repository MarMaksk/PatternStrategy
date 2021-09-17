package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main {


    public static void main(String[] args) {
        Collection gf = new GetFromConsoleInteger().getData(new HashSet<>(), 5);
        gf.forEach(System.out::println);
        Collection gs = new GetFromConsoleString().getData(new ArrayList<>(), 5);
    }
}
