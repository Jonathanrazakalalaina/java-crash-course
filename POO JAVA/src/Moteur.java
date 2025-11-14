public class Moteur {
    private String type;
    private int puissance;

    public Moteur(String type, int puissance) {
        this.type = type;
        this.puissance = puissance;
    }

    public void demarrer() {
        System.out.println("Le moteur " + this.type + " démarre.");
    }

    public void afficher() {
        System.out.println("Moteur " + this.type + " : " + puissance + " CV");
    }
}
