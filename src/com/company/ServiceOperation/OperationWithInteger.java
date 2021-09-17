package com.company.ServiceOperation;

import java.util.Collection;
import java.util.OptionalInt;

public class OperationWithInteger extends GeneralOperation {

    @Override
    public OptionalInt searchMax(Collection collection) {
        return collection.stream().mapToInt(num -> Integer.parseInt((String) num)).max();
    }

    @Override
    public OptionalInt searchMin(Collection collection) {
        return collection.stream().mapToInt(num -> Integer.parseInt((String) num)).min();
    }
}
