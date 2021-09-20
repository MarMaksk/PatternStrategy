package com.company.ServiceOperation;

import com.company.Interface.DataOperation;

import java.util.Collection;
import java.util.Comparator;

public abstract class GeneralOperation implements DataOperation {

    @Override
    public void reversData(Collection collection) {
        collection.stream().sorted(Comparator.reverseOrder());
    }
}
