public class Cliente{

    String nome;
    String cognome;
    String codiceFiscale;
    String codiceBancario;
    float denaro;
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
