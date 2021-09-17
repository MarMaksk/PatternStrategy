package com.company;

import com.company.Interface.DataOperationIntr;
import com.company.Interface.GetFromIntr;
import com.company.Interface.GetStringFromIntr;

import java.util.Collection;

public class OperationWithCollection {
    private GetStringFromIntr gfr;
    private DataOperationIntr doi;
    private Collection collection;
    private int count = 0;

    public OperationWithCollection(GetStringFromIntr gfr, DataOperationIntr doi, Collection collection) {
        this.gfr = gfr;
        this.doi = doi;
        this.collection = collection;
    }

    public void runTask() {
        this.gfr.getData(collection);
    }

    public void setDoi(DataOperationIntr doi) {
        this.doi = doi;
    }
}
