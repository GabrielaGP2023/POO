package corenetworks.modelo;

public class Flauta extends InstrumentoMusical {
    private String material;

    @Override
    public String emiteSonido() {
        return "flu flu";
    }

    public Flauta() {
    }

    public Flauta(String marca, String material) {
        super(marca);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
