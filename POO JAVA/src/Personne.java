public class Personne {
    String nom;
    int age;

    Personne (String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void sePresenter() {
        System.out.println("Bonjour, je m'appelle " + this.nom + " et j'ai " + this.age + " ans !");
    }

    public boolean esMajeur() {
        return this.age >= 18;
    }
}
