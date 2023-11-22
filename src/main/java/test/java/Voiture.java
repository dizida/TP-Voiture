package test.java;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Voiture {
    
    private String couleur;
    private int vitesse ; 
    private String direction;
    private double quantitéDeCarburant;
    private Date miseEnService;
    private Date controleTechnique;
    private int anneeEnCours;

    

    @Override
    public String toString() {
        return "Voiture [couleur=" + couleur + ", vitesse=" + vitesse + ", direction=" + direction
                + ", quantitéDeCarburant=" + quantitéDeCarburant + ", dateMiseEnService=" + miseEnService
                + ", dateControleTechnique=" + controleTechnique + "]";
    }

    public Voiture(String couleur, int vitesse, String direction, double quantitéDeCarburant, Date miseEnService,
    Date controleTechnique) {
        this.couleur = couleur;
        this.vitesse = vitesse;
        this.direction = direction;
        this.quantitéDeCarburant = quantitéDeCarburant;
        this.miseEnService = miseEnService;
        this.controleTechnique = controleTechnique;


    }

    public Voiture() {
        this.couleur = "blanche";
        this.vitesse = 0;
        this.direction = "aucunes";
        this.quantitéDeCarburant = 30.5;
        this.miseEnService = new Date (20,10,2024);
        this.controleTechnique = new Date (20,10,2024);
        
    }

    public void demarre(){
        this.setVitesse(20);
    }

    public void arret(){
        this.setVitesse(0);
    }

    public void freine(int valeur){
        this.setVitesse(this.getVitesse() - valeur); 
    }

    public void accelere(int valeur){
        this.setVitesse(this.getVitesse() + valeur); 
    }

    public void evalueCT(Date anneeAc){
        
        if(anneeAc.getAnnee() - this.miseEnService.getAnnee() > 4 && anneeAc.getAnnee() - this.controleTechnique.getAnnee() > 2){
            System.out.println("mise en service en" + this.miseEnService.getAnnee()  +  " - Pas de CT ==> NON");
        }

        if(anneeAc.getAnnee() - this.miseEnService.getAnnee() == 4 ){
            System.out.println("mise en service en" + this.miseEnService.getAnnee()+  " CT doit être fait");
        }

        if(anneeAc.getAnnee() - this.miseEnService.getAnnee()  > 4 && anneeAc.getAnnee() - this.controleTechnique.getAnnee() < 2)

            System.out.println("mise en service en" + this.miseEnService.getAnnee() +  "- pas de CT  ==> OK ");

        
        if(anneeAc.getAnnee() - this.miseEnService.getAnnee()  > 4 && anneeAc.getAnnee() - this.controleTechnique.getAnnee() ==2)

            System.out.println("mise en service en" + this.miseEnService.getAnnee() +  "- pas de CT  ==> OK ");

    }


    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    
}


