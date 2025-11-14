public class App {
    public static void main(String[] args) {
       Animal a = new Animal("Bobby");
    //    polymorphisme
       Animal c = new Chien("Rex");
       Animal ch = new Chat("Kitty");

       a.faireDuBruit();
       c.faireDuBruit();
       ch.faireDuBruit();
    }
}
