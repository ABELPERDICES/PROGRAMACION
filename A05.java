import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

    public static void main(String[] args) {

        try {

            FileWriter fw = new FileWriter("texto.txt");

            String linea1 = "En un lugar de La Mancha,\n";

            for (int i = 0; i < linea1.length(); i++) {
                fw.write(linea1.charAt(i));
            }

            fw.close();

            FileWriter fwAppend = new FileWriter("texto.txt", true);

            fwAppend.write("de cuyo nombre no quiero acordarme");

            fwAppend.close();

            System.out.println("Texto escrito correctamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }
}
