package entity;

import java.util.Date;
public class Dette {
    private double montantDette;
    private Date dateDette;
    private double montantRestant;
    private double montantPaye;

    public Dette(double montantDette, Date dateDette) {
        this.montantDette = montantDette;
        this.dateDette = dateDette;
        this.montantPaye = 0;
        this.montantRestant = montantDette - montantPaye;
    }


    public double getMontantDette() {
        return montantDette;
    }

    public void setMontantDette(double montantDette) {
        this.montantDette = montantDette;
    }

    public Date getDateDette() {
        return dateDette;
    }

    public void setDateDette(Date dateDette) {
        this.dateDette = dateDette;
    }

    public double getMontantRestant() {
        return montantRestant;
    }

    public void setMontantRestant(double montantRestant) {
        this.montantRestant = montantRestant;
    }

    public double getMontantPaye() {
        return montantPaye;
    }

    public void setMontantPaye(double montantPaye) {
        this.montantPaye = montantPaye;
    }


    public String tochaine() {
        return "\nDate: " + dateDette + "\nMontant Dette" + montantDette + "\nMontant Payé: " + montantPaye + "\nMontant restant:  " + montantRestant;
    }

    public void copy(Dette dette) {
        dateDette=dette.getDateDette();
        montantDette=dette.getMontantDette();
        montantPaye=dette.getMontantPaye();
        montantRestant=dette.getMontantRestant();
    }

    public boolean egal(Dette dette){
        return this.dateDette==dette.getDateDette() && this.montantPaye==dette.getMontantPaye() && this.montantRestant==dette.getMontantRestant() && this.montantDette==dette.getMontantDette();
    }

    public void payer(double montant) {
        this.montantPaye += montant;
        this.montantRestant -= montant;
    }
}