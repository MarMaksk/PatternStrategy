package com.company.DataTo;

import com.company.Interface.DataTo;

import java.io.*;
import java.util.Collection;

public class DataToFile implements DataTo {
    private File file = new File("data.txt");
    private FileWriter fr = new FileWriter(file);

    public DataToFile() throws IOException {
    }

    @Override
    public void showData(Collection<?> collection) {
        try (BufferedWriter bw = new BufferedWriter(fr)) {
            for (Object col : collection) {
                bw.write(col.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
