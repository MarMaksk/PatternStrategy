package com.company.ServiceOperation;

import com.company.Interface.DataOperationIntr;

import java.util.Collection;
import java.util.Comparator;

public class OperationWithString implements DataOperationIntr, Comparator<String> {
    private Collection collection;

    public OperationWithString(Collection collection) {
        this.collection = collection;
    }

    public OperationWithString() {
    }

    @Override
    public void showData() {
        collection.forEach(System.out::println);
    }

    @Override
    public void reversData() {

    }

    @Override
    public void searchMax() {

    }

    @Override
    public void searchMin() {

    }

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) return 1;
        if (o1.length() < o2.length()) return -1;
        if (o1.length() == o2.length()) return 0;
        return 0;
    }

    public Collection revers() {
        return (Collection) collection.stream().sorted(Comparator.reverseOrder());
    }
}
