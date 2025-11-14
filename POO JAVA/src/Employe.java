public class Employe {
    private String nom;
    private double salaire;

    // utilisation du mot static : pas besoin de declarer une instance de la classe pour y acceder (new ...) mais peut être appelé directement dans Main.

    public static int nombreEmployes = 0;

    public Employe(String nom, double salaire) {
        this.nom = nom;
        this.salaire = salaire;
        nombreEmployes++;
    }

    public static void partirEnPause() {
        System.out.println("Tout le monde part en pause !");
    }
}
