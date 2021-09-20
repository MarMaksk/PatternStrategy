package com.company.DataTo;

import com.company.Interface.DataTo;

import java.util.Collection;

public class DataToConsole implements DataTo {

    @Override
    public void showData(Collection<?> collection) {
        collection.forEach(System.out::println);
    }
}
