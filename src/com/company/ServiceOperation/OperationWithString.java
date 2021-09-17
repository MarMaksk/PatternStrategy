package com.company.ServiceOperation;

import java.util.*;

public class OperationWithString extends GeneralOperation implements Comparator<String> {

    public OperationWithString() {
    }


    @Override
    public OptionalInt searchMax(Collection collection) {
        return collection.stream().mapToInt(x -> Integer.valueOf(x.toString().length())).max();
    }

    @Override
    public OptionalInt searchMin(Collection collection) {
        return collection.stream().mapToInt(x -> Integer.valueOf(x.toString().length())).min();
    }

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) return 1;
        if (o1.length() < o2.length()) return -1;
        if (o1.length() == o2.length()) return 0;
        return 0;
    }
}
