import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            int num = (int) (Math.random() * 10) + 1;

            numeros.add(num);
        }

        System.out.println("Colección original:");
        System.out.println(numeros);

        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()) {

            Integer n = it.next();

            if (n == 5) {
                it.remove();
            }
        }

        System.out.println("\nColección después de eliminar los 5:");
        System.out.println(numeros);
    }
}
