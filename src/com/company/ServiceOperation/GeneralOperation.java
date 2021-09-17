package com.company.ServiceOperation;

import com.company.Interface.DataOperationIntr;

import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;

public abstract class GeneralOperation implements DataOperationIntr {
    @Override
    public void showData(Collection collection) {
        collection.forEach(System.out::println);
    }

    @Override
    public void reversData(Collection collection) {
        collection.stream().sorted(Comparator.reverseOrder());
    }
}
