package com.company.ServiceOperation;

import com.company.Interface.DataOperationIntr;

import java.util.Collection;
import java.util.Comparator;

public abstract class GeneralOperation implements DataOperationIntr {

    @Override
    public void reversData(Collection collection) {
        collection.stream().sorted(Comparator.reverseOrder());
    }
}
