package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Helper {

    List<Sala> lista = new ArrayList<>();

    public List<Sala> DinFisier(String file) {

        FileInputStream fis = null;
        String str = null;

        try
        {
            fis = new FileInputStream(file);
        }
        catch (FileNotFoundException fnfe)
        {
            fnfe.printStackTrace();
        }

        DataInputStream dis = new DataInputStream(fis);

        try
        {
            while ((str = dis.readLine()) != null) {
                //System.out.println(str);
                String[] spart = str.split(" ");

                lista.add(new Sala(spart[0], spart[1], spart[2], Integer.getInteger(spart[3])));

                dis.close();
            }
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return lista;
    }
}
