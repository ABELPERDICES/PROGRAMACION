import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>();

        lista1.add(10);
        lista1.add(20);
        lista1.add(30);
        lista1.add(40);

        ArrayList<Integer> lista2 = new ArrayList<>();

        lista2.add(99);
        lista2.add(99);

        lista1.add(0, 5);

        lista1.addAll(2, lista2);

        System.out.println("Elemento del índice 4: " + lista1.get(4));

        int valorSustituido = lista1.set(lista1.size() - 1, 500);

        System.out.println("Valor sustituido: " + valorSustituido);

        lista1.remove(1);

        lista1.remove(Integer.valueOf(99));

        System.out.println("Estado final de lista1:");
        System.out.println(lista1);
    }
}
