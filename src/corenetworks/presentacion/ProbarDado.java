package corenetworks.presentacion;

import corenetworks.modelo.Dado;

public class ProbarDado {
    public static void main(String[] args) {
        Dado objdado = new Dado();
        System.out.println(objdado.dibujar(objdado.lanzaDado()));
    }
}
