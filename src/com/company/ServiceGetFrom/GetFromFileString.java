package com.company.ServiceGetFrom;

import com.company.Interface.GetStringFromIntr;

import java.io.*;
import java.util.Collection;

public class GetFromFileString implements GetStringFromIntr {
    private File file = new File("data.txt");
    private FileReader fr = new FileReader(file);

    public GetFromFileString() throws FileNotFoundException {
    }

    @Override
    public Collection<?> getData(Collection<String> collection) {
        try (BufferedReader br = new BufferedReader(fr)) {
            String str = "";
            while ((str = br.readLine()) != null) {
                collection.add(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return collection;
    }
}
