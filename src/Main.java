import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banca banca = new Banca();
        banca.listaClienti.add(new Cliente("Anna", "Ricci", "6t47ugy", "abc", 20));
        banca.listaClienti.add(new Cliente("Dario", "Rossi", "45ge", "bde", 15));
        banca.listaClienti.add(new Cliente("Augusto", "Ermione", "werfhy", "cef", 30));

        Scanner tastiera = new Scanner(System.in);
        Scanner tastiera2 = new Scanner(System.in);


        try {
            System.out.println("1 Inserisci cliente");
            System.out.println("2 Elimina cliente");
            System.out.println("3 Invia Denaro");
            System.out.println("4 Ricevi Denaro");
            System.out.println("5 Esci");


            System.out.print("Scelta: ");
            int scelta = tastiera.nextInt();
            while (scelta != 5) {
                switch (scelta) {
                    case 1:
                        banca.printBanca();
                        banca.inserisciCliente();
                        break;

                    case 2:
                        banca.printBanca();
                        System.out.print("Posizione dell'utente da eliminare: ");
                        int i = tastiera.nextInt();
                        banca.eliminacliente(i);
                        break;
                    case 3:
                        banca.printBanca();
                        System.out.print("Chi invia il denaro: ");
                        tastiera.nextLine();
                        String mandante = tastiera.nextLine();

                        System.out.print("Codice bancario del mandante: ");
                        String codiceMandante = tastiera2.nextLine();

                        System.out.print("Importo: ");
                        double importo = tastiera.nextDouble();

                        System.out.print("Destinatario: ");
                        tastiera.nextLine();
                        String destinatario = tastiera2.nextLine();

                        System.out.print("Codice bancario del destinatario: ");
                        String codiceDestinatario = tastiera.nextLine();

                        Movimento movimento = new Movimento(mandante, codiceMandante, importo, destinatario, codiceDestinatario);
                        boolean trasferimento = false;

                        for (Cliente cliente : banca.listaClienti) {
                            if (mandante.equals(cliente.nome) && codiceMandante.equals(cliente.codiceBancario) && importo <= cliente.denaro) {
                                trasferimento = true;
                                cliente.inviaDenaro(importo);
                                //System.out.println("Soldi del mandante: " + cliente.getDenaro() + " €");
                            }
                        }
                        if (trasferimento) {
                            for (Cliente cliente : banca.listaClienti) {
                                if (destinatario.equals(cliente.nome) && codiceDestinatario.equals(cliente.codiceBancario)) {
                                    cliente.riceviDenaro(importo);
                                    banca.printBanca();
                                }
                            }
                        }

                        if (!trasferimento) {
                            System.out.println("L'operazione è fallita, il trasferimento non è possibile, riprova");
                            banca.printBanca();
                        }

                        break;

                    case 4:
                        banca.printBanca();
                        System.out.print("Richiedente denaro: ");
                        tastiera.nextLine();
                        String richiedente = tastiera.nextLine();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                }

                //System.out.println(banca.listaClienti);
                System.out.print("Scelta: ");
                scelta = tastiera.nextInt();
            }

        } catch (Exception e) {
            //System.out.println(e);
            System.out.println("Non ci sono più clienti");
            System.exit(0);
        }


    }
}