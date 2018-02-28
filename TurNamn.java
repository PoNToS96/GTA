package com.company;

import java.util.*;

public class TurNamn {
    private String namn;
    private List<Tur> turLista;

    public TurNamn(String namn) {
        this.namn = namn;
        this.turLista = new ArrayList<Tur>();
    }

    public String getTurNamn() {
        return namn;
    }

    public List<Tur> getTurLista() {
        return turLista;
    }

    public void addTur(Tur tur) {
        this.turLista.add(tur);
    }

    public void addTur(String delgivare, int datum, double start, double stop, double rast, int sok, int sokArb, int delg, int delgArb, int ejAv) {
        this.turLista.add(new Tur(delgivare, datum, start, stop, rast, sok, sokArb, delg, delgArb, ejAv));
    }

    public String toString(Tur tur) {
        return this.namn + ": " + tur.turInfo();
    }

}