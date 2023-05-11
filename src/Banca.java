import java.util.ArrayList;
import java.util.Scanner;

public class Banca {

    int nclienti;

    public Banca(){

    }
    public Banca(int nclienti){
        this.nclienti = nclienti;
    }
    ArrayList<Cliente> listaClienti = new ArrayList<>();

    void inserisciCliente(){
        Scanner tastiera = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = tastiera.nextLine();

        System.out.print("Cognome: ");
        String cognome = tastiera.nextLine();

        System.out.print("Codice fiscale: ");
        String codiceFiscale = tastiera.nextLine();

        System.out.print("Codice bancario: ");
        String codiceBancario = tastiera.nextLine();

        System.out.print("Denaro: ");
        float denaro = tastiera.nextFloat();

        listaClienti.add(new Cliente(nome, cognome, codiceFiscale, codiceBancario, denaro));
    }

    void eliminacliente(int i){
        listaClienti.remove(i);
    }

    public ArrayList<Cliente> getListaClienti() {
        return listaClienti;
    }
}
