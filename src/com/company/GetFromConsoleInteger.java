package com.company;

import com.company.Interface.GetIntegerFromIntr;

import java.util.Collection;
import java.util.Scanner;

public class GetFromConsoleInteger implements GetIntegerFromIntr {
    private Scanner sc = new Scanner(System.in);

    @Override
    public Collection<?> getData(Collection<Integer> collection, int count) {
        int i = 0;
        while (i < count) {
            collection.add(sc.nextInt());
            i++;
        }
        return collection;
    }
}
