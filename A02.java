import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {

    public static void main(String[] args) {

        FileReader fr = null;

        try {
  
            fr = new FileReader("src/main/java/Main.java");

            int caracter;

            while ((caracter = fr.read()) != -1) {
                System.out.print((char) caracter);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo.");
            }
        }
    }
}
