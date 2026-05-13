import java.util.Arrays;

public class Main {

    public static <T> T[] guardar(T elemento, T[] tabla) {

        T[] nuevoArray = Arrays.copyOf(tabla, tabla.length + 1);
        nuevoArray[nuevoArray.length - 1] = elemento;
        return nuevoArray;
    }

    public static void main(String[] args) {

        String[] nombres = {};

        nombres = guardar("Ana", nombres);
        nombres = guardar("Carlos", nombres);
        Integer[] numeros = {};

        numeros = guardar(10, numeros);
        numeros = guardar(20, numeros);

        System.out.println("Array de Strings:");
        System.out.println(Arrays.toString(nombres));

        System.out.println("Array de Integer:");
        System.out.println(Arrays.toString(numeros));
    }
}

 
   