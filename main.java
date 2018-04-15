package elffors.GTA.projekt;

public class Main {

    public static void main(String[] args) {
        Tur norraUmea1 = new Tur("Johan",180228, 10.00, 17.00, 00.30, 15, 1, 17, 2, 5);
        Tur norraUmea2 = new Tur("Elsa",180315, 13.00, 21.00, 00.30, 12, 1, 13, 2, 2);
        Tur sodraUmea1 = new Tur("Johan",180325, 15.00, 20.00, 00.30, 7, 1, 15, 2, 3);
        Tur sodraUmea2 = new Tur("Johan",180425, 11.00, 19.00, 1.00, 25, 3, 15, 2, 3);
        Tur sodraUmea3 = new Tur("Elsa",180431, 14.00, 19.00, 1.00, 7, 1, 7, 3, 1);
        Tur sodraUmea4 = new Tur("Alfred",180523, 16.00, 21.00, 00.30, 12, 0, 10, 1, 2);

        TurNamn norraUmea = new TurNamn("Norra Umeå");
        norraUmea.addTur(norraUmea1);
        norraUmea.addTur(norraUmea2);
        printTur(norraUmea);
        TurNamn sodraUmea = new TurNamn("Södra Umeå");
        sodraUmea.addTur(sodraUmea1);
        sodraUmea.addTur(sodraUmea2);
        sodraUmea.addTur(sodraUmea3);
        sodraUmea.addTur(sodraUmea4);
        printTur(sodraUmea);
    }

    private static void printTur(TurNamn turNamn) {
        System.out.println("\n" + turNamn.getNamnPaTur() + "\n==============================");
        for (Tur tur : turNamn.getTurLista()) {
            System.out.println(tur);
        }
    }
}
