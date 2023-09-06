package mercato;

public class Mercato {
    private static int contatore = 0;
    private static int valore = 100;

    public Mercato() {
    }

    public static int getValoreNonEdificabile() {
        if (contatore > 2) {
            contatore = 0;
            valore = 100;
        }

        int risultato = valore;
        valore += 100;
        ++contatore;
        return risultato;
    }

    public static int getValoreEdificabile() {
        return getValoreNonEdificabile() * 12;
    }
}
