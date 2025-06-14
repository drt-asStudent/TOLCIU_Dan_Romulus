package org.example;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Helper {

    List<Sala> lista = new ArrayList<>();
    int conv = 0;

    public List<Sala> DinFisier(String file) {

        FileInputStream fis = null;
        String str = null;

        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

        DataInputStream dis = new DataInputStream(fis);

        try {
            while ((str = dis.readLine()) != null) {
                //System.out.println(str);
                String[] spart = str.split(" ");
                try {
                    conv = Integer.parseInt(spart[3]);
                } catch (Exception e) {
                }
                lista.add(new Sala(spart[0], spart[1], spart[2], conv));
                //lista.add(new Sala(spart[0], spart[1], spart[2], Integer.parseInt(spart[3])));
                //lista.add(new Sala(spart[0], spart[1], spart[2], Integer.valueOf(spart[3])));
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return lista;
    }
}
