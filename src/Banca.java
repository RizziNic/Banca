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

    void eliminacliente(int i/*String eliminatoNome, String eliminatoCognome, String eliminatocodiceBancario*/){
        listaClienti.remove(i);
        /*
        for (Cliente cliente: listaClienti) {
            if(eliminatoNome.equals(cliente.nome) && eliminatoCognome.equals(cliente.cognome) && eliminatocodiceBancario.equals(cliente.codiceBancario)){
                listaClienti.remove(cliente);
            }
        }

         */
    }

    void printBanca(){

        System.out.printf("--------------------------------%n");
        System.out.printf("     CLIENTI DELLA BANCA        %n");
        System.out.printf("--------------------------------%n");

        System.out.printf("| %-10s | %-8s | %4s |%n", "NAME", "SUBNAME", "CODICE BANCARIO");
        System.out.printf("--------------------------------%n");


        /*
        System.out.println("*********************************");
        System.out.println("CLIENTI");
        System.out.println("Pos  Nome  Cognome  CodiceBancario");

        int i = 0;
        for (Cliente cliente: listaClienti) {
            System.out.printf();
            System.out.println(" " + i + ".  " + cliente.nome + "    " + cliente.cognome + "    " + cliente.codiceBancario);
            i++;
        }
        System.out.println("*********************************");

         */

    }

    public ArrayList<Cliente> getListaClienti() {
        return listaClienti;
    }
}
