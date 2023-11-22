package test.java;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Voiture voiture1 = new Voiture();
        Voiture voiture2 = new Voiture("bleue", 0, "non spécifié", 20,  new Date(10,10,2001), new Date(10,11,2001));

        voiture1.demarre();
        System.out.println(voiture1.getVitesse());
        voiture1.accelere(100);
        System.out.println(voiture1.getVitesse());
        voiture2.demarre();
        System.out.println(voiture2.getVitesse());
        voiture2.arret();
        System.out.println(voiture2.getVitesse());


        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre de voitures: ");
        int nbVoiture = scanner.nextInt();

        for(int i=0; i<nbVoiture; i++){
            System.out.println("Entrez la couleur de la voiture : ");
            String couleur = scanner.next();

            System.out.println("Entrez la vitesse de la voiture : ");
            int vitesse = scanner.nextInt();

            System.out.println("Entrez la direction de la voiture : ");
            String direction = scanner.next();

            System.out.println("Entrez la quantité de Carburant de la voiture : ");
            int qteCarburant = scanner.nextInt();
        
            System.out.println("Entrez le jour de date de mise en service : ");
            int jour = scanner.nextInt();

            System.out.println("Entrez le mois de date de mise en service : ");
            int mois = scanner.nextInt();

            System.out.println("Entrez l'année de date de mise en service : ");
            int annee = scanner.nextInt();

            Date dateMiseEnService = new Date(jour, mois , annee);


            System.out.println("Entrez le jour de contrôle technique : ");
            int jour1 = scanner.nextInt();

            System.out.println("Entrez le mois de contrôle technique  : ");
            int mois1 = scanner.nextInt();

            System.out.println("Entrez l'année de contrôle technique  : ");
            int annee1 = scanner.nextInt();

            Date dateControleTechnique = new Date(jour1, mois1 , annee1);

            System.out.println("Entrez l'année en cours  : ");
            int anneeEncours = scanner.nextInt();

            Date anneeActuel = new Date(anneeEncours);

            Voiture voiture = new Voiture(couleur, vitesse, direction, qteCarburant, dateMiseEnService, dateControleTechnique);
            
            voiture.evalueCT(anneeActuel);
        }
        
    }
}
