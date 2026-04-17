import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoBuffer {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/Main.java"))) {

            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
