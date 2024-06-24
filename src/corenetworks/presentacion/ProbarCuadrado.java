package corenetworks.presentacion;

import corenetworks.modelo.Cuadrado;
import corenetworks.modelo.Figura;
import corenetworks.modelo.Triangulo;

public class ProbarCuadrado {
    public static void main(String[] args) {
        Cuadrado cPeque = new Cuadrado();
        cPeque.setX(0);
        cPeque.setY(0);
        cPeque.setLado(5);

        Figura cMediano = new Cuadrado(1, 1, 3);

        Cuadrado xx = (Cuadrado) cMediano;

        Triangulo tPeque = new Triangulo();
        tPeque.setX(3);
        tPeque.setY(2);
        tPeque.setBase(3);
        tPeque.setAltura(3);

        Figura tMediano = new Triangulo(3, 2, 5, 3);

        Figura[] figuras = new Figura[4];

        figuras[0] = cPeque;
        figuras[1] = cMediano;
        figuras[2] = tPeque;
        figuras[3] = tMediano;

        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Area -> " + figuras[i].calcularArea());
        }
        System.out.println("--For each ---");
        for (Figura elemento : figuras) {
            System.out.println("Area -> " + elemento.calcularArea());

        }
    }
}
