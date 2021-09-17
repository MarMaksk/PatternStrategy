package com.company.Interface;

import java.util.Collection;
import java.util.Optional;

public interface DataOperationIntr {
    void showData(Collection collection);

    void reversData(Collection collection);

    Optional searchMax(Collection collection);

    Optional searchMin(Collection collection);

}
