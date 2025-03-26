package vue;

import java.util.Scanner;

public class Menu {

    public Menu(){}
    public int afficherMenu(){
        int choix;
        do {
            System.out.println("Menu");
            System.out.println("--------------------");
            System.out.println("1. Ajouter un Client dans un tableau");
            System.out.println("2. Afficher les clients du tableau");
            System.out.println("3. Ajouter une dette à un client");
            System.out.println("4. Lister les dettes d'un client");
            System.out.println("5. Quitter");
            System.out.println("--------------------");
            Scanner sc = new Scanner(System.in);
            System.out.print("Choix : ");
            choix=sc.nextInt();
        }while(choix<1 || choix>5);
        return choix;
    }
}
