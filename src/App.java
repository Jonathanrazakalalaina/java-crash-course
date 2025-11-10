
import java.util.Scanner;

public class App {

    static int somme(int a, int b) {
        return a + b;
    }

    static int factorielle(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorielle(n - 1);
        }
    }

    static boolean estPremier(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void tableMultiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    static int puissance(int base, int exposant) {
        int resultat = 1;
        for (int i = 0; i < exposant; i++) {
            resultat *= base;
        }
        return resultat;
    }

    public static void main(String[] args) {
        int option = 0;

        while (option != 6) {

            System.err.println("1 - Calculer une somme");
            System.err.println("2 - Calculer la factorielle d'un nombre");
            System.err.println("3 - Nombre premier ou pas ?");
            System.err.println("4 - Afficher la table de multiplication");
            System.err.println("5 - Calculer une puissance");
            System.err.println("6 - Quitter");
            System.out.print("Choisir une option : ");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("Entrer deux nombres : ");
                    System.out.print("Nombre 1 : ");
                    int a = scanner.nextInt();
                    System.out.print("Nombre 2 : ");
                    int b = scanner.nextInt();
                    System.out.println("La somme est : " + somme(a, b));
                    }
                case 2 -> {
                    System.out.print("Entrer un nombre : ");
                    int n = scanner.nextInt();
                    System.out.println("La factorielle est : " + factorielle(n));
                    }
                case 3 -> {
                    System.out.print("Entrer un nombre : ");
                    int num = scanner.nextInt();
                    if (estPremier(num)) {
                        System.out.println(num + " est un nombre premier.");
                    } else {
                        System.out.println(num + " n'est pas un nombre premier.");
                    }
                    }
                case 4 -> {
                    System.out.print("Entrer un nombre : ");
                    int mult = scanner.nextInt();
                    tableMultiplication(mult);
                    }
                case 5 -> {
                    System.out.println("Entrer la base et l'exposant : ");
                    System.out.print("Base : ");
                    int base = scanner.nextInt();
                    System.out.print("Exposant : ");
                    int exposant = scanner.nextInt();
                    System.out.println("Le resultat est : " + puissance(base, exposant));
                    }
                case 6 -> {
                    System.out.println("Au revoir!");
                    scanner.close();
                    System.exit(0);
                    }
            
                default -> {
                    System.out.println("Option invalide. Veuillez réessayer.");
                }
            }
        }
    } 
}
