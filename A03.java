import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        ArrayList<Integer> sinRepetidos = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            int num = (int) (Math.random() * 10) + 1;

            numeros.add(num);
        }

        for (Integer n : numeros) {

            if (!sinRepetidos.contains(n)) {
                sinRepetidos.add(n);
            }
        }

        System.out.println("Colección original:");
        System.out.println(numeros);

        System.out.println("\nColección sin repetidos:");
        System.out.println(sinRepetidos);
    }
}