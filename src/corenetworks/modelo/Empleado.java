package corenetworks.modelo;

public class Empleado {
   //1. atributos
    protected int idEmpleado;
    protected String nombre;
    protected String nDNI;
    protected double sueldo;

    //2. Métodos
    public double calcularNomina(){
        return sueldo*0.85;
    }

    //3. Constructores


    public Empleado() {
    }

    public Empleado(int idEmpleado, String nombre, String nDNI, double sueldo) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.nDNI = nDNI;
        this.sueldo = sueldo;
    }

    //4. Setters y Getters

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnDNI() {
        return nDNI;
    }

    public void setnDNI(String nDNI) {
        this.nDNI = nDNI;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
