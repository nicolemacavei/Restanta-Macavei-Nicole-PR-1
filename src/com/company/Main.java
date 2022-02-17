package com.company;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Repository repo = new Repository();
        Service service = new Service();

        try {
            List<Ausfluge> listeAusfluge = repo.readFromFile("C:\\Users\\macav\\Documents\\Facultate an II\\MapSeminar\\Restanta-Macavei-Nicole-PR-1\\src\\com\\company\\ausfluge.txt", "&&");

            System.out.println(service.sortListeAusflugeByTeilnehmer(listeAusfluge));
            System.out.println(service.getTopOrte(listeAusfluge));

            repo.writeToFile("C:\\Users\\macav\\Documents\\Facultate an II\\MapSeminar\\Restanta-Macavei-Nicole-PR-1\\src\\com\\companystatistik.txt", listeAusfluge, "&&");
            service.getTopOrte(listeAusfluge);
            System.out.println(service.getTopOrte(listeAusfluge));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
