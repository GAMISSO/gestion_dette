import entity.Client;
import service.ClientService;
import vue.ClientVue;
import vue.Menu;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Menu menu=new Menu();
        ClientVue clientVue=new ClientVue();
        ClientService clientService=new ClientService();
        int choix;
        int quitter=0;
        do{
            choix=menu.afficherMenu();
            switch(choix){
                case 1:
                    while(true){
                        Client client=new Client();
                        System.out.println("Vous allez ajouter un client");
                        client=clientVue.saisiClient();
                        if(clientService.addClient( client)){
                            System.out.println("Client ajouter avec success");
                        }else{
                            System.out.println("Erreur ajouter un client");
                        }
                        System.out.println("Voulez vous ajouter encore(O/N)");
                        String choixEncode=sc.next();
                        break;
                    }
                case 2:
                    System.out.println("Vous allez afficher les clients");
                    break;
                case 3:
                    System.out.println("Vous allez ajouter un dette à un client");
                    System.out.println("1. Recherche par numéro");
                    System.out.println("2. Recherche par nom");
                    //Saisi le nom du client ou le numéro
                    //Saisi le montant de la dette
                    //Recherche du client avec son nom ou numéro
                    //Ajoute la dette au client trouver avec le nom
                    break;
                case 4:
                    break;
                case 5:
                    quitter=1;
                    break;
                default:
                    System.out.println("Veuillez choisir votre choix");
            }
        }while(quitter==1);

    }
}
