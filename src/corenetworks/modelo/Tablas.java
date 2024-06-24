package corenetworks.modelo;

public class Tablas {
    int numero;

    public Tablas(int numero) {
        this.numero = numero;
    }

    public String muestraTabla() {
        String cadena = "";
        for (int i = 1; i <= 10; i++) {
            cadena += numero + " x " + i + " = " + numero * i + "\n";
        }
        return cadena;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
