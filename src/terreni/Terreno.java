package terreni;

public interface Terreno {
    int getPerimetro();

    int getArea();

    boolean isEdificabile();

    double getValore();

    //Metodo factory (puoi usare static o default)
    static Terreno creaTerreno(int larghezza, int altezza, boolean edificabile) {
        if (larghezza == altezza) {
            Terreno quadrato = new TerrenoQuadrato(larghezza, edificabile);
            return quadrato;
        } else {
            Terreno rettangolo = new TerrenoRettangolare(larghezza, altezza, edificabile);
            return rettangolo;
        }
    }
}
