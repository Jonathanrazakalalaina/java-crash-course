public class Chien extends Animal {
    public Chien(String nom) {
        super(nom);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(nom + " aboie : Waf waf !");
    }
}
