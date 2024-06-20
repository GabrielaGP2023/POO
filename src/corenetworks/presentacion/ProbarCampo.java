package corenetworks.presentacion;

import corenetworks.modelo.Campo;

public class ProbarCampo {
    public static void main(String[] args) {
        Campo c1 = new Campo(5);
        c1.increntar();;
        System.out.println(c1.mostrar());
    }
}
