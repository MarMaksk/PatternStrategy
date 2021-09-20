package com.company;

import com.company.Service.DataService;
import com.company.DataFromService.DataFromConsole;
import com.company.ServiceOperation.IntegerOperation;
import com.company.ServiceOperation.StringOperation;
import com.company.DataTo.DataToConsole;
import com.company.DataTo.DataToFile;

import java.io.IOException;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {

        DataService op = new DataService(
                new DataFromConsole(), new StringOperation(), new DataToFile(), new HashSet());
        op.runGetData();
        //op.revers();
        op.showData();
        System.out.println(op.searchMax().getAsInt());
        System.out.println(op.searchMin().getAsInt());
        DataService op2 = new DataService(
                new DataFromConsole(), new IntegerOperation(), new DataToConsole(), new HashSet());
        op2.runGetData();
        //op2.revers();
        op2.showData();
        System.out.println(op2.searchMax().getAsInt());
        System.out.println(op2.searchMin().getAsInt());

    }
}
