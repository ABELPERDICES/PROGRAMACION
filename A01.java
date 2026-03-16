public class Hora {

    private int hora;
    private int minutos;

    public Hora(int hora, int minutos) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            this.hora = 0; 
        }

        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        } else {
            this.minutos = 0;
        }
    }

    public void inc() {
        minutos++;

        if (minutos == 60) {
            minutos = 0;
            hora++;

            if (hora == 24) {
                hora = 0;
            }
        }
    }

    public boolean setMinutos(int valor) {
        if (valor >= 0 && valor <= 59) {
            minutos = valor;
            return true;
        }
        return false;
    }

    public boolean setHora(int valor) {
        if (valor >= 0 && valor <= 23) {
            hora = valor;
            return true;
        }
        return false;
    }

    public String toString() {
        return String.format("%02d:%02d", hora, minutos);
    }
}
 
   