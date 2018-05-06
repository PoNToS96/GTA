package elffors.GTA.projekt;

public class Main {

    public static void main(String[] args) {

        //Skapar turer med några initiala värden
        Tur norraUmea1 = new Tur.Builder("Johan", 180228).start(10.05).stop(17.05).delg(13).build();
        Tur norraUmea2 = new Tur.Builder("Elsa", 180315).delgArb(3).ejAv(5).delg(13).build();

        //Skapar ett turnamn och ägger till turerna
        TurNamn norraUmea = new TurNamn("Norra Umeå");
        norraUmea.addTur(norraUmea1);
        norraUmea.addTur(norraUmea2);

        //Skriver ut informationen om turnamnet
        printTur(norraUmea);

        //Lägger in värden på fler attribut i turen
        norraUmea1.setSok(3);
        norraUmea1.setDelgArb(2);
        norraUmea1.setRast(0.30);
        norraUmea2.setStart(18.00);
        norraUmea2.setStop(21.30);

        //Skriver ut informationen om turnamnet
        printTur(norraUmea);
    }

    private static void printTur(TurNamn turNamn) {
        System.out.println("\n" + turNamn.getNamnPaTur() + "\n===========================================");
        for (Tur tur : turNamn.getTurLista()) {
            System.out.println(tur);
        }
    }
}
