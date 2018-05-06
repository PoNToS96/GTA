package elffors.GTA.projekt;

import java.util.*;

public class TurNamn {
    private String namn;
    private List<Tur> turLista;

    public TurNamn(String namn) {
        this.namn = namn;
        this.turLista = new ArrayList<>();
    }

    public String getNamnPaTur() {
        return this.namn;
    }

    public List<Tur> getTurLista() {
        return this.turLista;
    }

    public void addTur(Tur tur) {
        this.turLista.add(tur);
    }
}
