import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Socio> socios = new HashSet<>();

        socios.add(new Socio("111A", "Ana"));
        socios.add(new Socio("222B", "Luis"));
        socios.add(new Socio("333C", "Marta"));

        socios.add(new Socio("111A", "Carlos"));

        System.out.println("HashSet de socios:");
        System.out.println(socios);

        System.out.println("\n¿Se ha duplicado el socio?");
        System.out.println("No, porque tienen el mismo DNI.");

        TreeSet<Socio> sociosOrdenados = new TreeSet<>(socios);

        sociosOrdenados.add(new Socio("444D", "Pedro"));

        System.out.println("\nSocios ordenados por DNI:");
        System.out.println(sociosOrdenados);

        ArrayList<Socio> listaSocios = new ArrayList<>(sociosOrdenados);

        Socio segundo = listaSocios.get(1);

        System.out.println("\nSegundo socio:");
        System.out.println(segundo);
    }
}

class Socio implements Comparable<Socio> {

    private String dni;
    private String nombre;

    public Socio(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Socio otro) {
        return this.dni.compareTo(otro.dni);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Socio socio = (Socio) obj;

        return dni.equals(socio.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return "Socio{dni='" + dni + "', nombre='" + nombre + "'}";
    }
}
