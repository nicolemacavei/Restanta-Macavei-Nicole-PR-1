package com.company;

import com.company.Ausfluge;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Service {

    public List<Ausfluge> sortListeAusflugeByTeilnehmer(List<Ausfluge> liste){
        return liste
                .stream()
                .sorted((f1, f2) -> Long.compare(f2.getAnzahlTeilnehmer(), f1.getAnzahlTeilnehmer()))
                .collect(Collectors.toList());
    }


    public String getTopOrte(List<Ausfluge> liste){
        Map.Entry<Integer, Long> maxLocation = liste
                .stream()
                .collect(Collectors.groupingBy(Ausfluge::getAnzahlTeilnehmer, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow(NullPointerException::new);

        return maxLocation.getKey() + ": " + maxLocation.getValue();
    }
}