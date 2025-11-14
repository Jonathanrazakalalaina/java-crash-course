public class CompteBancaire {
    private String titulaire;
    private double solde;

    // encapsulation des attributs

    public CompteBancaire(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = (solde >= 0) ? solde : 0;
    }

    public double getSolde() {
        return solde;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        }
    }

    public boolean retirer (double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            return true;
        }
        return false;
    }

}
