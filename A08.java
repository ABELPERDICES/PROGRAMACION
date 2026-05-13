import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> listaA = new ArrayList<>();

        listaA.add("Ana");
        listaA.add("Luis");
        listaA.add("Marta");
        listaA.add("Luis");

        ArrayList<String> listaB = new ArrayList<>();

        listaB.add("Ana");
        listaB.add("Luis");
        listaB.add("Marta");
        listaB.add("Luis");

        System.out.println("¿listaA y listaB son iguales?");
        System.out.println(listaA.equals(listaB));

        System.out.println("\nPrimera posición de Luis en listaB:");
        System.out.println(listaB.indexOf("Luis"));

        System.out.println("Última posición de Luis en listaB:");
        System.out.println(listaB.lastIndexOf("Luis"));
        Collections.sort(listaA);

        System.out.println("\nlistaA ordenada alfabéticamente:");
        System.out.println(listaA);

        System.out.println("\n¿listaA y listaB son iguales ahora?");
        System.out.println(listaA.equals(listaB));

        Collections.sort(listaB, Collections.reverseOrder());

        System.out.println("\nlistaB ordenada de Z a A:");
        System.out.println(listaB);
    }
}
