package terreni;

import java.util.ArrayList;

public class Proprietario {

    ArrayList<Terreno> terreni;

    public Proprietario() {
        this.terreni = new ArrayList<>();
    }

    public void compraTerreno(Terreno terreno) {
        terreni.add(terreno);
    }

    public double calcolaValoreTerreniEdificabili() {
        double valore = 0;
        for (Terreno terr : terreni) {
            if (terr.isEdificabile()) {
                valore = valore + terr.getValore();
            }
        }
        return valore;
    }

}
