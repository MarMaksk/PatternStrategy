package com.company.DataFromService;

import com.company.Interface.DataFrom;

import java.io.*;
import java.util.Collection;

public class DataFromFile implements DataFrom {
    private File file = new File("data.txt");
    private FileReader fr = new FileReader(file);

    public DataFromFile() throws FileNotFoundException {
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
