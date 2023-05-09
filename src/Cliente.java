import java.util.ArrayList;

public class Cliente{

    String nome;
    String cognome;
    String codiceFiscale;
    String codiceBancario;
    float denaro;

    ArrayList<String> movimenti = new ArrayList<>();

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
}
