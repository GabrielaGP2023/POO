package corenetworks.modelo;

public class  Gerente extends Empleado{

    private int numPersonasCargo;
    private double bono;
    private String departamento;

    @Override
    public double calcularNomina() {
        return super.calcularNomina() + bono;
    }

    //Constructores
    // Constructores NO se heredan

   //Sobrecarga
    public Gerente() {
    }

    public Gerente(int idEmpleado, String nombre, String nDNI, double sueldo,
                   int numPersonasCargo,
                   double bono, String departamento) {
        super(idEmpleado, nombre, nDNI, sueldo);
        this.numPersonasCargo = numPersonasCargo;
        this.bono = bono;
        this.departamento = departamento;

    }

    public int getNumPersonasCargo() {
        return numPersonasCargo;
    }

    public void setNumPersonasCargo(int numPersonasCargo) {
        this.numPersonasCargo = numPersonasCargo;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
