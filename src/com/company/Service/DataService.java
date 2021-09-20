package com.company.Service;

import com.company.Interface.DataOperation;
import com.company.Interface.DataFrom;
import com.company.Interface.DataTo;

import java.util.Collection;
import java.util.OptionalInt;

public class DataService {
    private DataFrom gfr;
    private DataOperation doi;
    private DataTo sdi;
    private Collection collection;

    public DataService(DataFrom gfr, DataOperation doi, DataTo sdi, Collection collection) {
        this.gfr = gfr;
        this.doi = doi;
        this.sdi = sdi;
        this.collection = collection;
    }

    public void runGetData() {
        this.collection = this.gfr.getData(collection);
    }

    public void reversData() {
        this.doi.reversData(collection);
    }

    public void showData() {
        this.sdi.showData(collection);
    }

    public OptionalInt searchMax() {
        return this.doi.searchMax(collection);
    }

    public OptionalInt searchMin() {
        return this.doi.searchMin(collection);
    }

    public void setDoi(DataOperation doi) {
        this.doi = doi;
    }
}
