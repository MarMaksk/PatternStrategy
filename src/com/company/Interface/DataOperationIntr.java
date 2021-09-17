package com.company.Interface;

import java.util.Collection;

public interface DataOperationIntr<E> {
    void showData(Collection<? extends E> c);

    void reversData();

    void searchMax();

    void searchMin();

    void getData(GetIntegerFromIntr gfi);
}
