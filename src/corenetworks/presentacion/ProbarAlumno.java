package corenetworks.presentacion;

import corenetworks.modelo.Alumno;

public class ProbarAlumno {
    public static void main(String[] args) {
        Alumno objAlumno = new Alumno("Pedro", 3);
        objAlumno.setParciales(1, 8);
        objAlumno.setParciales(2, 9);
        objAlumno.setParciales(3, 7);
        System.out.println("Las notas son: " + objAlumno.muestra());
        System.out.println(objAlumno.promedio());
    }
}
