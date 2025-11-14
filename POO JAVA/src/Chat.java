public class Chat extends Animal {
    public Chat(String nom) {
        super(nom);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(nom + " miaule : Miaou miaou !");
    }
}
