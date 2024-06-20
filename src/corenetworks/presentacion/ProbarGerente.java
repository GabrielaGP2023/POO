package corenetworks.presentacion;

import corenetworks.modelo.Gerente;

public class ProbarGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setSueldo(1500);
        System.out.println("Nomina -> " + g1.calcularNomina());

        Gerente g2 = new Gerente(1, "Ana Flores", "12345678D",
                3_000, 5, 1_000,"Ventas" );
        System.out.println("Nomina -> "+ g2.calcularNomina());

    }
}
