import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banca banca = new Banca();
        banca.listaClienti.add(new Cliente("Mario", "Rossi", "6t47ugy", "hruciu", 20));
        banca.listaClienti.add(new Cliente("Francesco", "Uccelli", "45ge", "rfewe", 15));
        banca.listaClienti.add(new Cliente("Augusto", "Ermione", "werfhy", "eesrh", 30));

        Scanner tastiera = new Scanner(System.in);


        try{
            System.out.println("1 Inserisci cliente");
            System.out.println("2 Elimina cliente");
            System.out.println("3 Invia Denaro");
            System.out.println("4 Ricevi Denaro");
            System.out.println("5 Esci");

            System.out.println(banca.listaClienti);

            int scelta = tastiera.nextInt();
            while(scelta!=5){
                switch (scelta){
                    case 1:
                        banca.inserisciCliente();
                        break;

                    case 2:
                        System.out.println("Chi elimini: ");
                        int i = tastiera.nextInt();
                        banca.eliminacliente(i);
                        break;
                    case 3:
                        System.out.println("Chi invia il denaro");
                        String mandante = tastiera.nextLine();


                    case 5:
                        System.exit(0);
                        break;
                }

                System.out.println(banca.listaClienti);
                scelta = tastiera.nextInt();
            }

        }
        catch (Exception e){
            //System.out.println(e);
            System.out.println("Non ci sono più clienti");
            System.exit(0);
        }


    }
}