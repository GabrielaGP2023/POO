package corenetworks.modelo;

public class Guitarra extends InstrumentoMusical{
    private String tipoCuerdas;

    @Override
    public String emiteSonido() {
        return "gli gli";
    }

    public Guitarra() {
    }

    public Guitarra(String marca, String tipoCuerdas) {
        super(marca);
        this.tipoCuerdas = tipoCuerdas;
    }

    public String getTipoCuerdas() {
        return tipoCuerdas;
    }

    public void setTipoCuerdas(String tipoCuerdas) {
        this.tipoCuerdas = tipoCuerdas;
    }
}
