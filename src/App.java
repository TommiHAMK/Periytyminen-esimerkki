public class App {
    public static void main(String[] args) throws Exception {
        Koira koira1 = new Koira();
        Lintu lintu1 = new Lintu();
        koira1.liiku();
        koira1.hauku();
        lintu1.liiku();
        lintu1.tulostaTiedot();
    }
} // Appin lopetus

class Elain {
    public double paino;

    public void liiku() {
        System.out.println("Eläin liikkuu");
    }

    public void tulostaTiedot() {
        System.out.println("Paino: " + paino);
    }
}

class Koira extends Elain {
    String rotu;

    public void hauku() {
        System.out.println("Koira haukkuu");
    }

    @Override
    public void liiku() {
        System.out.println("Koira juoksee");
    }
}

class Lintu extends Elain {
    String laji;

    public void haudo() {
        System.out.println("Lintu hautoo");
    }

    @Override
    public void liiku() {
        System.out.println("Lintu lentää");
    }
}
