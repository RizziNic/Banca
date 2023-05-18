import java.util.ArrayList;
import java.util.Scanner;

public class Cliente{

    String nome;
    String cognome;
    String codiceFiscale;
    String codiceBancario;
    double denaro;

    ArrayList<Movimento>listamovimenti = new ArrayList<>();

    public Cliente(String nome, String cognome, String codiceFiscale, String codiceBancario, double denaro){
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.codiceBancario = codiceBancario;
        this.denaro = denaro;
    }

    @Override
    public String toString() {
        return nome + " " + cognome;
    }

    public void riceviDenaro(double importo){
        this.denaro = denaro + importo;
    }

    public void inviaDenaro(double importo){
        this.denaro = denaro - importo;
    }

    public double getDenaro() {
        return denaro;
    }

    void printMovimenti(String clienteNome, String clienteCognome, int anno){
        System.out.printf("----------------------------------------------------------------------------------------------------------------%n");
        System.out.printf("| %-37s  %-6s  %-27s  %-25s|%n", "                                     ", "MOVIMENTI DI", clienteNome.toUpperCase() + " " + clienteCognome.toUpperCase() , "                           ");
        System.out.printf("----------------------------------------------------------------------------------------------------------------%n");

        System.out.printf("| %-3s | %-20s | %-20s | %-20s | %-20s | %-10s |%n", "POS", "MANDANTE", "CODICE MANDANTE","DESTINATARIO", "CODICE DESTINATARIO", "IMPORTO €");
        //System.out.printf("| %-37s |");
        System.out.printf("----------------------------------------------------------------------------------------------------------------%n");

        int i = 0;
        for (Movimento movimento : listamovimenti) {
            System.out.printf("| %-4s | %-20s | %-20s | %-20s | %-20s | %-10s |%n",anno, movimento.mandante, movimento.codiceMandante, movimento.destinatario, movimento.codiceDestinatario, movimento.importo);
            i++;
        }
        System.out.printf("----------------------------------------------------------------------------------------------------------------%n");


    }


}
