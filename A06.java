import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            int num = (int) (Math.random() * 100) + 1;

            numeros.add(num);
        }

        System.out.println("Colección original:");
        System.out.println(numeros);

        Integer[] tabla = numeros.toArray(new Integer[0]);

        Arrays.sort(tabla);

        ArrayList<Integer> ordenados = new ArrayList<>();

        for (Integer n : tabla) {
            ordenados.add(n);
        }

        System.out.println("\nColección ordenada de menor a mayor:");
        System.out.println(ordenados);

        Arrays.sort(tabla, Collections.reverseOrder());

        ArrayList<Integer> descendente = new ArrayList<>();

        for (Integer n : tabla) {
            descendente.add(n);
        }

        System.out.println("\nColección ordenada de mayor a menor:");
        System.out.println(descendente);
    }
}
