package com.company.ServiceOperation;

import com.company.Interface.DataOperationIntr;

import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;

public class OperationWithInteger implements DataOperationIntr {
    @Override
    public void showData(Collection collection) {

    }

    @Override
    public void reversData(Collection collection) {
       collection.stream().sorted(Comparator.reverseOrder());
    }

    @Override
    public Optional searchMax(Collection collection) {
        return null;
    }

    @Override
    public Optional searchMin(Collection collection) {
        return null;
    }
}
