package corenetworks.presentacion;

import corenetworks.modelo.Coche;

public class Main {
    public static void main(String[] args) {
        //Instanciar - crear un objeto

        Coche c1 = new Coche();

        //Asignar valor a los atributos
        //nomenclatura objeto
        c1.color = "Amarillo";
        c1.electrico = false;
        c1.tipoRuedas = "Deportivas";

        System.out.println(c1.acelerar());
        System.out.println(c1.aparcar());
        System.out.println(c1.frenar());

        //Se pueden tener varios objetos de una misma clase

        Coche c2 = new Coche("Rojo",
                true,"Deportivas");

        //Asignar valor a los atributos
        //nomenclatura objeto


        System.out.println(c2.acelerar());
        System.out.println(c2.aparcar());
        System.out.println(c2.frenar());
        int integer=0;
        String numericString = switch(integer) {
            case 0 ->
                "hola 0";

            case 1, 3, 5, 7, 9 -> {
                String value = "hola 5";
                yield value;
            }
            case 2, 4, 6, 8, 10 -> {
                String value = "hola 6";
                yield value;
            }
            default -> {
                String value = "hola D";
                yield value;
            }


        };
        System.out.println(numericString);



    }
}