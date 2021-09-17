package com.company.ServiceShowDataTo;

import com.company.Interface.ShowDataIntr;

import java.io.*;
import java.util.Collection;

public class ShowDataToFile implements ShowDataIntr {
    private File file = new File("data.dat");
    private FileWriter fr = new FileWriter("data.dat");

    public ShowDataToFile() throws IOException {
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
