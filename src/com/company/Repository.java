package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Repository {

    public List<Ausfluge> readFromFile(String fileName, String character) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line = bufferedReader.readLine();
        String[] attributes;
        Ausfluge ausfluge;
        List<Ausfluge> ausfluges = new ArrayList<>();
        while (line != null) {
            attributes = line.split(character);
            ausfluge = new Ausfluge(Integer.parseInt(attributes[0]), attributes[1],Integer.parseInt(attributes[2]),Integer.parseInt(attributes[3]), Integer.parseInt(attributes[4]));
            ausfluges.add(ausfluge);

            line = bufferedReader.readLine();
        }

        return ausfluges;
    }

    public void writeToFile(String fileName, List<Ausfluge> liste, String character) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (Ausfluge ausflug : liste) {
            String line = ausflug.getId() + character + ausflug.getReiseziehl() + character +
                    ausflug.getPreisProPerson() + character + ausflug.getMaximumAnzahlTeilnehmer() +
                    character + ausflug.getAnzahlTeilnehmer();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
