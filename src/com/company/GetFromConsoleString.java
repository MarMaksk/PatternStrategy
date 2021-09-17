package com.company;

import com.company.Interface.GetStringFromIntr;

import java.util.Collection;
import java.util.Scanner;

public class GetFromConsoleString implements GetStringFromIntr{
    private Scanner sc = new Scanner(System.in);

    @Override
    public Collection<?> getData(Collection<String> collection, int count) {
        int i = 0;
        while (i < count) {
            collection.add(sc.nextLine());
            i++;
        }
        return collection;
    }
}