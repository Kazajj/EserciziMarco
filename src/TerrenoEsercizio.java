import terreni.Proprietario;
import terreni.Terreno;
import terreni.TerrenoQuadrato;
import terreni.TerrenoRettangolare;

import java.util.ArrayList;

public class TerrenoEsercizio {

    public static void main(String[] args) {
        TerrenoRettangolare terreno1 = new TerrenoRettangolare(1,2);
        TerrenoQuadrato terreno2 = new TerrenoQuadrato(1, true);

        //Quadrato (factory method)
        Terreno terreno3 = Terreno.creaTerreno(1,1, false);
        //Rettangolo (factory method)
        Terreno terreno4 = Terreno.creaTerreno(1,2, true);
        Terreno terreno5 = Terreno.creaTerreno(5,4, true);
        Terreno terreno6 = Terreno.creaTerreno(2,10, true);

        Proprietario proprietario = new Proprietario();
        proprietario.compraTerreno(terreno5);
        proprietario.compraTerreno(terreno2);
        proprietario.compraTerreno(terreno6);
        proprietario.compraTerreno(terreno2);
        proprietario.compraTerreno(terreno1);
        double valoreProprietario = proprietario.calcolaValoreTerreniEdificabili();

        //Ho fatto due metodi di ordinamento
//        proprietario.ordinaTerreni();
        proprietario.ordinaTerreni2();


        //Riga a caso per Breakpoint DEBUG
        System.out.println("");
    }

}
