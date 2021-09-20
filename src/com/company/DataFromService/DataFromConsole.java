package com.company.DataFromService;

import com.company.Interface.DataFrom;

import java.util.Collection;
import java.util.Scanner;

public class DataFromConsole implements DataFrom {
    private Scanner sc = new Scanner(System.in);


    public Collection getData(Collection<String> collection) {
        int i = 0;
        while (i < 3) {
            collection.add(sc.nextLine());
            i++;
        }
        return collection;
    }
}