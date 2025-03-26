package entity;

import java.util.Date;

public class Paiement {
    private double montant;
    private Date date;
    private String modePaiement;

    public Paiement(double montant, Date date, String modePaiement) {
        this.montant = montant;
        this.date = date;
        this.modePaiement = modePaiement;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(String modePaiement) {
        this.modePaiement = modePaiement;
    }

    public String tochaine(){
        return "\nDate: "+date+"\nMode de paiement: "+modePaiement+"\nMontant:  "+montant;
    }

    public void copy(Paiement paiement){
        date=paiement.getDate();
        montant=paiement.getMontant();
        modePaiement=paiement.getModePaiement();
    }

    public boolean egale(Paiement paiement){
        return this.date==paiement.getDate() && this.modePaiement.equals(paiement.getModePaiement()) && this.montant==paiement.getMontant();
    }
}
