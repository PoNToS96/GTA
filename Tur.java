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

    private Tur(Builder builder) {
        this.delgivare = builder.delgivare;
        this.datum = builder.datum;
        this.start = builder.start;
        this.stop = builder.stop;
        this.rast = builder.rast;
        this.sok = builder.sok;
        this.sokArb = builder.sokArb;
        this.delg = builder.delg;
        this.delgArb = builder.delgArb;
        this.ejAv = builder.ejAv;
    }

    public static class Builder {
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

        public Builder(String delgivare, int datum) {
            this.delgivare = delgivare;
            this.datum = datum;
        }

        public Builder start(double value) {
            this.start = value;
            return this;
        }

        public Builder stop(double value) {
            this.stop = value;
            return this;
        }

        public Builder rast(double value) {
            this.rast = value;
            return this;
        }

        public Builder sok(int value) {
            this.sok = value;
            return this;
        }

        public Builder sokArb(int value) {
            this.sokArb = value;
            return this;
        }

        public Builder delg(int value) {
            this.delg = value;
            return this;
        }

        public Builder delgArb(int value) {
            this.delgArb = value;
            return this;
        }

        public Builder ejAv(int value) {
            this.ejAv = value;
            return this;
        }

        public Tur build() {
            return new Tur(this);
        }
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

    public void setDelgivare(String delgivare) {
        this.delgivare = delgivare;
    }

    public void setDatum(int datum) {
        this.datum = datum;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public void setStop(double stop) {
        this.stop = stop;
    }

    public void setRast(double rast) {
        this.rast = rast;
    }

    public void setSok(int sok) {
        this.sok = sok;
    }

    public void setSokArb(int sokArb) {
        this.sokArb = sokArb;
    }

    public void setDelg(int delg) {
        this.delg = delg;
    }

    public void setDelgArb(int delgArb) {
        this.delgArb = delgArb;
    }

    public void setEjAv(int ejAv) {
        this.ejAv = ejAv;
    }

    @Override
    public String toString() {
        return datum + "\nDelgivare: " + delgivare + " Tid: " + start + " - " + stop + " Rast: " + rast + "\ndelgivna: " + delg +
                ", delgivna på arbetet: " + delgArb +
                ", sök: " + sok +
                ", sök på arbetet: " + sokArb +
                ", ej aviserade: " + ejAv + "\n";
    }
}
