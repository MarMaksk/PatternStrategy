package com.company;

import com.company.ServiceGetFrom.GetFromConsoleString;
import com.company.Interface.GetFromIntr;
import com.company.ServiceOperation.OperationWithString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main {
    private static GetFromIntr gfr;

    public static void main(String[] args) {

        Collection gs = new GetFromConsoleString().getData(new ArrayList<>());
        OperationWithCollection op = new OperationWithCollection(
                new GetFromConsoleString(), new OperationWithString(), new HashSet());
        op.runTask();


    }
}
