package com.company.ServiceShowDataTo;

import com.company.Interface.ShowDataIntr;

import java.util.Collection;

public class ShowDataToConsole implements ShowDataIntr {

    @Override
    public void showData(Collection<?> collection) {
        collection.forEach(System.out::println);
    }
}
