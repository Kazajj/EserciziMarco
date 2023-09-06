package terreni;

import mercato.Mercato;

public class TerrenoQuadrato extends TerrenoRettangolare{

    private int lato;
    private final boolean edificabile; //NON AVENDO setter() NON È MODIFICABILE

    public TerrenoQuadrato(int lato, boolean edif) {
        super(lato, lato, edif);
        this.lato = lato;
        this.edificabile = edif;
    }

    @Override
    public int getPerimetro() {
        int perimetro = lato * 4;
        return perimetro;
    }

    @Override
    public int getArea() {
        int area = lato * lato;
        return area;
    }

    @Override
    public boolean isEdificabile() {
        return edificabile;
    }

    @Override
    public double getValore() {
        double valoreGrezzo = Mercato.getValoreEdificabile(); //Ricorda di importare correttamente la libreria (guarda import a riga 3) Chiedi a ChatGPT come importare nel caso
        double valoreIncrementato = (valoreGrezzo / 100 * 5) + valoreGrezzo;
        return valoreIncrementato;
    }

    public int getLato() {
        return lato;
    }

    public void setLato(int lato) {
        this.lato = lato;
    }

    public boolean getEdificabile() {
        return edificabile;
    }
}
