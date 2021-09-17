package com.company.ServiceOperation;

import com.company.Interface.DataOperationIntr;

import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;

public class OperationWithInteger extends GeneralOperation {

    @Override
    public Optional searchMax(Collection collection) {
        return collection.stream().max((x, y) -> Integer.compare((Integer) x, (Integer) y));
    }

    @Override
    public Optional searchMin(Collection collection) {
        return collection.stream().min((x, y) -> Integer.compare((Integer) x, (Integer) y));
    }
}
