package terreni;

import mercato.Mercato;

public class TerrenoRettangolare implements Terreno{

    private int larghezza;
    private int altezza;
    private final boolean edificabile; //NON AVENDO setter() NON È MODIFICABILE

    //Costruttore 1
    public TerrenoRettangolare(int largh, int alt, boolean edif) {
        if (largh <= 0 || alt <= 0) throw new IllegalArgumentException("Valori di larghezza e altezza non validi");
        this.larghezza = largh;
        this.altezza = alt;
        this.edificabile = edif;
    }

    //Costruttore 2 (NON edificabili)
    public TerrenoRettangolare(int largh, int alt) {
        if (largh <= 0 || alt <= 0) throw new IllegalArgumentException("Valori di larghezza e altezza non validi"); //Potrei fare un metodo apposito per questo controllo
        this.larghezza = largh;
        this.altezza = alt;
        this.edificabile = false; //SEMPRE FALSE
    }

    @Override
    public int getPerimetro() {
        int perimetro = (larghezza + altezza) * 2;
        return perimetro;
    }

    @Override
    public int getArea() {
        int area = larghezza * altezza;
        return area;
    }

    @Override
    public boolean isEdificabile() {
        return edificabile;
    }

    @Override
    public double getValore() {
        double valore = Mercato.getValoreEdificabile(); //Ricorda di importare correttamente la libreria (guarda import a riga 3) Chiedi a ChatGPT come importare nel caso
        return valore;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

}
