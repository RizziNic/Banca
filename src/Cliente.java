import java.util.ArrayList;
import java.util.Scanner;

public class Cliente{

    String nome;
    String cognome;
    String codiceFiscale;
    String codiceBancario;
    double denaro;

    ArrayList<Movimento> movimenti = new ArrayList<>();

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
}
