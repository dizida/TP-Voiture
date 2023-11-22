package test.java;

public class Date {
    
    private int jour;
    private int mois;
    private int annee;


public Date(int jour, int mois, int annee){
    this.jour = jour;
    this.mois = mois;
    this.annee = annee;

    this.verificationDate();
}

public Date(int annee){
    
    this.annee = annee;
}





@Override
public String toString() {
    if (jour <10 && mois<10){
        return "Date " + "0"+jour +  "/" + "0"+ mois + "/"+ annee ;
    }if (jour<10){
       return "Date " + "0"+jour +  "/" + mois + "/"+ annee ; 
    }if(mois<10){
      return "Date " +jour +  "/" + "0"+ mois + "/"+ annee ;   
    }else
    return "Date " + jour + "/" + mois + "/"+ annee ;
}



public void verificationDate(){
    if(jour < 1 || jour > 31){
        this.setJour(1);
        
    }if(mois > 12 || mois < 1){
        this.setMois(1);
        
        //Une année bissextile (ou un an bissextil) est une année comportant 366 jours au lieu des 365
    }if ((jour == 29 || jour == 30 || jour == 31) && mois == 2 && annee%4!=0){
        this.setJour(1);
        
    }this.verificationMois();
        System.out.println(this);
}

public void verificationMois(){
    if((mois==8 || mois==10 || mois==12 || mois==01|| mois==03|| mois==05 || mois==07)  &&  jour == 30){
        this.setJour(1);
    }

    if((mois==9 || mois==11 || mois==03 || mois==04|| mois==06)  &&  jour == 31){
        this.setJour(1);
    }
}




public int getJour() {
    return jour;
}

public void setJour(int jour) {
    this.jour = jour;
}

public int getMois() {
    return mois;
}

public void setMois(int mois) {
    this.mois = mois;
}

public int getAnnee() {
    return annee;
}

public void setAnnee(int annee) {
    this.annee = annee;
}

}