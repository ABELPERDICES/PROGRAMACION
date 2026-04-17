import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumerosReales {

    public static void main(String[] args) {

        double suma = 0;
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("NumerosReales.txt"))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] numeros = linea.split(" ");

                for (String num : numeros) {
                    double valor = Double.valueOf(num);
                    suma += valor;
                    contador++;
                }
            }

            double media = suma / contador;

            System.out.println("Suma: " + suma);
            System.out.println("Media: " + media);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: algún valor no es un número válido.");
        }
    }
}
