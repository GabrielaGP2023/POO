package corenetworks.modelo;

public class Vendedor extends Empleado{
    private double ventas;
    private double comision;

    @Override
    public double calcularNomina() {
        return super.calcularNomina() + (ventas*comision*PORCENTAJE);
    }

    public Vendedor() {
    }

    public Vendedor(int idEmpleado, String nombre, String nDNI, double sueldo, double ventas, double comision) {
        super(idEmpleado, nombre, nDNI, sueldo);
        this.ventas = ventas;
        this.comision = comision;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}
