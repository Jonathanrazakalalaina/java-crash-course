public class Voiture {
    private String marque;
    private Moteur moteur;

    public Voiture(String marque, Moteur moteur) {
        this.marque = marque;
        this.moteur = moteur;
    }

    public void demarrer() {
        System.out.println("Demarrer " + marque);
        moteur.demarrer();
    }

    public void afficher() {
        System.out.println("Voiture : " + marque);
        moteur.afficher();
    }

}
