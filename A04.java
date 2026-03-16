public enum Nota {
    DO, RE, MI, FA, SOL, LA, SI
}


abstract class Instrumento {

    protected Nota[] melodia = new Nota[100];
    protected int numNotas = 0;

    public void add(Nota n) {
        if (numNotas < melodia.length) {
            melodia[numNotas] = n;
            numNotas++;
        }
    }

    public abstract void interpretar();
}


class Piano extends Instrumento {

    @Override
    public void interpretar() {
        System.out.print("Piano interpretando: ");

        for (int i = 0; i < numNotas; i++) {
            System.out.print(melodia[i] + " ");
        }

        System.out.println();
    }
}


public class Main {

    public static void main(String[] args) {

        Piano p = new Piano();

        p.add(Nota.DO);
        p.add(Nota.MI);
        p.add(Nota.SOL);
        p.add(Nota.DO);

        p.interpretar();
    }
}
