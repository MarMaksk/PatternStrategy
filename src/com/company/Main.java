package com.company;

import com.company.ServiceGetFrom.GetFromConsoleString;
import com.company.ServiceOperation.OperationWithString;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        ServiceWithData op = new ServiceWithData(
                new GetFromConsoleString(), new OperationWithString(), new HashSet());
        op.runGetData();
        //op.revers();
        //op.showData();
        System.out.println(op.searchMax().get());
        System.out.println(op.searchMin().get());
        ServiceWithData op2 = new ServiceWithData(
                new GetFromConsoleString(), new OperationWithString(), new HashSet());
        op2.runGetData();
        //op2.revers();
        //op2.showData();
        System.out.println(op2.searchMax().get());
        System.out.println(op2.searchMin().get());

    }
}
