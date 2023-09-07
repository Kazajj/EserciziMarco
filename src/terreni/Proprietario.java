package terreni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    public void ordinaTerreni() {
        Comparator<Terreno> compatatoreCrescente = new Comparator<Terreno>() {
            @Override
            public int compare(Terreno terreno1, Terreno terreno2) {
                int area1 = terreno1.getArea();
                int area2 = terreno2.getArea();
                if (area1 > area2) {
                    return 1; //1 = maggiore
                }
                if (area1 < area2) {
                    return -1; //-1 = minore
                }

                //Se area1 non è nè maggiore nè minore, è per forza uguale.
                //Controlla perimetro se aree sono uguali
                int perimetro1 = terreno1.getPerimetro();
                int perimetro2 = terreno2.getPerimetro();
                if (perimetro1 > perimetro2) {
                    return 1; //1 = maggiore
                } else {
                    return -1; //-1 = minore
                }

            }
        };

        Collections.sort(this.terreni, compatatoreCrescente);
    }

    public void ordinaTerreni2() {
        Comparator<Terreno> compatatoreCrescente = new Comparator<Terreno>() {
            @Override
            public int compare(Terreno terreno1, Terreno terreno2) {
                //Controlla per area
                int area1 = terreno1.getArea();
                int area2 = terreno2.getArea();
                if (area1 != area2) {
                    return Integer.compare(area1, area2); //MOLTO PIÙ SEMPLICE DEGLI if
                    /* Il metodo Integer.compare(int1, int2) restituisce:
                     1 se int1 è maggiore di int2
                     -1 se int1 è minore di int2
                     0 se int1 e int2 sono uguali
                     */
                }

                //Controlla perimetro se aree sono uguali
                int perimetro1 = terreno1.getPerimetro();
                int perimetro2 = terreno2.getPerimetro();
                return Integer.compare(perimetro1, perimetro2); //MOLTO PIÙ SEMPLICE DEGLI if
            }
        };

        Collections.sort(this.terreni, compatatoreCrescente);
    }

}
