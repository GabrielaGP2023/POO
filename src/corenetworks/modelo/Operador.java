package corenetworks.modelo;

public class Operador extends Empleado{
    private int piezas;
    private double incentivo;

    @Override
    public double calcularNomina() {
        return super.calcularNomina() + (piezas*incentivo*PORCENTAJE);
    }

    public Operador() {
    }

    public Operador(int idEmpleado, String nombre, String nDNI, double sueldo, int piezas, double incentivo) {
        super(idEmpleado, nombre, nDNI, sueldo);
        this.piezas = piezas;
        this.incentivo = incentivo;
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }
}
