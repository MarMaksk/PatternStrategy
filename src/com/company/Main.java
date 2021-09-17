package com.company;

import com.company.Service.ServiceWithData;
import com.company.ServiceGetFrom.GetFromConsoleString;
import com.company.ServiceOperation.OperationWithInteger;
import com.company.ServiceOperation.OperationWithString;
import com.company.ServiceShowDataTo.ShowDataToConsole;
import com.company.ServiceShowDataTo.ShowDataToFile;

import java.io.IOException;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {

        ServiceWithData op = new ServiceWithData(
                new GetFromConsoleString(), new OperationWithString(), new ShowDataToFile(), new HashSet());
        op.runGetData();
        //op.revers();
        op.showData();
        System.out.println(op.searchMax().getAsInt());
        System.out.println(op.searchMin().getAsInt());
        ServiceWithData op2 = new ServiceWithData(
                new GetFromConsoleString(), new OperationWithInteger(), new ShowDataToConsole(), new HashSet());
        op2.runGetData();
        //op2.revers();
        op2.showData();
        System.out.println(op2.searchMax().getAsInt());
        System.out.println(op2.searchMin().getAsInt());

    }
}
