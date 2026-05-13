import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        try (Scanner sc = new Scanner(System.in)) {

            int num;

            System.out.println("Introduce números enteros no negativos (-1 para terminar):");

            do {
                num = sc.nextInt();

                if (num != -1) {

                    if (num >= 0) {
                        numeros.add(num);
                    } else {
                        System.out.println("Solo se permiten números no negativos.");
                    }
                }

            } while (num != -1);

            System.out.println("\nColección completa:");
            System.out.println(numeros);

            System.out.println("\nValores pares:");

            for (Integer n : numeros) {
                if (n % 2 == 0) {
                    System.out.print(n + " ");
                }
            }

            Iterator<Integer> it = numeros.iterator();

            while (it.hasNext()) {
                Integer n = it.next();

                if (n % 3 == 0) {
                    it.remove();
                }
            }

            System.out.println("\n\nColección después de eliminar múltiplos de 3:");
            System.out.println(numeros);

        } catch (Exception e) {
            System.out.println("Error: debes introducir números enteros.");
        }
    }
}
