package corenetworks.presentacion;

import corenetworks.modelo.Empleado;
import corenetworks.modelo.Gerente;
import corenetworks.modelo.Operador;
import corenetworks.modelo.Vendedor;

public class ProbarGerentePolimorfismo {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setSueldo(1500);
        System.out.println("Nomina -> " + g1.calcularNomina());

        Gerente g2 = new Gerente(1, "Ana Flores", "12345678D",
                3_000, 5, 1_000,"Ventas" );
        System.out.println("Nomina -> "+ g2.calcularNomina());
        //Polimorfismo
        //UpCasting
        Empleado ePolimorfismo = new Gerente(1,
                "Juan López","12345678A",
                2_000.0, 5, 200,
                "Ventas" );
//
        Gerente g3 = new Gerente(1,
                "Juan López","12345678A",
                2_000.0, 5, 200,
                "Ventas" );
        //UpCasting
        Empleado ePolimorfismo2 = g3;
        //DownCasting
        Gerente g4 = (Gerente) ePolimorfismo;

        Empleado e1 = new Empleado();
       // Gerente g5 = (Gerente) e1; Esta linea da el error ClassCastException

        Empleado e2 = new Vendedor(1, "Daniel Romero","1234567A",
                1_000,15_000,0.01);

        Empleado e3 = new Operador(3,"Pedro Pedro", "12345678A",1_000,2_000,0.0001);



        System.out.println(ePolimorfismo.getIdEmpleado());
        System.out.println(ePolimorfismo.calcularNomina());

        Empleado[] empleados = new Empleado[5];
        empleados[0]= ePolimorfismo;
        empleados[1] = new Empleado(1, "JuanLopez","12345678A",1000);
        empleados[2] = new Empleado(2, "Ana Flores","12345678B",1000);
        empleados[3] = e2;
        empleados[4]= e3;

        for(Empleado elemento : empleados){
            System.out.println("----Calculando la nomina adecuada ---");
            System.out.println(elemento.getClass());
            System.out.println(elemento.calcularNomina());
        }






    }
}
