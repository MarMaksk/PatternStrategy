package com.company.ServiceOperation;

import com.company.Interface.DataOperationIntr;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;

public class OperationWithString extends GeneralOperation implements  Comparator<String> {

    public OperationWithString() {
    }


    @Override
    public Optional searchMax(Collection collection) {
        return collection.stream().sorted((x, y) -> compare(x.toString(), y.toString())).
                sorted(Collections.reverseOrder()).findFirst();
    }

    @Override
    public Optional searchMin(Collection collection) {
        return collection.stream().sorted((x, y) -> compare(x.toString(), y.toString())).findFirst();
    }

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) return 1;
        if (o1.length() < o2.length()) return -1;
        if (o1.length() == o2.length()) return 0;
        return 0;
    }
}
