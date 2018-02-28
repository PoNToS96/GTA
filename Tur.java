package com.company;

public class Tur {
    private String delgivare;
    private int datum;
    private double start;
    private double stop;
    private double rast;
    private int sok;
    private int sokArb;
    private int delg;
    private int delgArb;
    private int ejAv;

    public Tur(String delgivare, int datum, double start, double stop, double rast, int sok, int sokArb, int delg, int delgArb, int ejAv) {
        this.delgivare = delgivare;
        this.datum = datum;
        this.start = start;
        this.stop = stop;
        this.rast = rast;
        this.sok = sok;
        this.sokArb = sokArb;
        this.delg = delg;
        this.delgArb = delgArb;
        this.ejAv = ejAv;
    }

    public String turInfo() {
        return delgivare + ", " + datum + ", " + sok + ", " + sokArb + ", " + delg + ", " + delgArb + ", " + ejAv;

    }

}