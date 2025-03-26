package vue;

import entity.Client;

import java.util.Scanner;

public class ClientVue {
        public Client saisiClient(){
            Scanner sc = new Scanner(System.in);
            Client client = new Client();
            client.setNom(saisiClientNom());
            client.setTelephone(saisiAddress());
            client.setAddress(saisiTelephone());
            return client;
        }

        private String saisiClientNom(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Entrez le nom de client : ");
            String nom=sc.next();
            return nom;
        }

        private String saisiAddress(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Entrez le telephone de client : ");
            String tele=sc.next();
            return tele;
        }

        private String saisiTelephone(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Entrez le address de client : ");
            String address=sc.next();
            return address;
        }
}
