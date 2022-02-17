package com.company;

public class Ausfluge {
    private int id;
    private String reiseziehl;
    private int preisProPerson;
    private int maxAnzahlTeilnehmer;
    private int anzahlTeilnehmer;

    public Ausfluge(int id, String reiseziehl, int preisProPerson, int maximumAnzahlTeilnehmer, int anzahlTeilnehmer) {
        id = id;
        reiseziehl = reiseziehl;
        this.preisProPerson = preisProPerson;
        this.maxAnzahlTeilnehmer = maximumAnzahlTeilnehmer;
        this.anzahlTeilnehmer = anzahlTeilnehmer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public String getReiseziehl() {
        return reiseziehl;
    }

    public void setReiseziehl(String reiseziehl) {
        reiseziehl = reiseziehl;
    }

    public int getPreisProPerson() {
        return preisProPerson;
    }

    public void setPreisProPerson(int preisProPerson) {
        this.preisProPerson = preisProPerson;
    }

    public int getMaximumAnzahlTeilnehmer() {
        return maxAnzahlTeilnehmer;
    }

    public void setMaximumAnzahlTeilnehmer(int maximumAnzahlTeilnehmer) {
        this.maxAnzahlTeilnehmer = maximumAnzahlTeilnehmer;
    }

    public int getAnzahlTeilnehmer() {
        return anzahlTeilnehmer;
    }

    public void setAnzahlTeilnehmer(int anzahlTeilnehmer) {
        this.anzahlTeilnehmer = anzahlTeilnehmer;
    }

    @Override
    public String toString() {
        return "Ausfluge{" +
                "Id=" + id +
                ", Reiseziehl='" + reiseziehl + '\'' +
                ", preisProPerson=" + preisProPerson +
                ", maximumAnzahlTeilnehmer=" + maxAnzahlTeilnehmer +
                ", anzahlTeilnehmer=" + anzahlTeilnehmer +
                '}';
    }
}
