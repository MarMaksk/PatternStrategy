package com.company.ServiceGetFrom;

import com.company.Interface.GetStringFromIntr;

import java.util.Collection;
import java.util.Scanner;

public class GetFromConsoleString implements GetStringFromIntr {
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