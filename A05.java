import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            int num = (int) (Math.random() * 10) + 1;

            numeros.add(num);
        }

        System.out.println("Colección original:");
        System.out.println(numeros);

        ArrayList<Integer> eliminar = new ArrayList<>();

        eliminar.add(5);

        numeros.removeAll(eliminar);

        System.out.println("\nColección después de eliminar los 5:");
        System.out.println(numeros);
    }
}
