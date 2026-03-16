public class HoraExacta extends Hora {

    private int segundos;

    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);

        if (segundo >= 0 && segundo <= 59) {
            this.segundos = segundo;
        } else {
            this.segundos = 0;
        }
    }

    public boolean setSegundos(int valor) {
        if (valor >= 0 && valor <= 59) {
            segundos = valor;
            return true;
        }
        return false;
    }

    public void inc() {

        segundos++;

        if (segundos == 60) {
            segundos = 0;
            super.inc(); // incrementa un minuto usando la clase padre
        }
    }

    public String toString() {
        return super.toString() + ":" + String.format("%02d", segundos);
    }
}
