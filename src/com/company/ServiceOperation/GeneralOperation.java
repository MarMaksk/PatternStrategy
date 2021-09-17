package com.company.ServiceOperation;

import com.company.Interface.DataOperationIntr;

import java.util.Collection;
import java.util.Optional;

public class GeneralOperation implements DataOperationIntr {
    @Override
    public void showData(Collection collection) {

    }

    @Override
    public void reversData(Collection collection) {

    }

    @Override
    public Optional searchMax(Collection collection) {
        return Optional.empty();
    }

    @Override
    public Optional searchMin(Collection collection) {
        return Optional.empty();
    }
}
