import java.io.*;
import java.util.Scanner;

public class FicherosTodo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del fichero a copiar: ");
        String nombre = sc.nextLine();
        String copia = "copia_de_" + nombre;

        try (
            BufferedReader br = new BufferedReader(new FileReader(nombre));
            BufferedWriter bw = new BufferedWriter(new FileWriter(copia))
        ) {
            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Fichero copiado como: " + copia);

        } catch (IOException e) {
            System.out.println("Error al copiar: " + e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("Main.java"))) {

            String linea;
            System.out.println("\nContenido de Main.java:");

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer Main.java: " + e.getMessage());
        }

        double suma = 0;
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("NumerosReales.txt"))) {

            String linea;

            while ((linea = br.readLine()) != null) {
                String[] numeros = linea.trim().split("\\s+");

                for (String num : numeros) {
                    double valor = Double.valueOf(num);
                    suma += valor;
                    contador++;
                }
            }

            if (contador > 0) {
                double media = suma / contador;
                System.out.println("\nSuma: " + suma);
                System.out.println("Media: " + media);
            }

        } catch (IOException e) {
            System.out.println("Error al leer números: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: dato no válido.");
        }

        try (FileWriter fw = new FileWriter("texto.txt")) {

            String linea1 = "En un lugar de La Mancha,\n";

            for (int i = 0; i < linea1.length(); i++) {
                fw.write(linea1.charAt(i));
            }

        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }

        try (FileWriter fw = new FileWriter("texto.txt", true)) {

            fw.write("de cuyo nombre no quiero acordarme");

        } catch (IOException e) {
            System.out.println("Error al escribir (append): " + e.getMessage());
        }

        System.out.println("\nProceso terminado.");
    }
}
