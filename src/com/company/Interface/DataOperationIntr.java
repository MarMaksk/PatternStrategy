package com.company.Interface;

import java.util.Collection;
import java.util.Optional;
import java.util.OptionalInt;

public interface DataOperationIntr {

    void reversData(Collection collection);

    OptionalInt searchMax(Collection collection);

    OptionalInt searchMin(Collection collection);

}
