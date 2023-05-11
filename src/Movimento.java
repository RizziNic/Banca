import java.util.Scanner;

public class Movimento {
    int anno;
    double transazione;
    Scanner tastiera = new Scanner(System.in);
    Scanner tastiera2 = new Scanner(System.in);

    String mandante;
    String codiceMandante;
    double importo;
    String destinatario;
    String codiceDestinatario;

    public Movimento(String mandante, String codiceMandante, double importo, String destinatario, String codiceDestinatario){
        this.mandante = mandante;
        this.codiceMandante = codiceMandante;
        this.importo = importo;
        this.destinatario = destinatario;
        this.codiceDestinatario = codiceDestinatario;
    }




    
}
