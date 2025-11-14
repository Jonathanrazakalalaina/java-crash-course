public class Animal {
    protected String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    public void faireDuBruit() {
        System.out.println(nom + " fait du bruit");
    }
}
