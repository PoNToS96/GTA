package elffors.GTA.projekt;

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

    public int getDatum() {
        return this.datum;
    }

    public double getStart() {
        return this.start;
    }

    public double getStop() {
        return this.stop;
    }

    public double getRast() {
        return this.rast;
    }

    public int getSok() {
        return this.sok;
    }

    public int getSokArb() {
        return this.sokArb;
    }

    public int getDelg() {
        return this.delg;
    }

    public int getDelgArb() {
        return this.delgArb;
    }

    public int getEjAv() {
        return this.ejAv;
    }

    @Override
    public String toString() {
        return datum + "\ndelgivna: " + delg +
                ", delgivna på arbetet: " + delgArb +
                ", sök: " + sok +
                ", sök på arbetet: " + sokArb +
                ", ej aviserade: " + ejAv;
    }
}
