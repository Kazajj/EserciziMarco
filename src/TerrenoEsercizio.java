import terreni.Proprietario;
import terreni.Terreno;
import terreni.TerrenoQuadrato;
import terreni.TerrenoRettangolare;

public class TerrenoEsercizio {

    public static void main(String[] args) {
        TerrenoRettangolare terreno1 = new TerrenoRettangolare(1,2);
        TerrenoQuadrato terreno2 = new TerrenoQuadrato(1, true);

        //Quadrato (factory method)
        Terreno terreno3 = Terreno.creaTerreno(1,1, false);
        //Rettangolo (factory method)
        Terreno terreno4 = Terreno.creaTerreno(1,2, true);

        Proprietario proprietario = new Proprietario();
        proprietario.compraTerreno(terreno1);
        proprietario.compraTerreno(terreno2);
        proprietario.compraTerreno(terreno2);
        double valoreProprietario = proprietario.calcolaValoreTerreniEdificabili();

        //Riga a caso per Breakpoint DEBUG
        System.out.println("");
    }

}
