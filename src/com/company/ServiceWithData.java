package com.company;

import com.company.Interface.DataOperationIntr;
import com.company.Interface.GetStringFromIntr;

import java.util.Collection;
import java.util.Optional;
import java.util.OptionalInt;

public class ServiceWithData {
    private GetStringFromIntr gfr;
    private DataOperationIntr doi;
    private Collection collection;

    public ServiceWithData(GetStringFromIntr gfr, DataOperationIntr doi, Collection collection) {
        this.gfr = gfr;
        this.doi = doi;
        this.collection = collection;
    }

    public void runGetData() {
        this.collection = this.gfr.getData(collection);
    }

    public void revers() {
        this.doi.reversData(collection);
    }

    public void showData() {
        this.doi.showData(collection);
    }

    public OptionalInt searchMax() {
        return this.doi.searchMax(collection);
    }

    public OptionalInt searchMin() {
        return this.doi.searchMin(collection);
    }

    public void setDoi(DataOperationIntr doi) {
        this.doi = doi;
    }
}
