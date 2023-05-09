import java.util.ArrayList;
import java.util.Scanner;

public class Cliente{

    String nome;
    String cognome;
    String codiceFiscale;
    String codiceBancario;
    float denaro;

    ArrayList<Movimento> movimenti = new ArrayList<>();

    public Cliente(String nome, String cognome, String codiceFiscale, String codiceBancario, float denaro){
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

    public float inviaDenaro(String mandante){
        float invio = 0;
        if(mandante.equals(this.codiceBancario)){
            boolean possibilitaInvio = true;
            Scanner input = new Scanner(System.in);
            System.out.println("Invio");
            invio = input.nextFloat();
            this.denaro = denaro - invio;
        }
        return invio;

    }

    public void riceviDenaro(float invio, String ricevitore){
        this.denaro = denaro + invio;
    }



}
