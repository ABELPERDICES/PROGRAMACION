import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 30; i++) {

            int num = (int) (Math.random() * 100) + 1;

            lista.add(num);
        }

        System.out.println("Lista original:");
        System.out.println(lista);

        HashSet<Integer> hashSet = new HashSet<>(lista);

        System.out.println("\nHashSet:");
        System.out.println(hashSet);

        System.out.println("El HashSet elimina repetidos, "
                + "pero NO mantiene ningún orden específico.");

        TreeSet<Integer> treeSet = new TreeSet<>(lista);

        System.out.println("\nTreeSet:");
        System.out.println(treeSet);

        System.out.println("El TreeSet elimina repetidos "
                + "y ordena los elementos de menor a mayor.");

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(lista);

        System.out.println("\nLinkedHashSet:");
        System.out.println(linkedHashSet);

        System.out.println("El LinkedHashSet elimina repetidos "
                + "y mantiene el orden de inserción.");
    }
}
