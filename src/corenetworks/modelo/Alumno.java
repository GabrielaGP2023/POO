package corenetworks.modelo;

public class Alumno {
    private String nombre;
    private float parciales[];
    public Alumno(String nombre, int noParciales) {
        this.nombre = nombre;
        this.parciales = new float[noParciales];
    }
    public void setParciales(int noParcial, float nota) {
        if((noParcial > 0 && noParcial <= parciales.length) && (nota >=0 && nota<=10)){
            parciales[noParcial-1]= nota;
        }
    }
    public float promedio()
    {
        int suma=0;
        for (int i = 0; i < parciales.length; i++) {
            suma += parciales[i];
        }
        return suma / parciales.length;
    }
    public String muestra()
    {
        String resultado= "";
        for (int i = 0; i < parciales.length; i++) {
            resultado += parciales[i] + " , ";
        }
        return resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
