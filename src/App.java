public class App {
    public static void main(String[] args) throws Exception {
        Koira koira1 = new Koira();
        koira1.liiku();
        koira1.hauku();
    }
} // Appin lopetus

class Elain {
    public double paino;

    public void liiku() {
        System.out.println("Eläin liikkuu");
    }
}

class Koira extends Elain {
    String rotu;

    public void hauku() {
        System.out.println("Koira haukkuu");
    }
}

class Lintu extends Elain {
    String laji;

    public void haudo() {
        System.out.println("Lintu hautoo");
    }
}
