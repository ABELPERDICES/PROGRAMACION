import java.util.Scanner;

public class LeerEntero {

    static Scanner sc = new Scanner(System.in);

    
    public static Integer leerEntero() {
        Integer numero = null;
        boolean valido = false;

        while (!valido) {
            System.out.print("Introduce un número entero: ");
            String entrada = sc.nextLine();

            try {
                numero = Integer.parseInt(entrada);
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes introducir un número entero válido.");
            }
        }
        return numero;
    }

    public static Integer leerEnteroThrows() throws NumberFormatException {
        System.out.print("Introduce un número entero: ");
        String entrada = sc.nextLine();
        return Integer.parseInt(entrada);
    }

    public static Integer leerEnteroRecursivo() {
        System.out.print("Introduce un número entero: ");
        String entrada = sc.nextLine();

        try {
            return Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes introducir un número entero válido.");
            return leerEnteroRecursivo();
        }
    }

    public static void main(String[] args) {

        Integer n1 = leerEntero();
        System.out.println("Número leído (bucle): " + n1);

        boolean valido = false;
        while (!valido) {
            try {
                Integer n2 = leerEnteroThrows();
                System.out.println("Número leído (throws): " + n2);
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: formato incorrecto. Inténtalo de nuevo.");
            }
        }

        Integer n3 = leerEnteroRecursivo();
        System.out.println("Número leído (recursivo): " + n3);
    }
}

 
   