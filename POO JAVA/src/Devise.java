public class Devise {
    double montantAr;
    double montantDollar;

    Devise (double montantAr, double montantDollar) {
        this.montantAr = montantAr;
        this.montantDollar = montantDollar;
    }

    public void convertirArEnDollar() {
        double resultat = montantAr / 4440;
        System.out.println(montantAr + " Ariary = " + resultat + " Dollar");
    }

    public void convertirDollarEnAr() {
        double resultat = montantDollar * 4440;
        System.out.println(montantDollar + " Dollar(s) = " + resultat + " Ariary");
    }
}
