package corenetworks.modelo;

public class Animal {
    private String tipo;
    private int numExtremidades;
    private boolean vuela;
    private String tamano;

    //moverse, comer, sonidoEmitido
    public String moverse()
    {
        return "El animal se está moviendo";
    }
    public String comer()
    {
        return "El animal está comiendo";
    }
    public String sonidoEmitido()
    {
        return "El animal está emitiendo un sonido...";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "tipo='" + tipo + '\'' +
                ", numExtremidades=" + numExtremidades +
                ", vuela=" + vuela +
                ", tamano='" + tamano + '\'' +
                '}';
    }

    public Animal() {}

    public Animal(String tipo, int numExtremidades, boolean vuela, String tamano) {
        this.tipo = tipo;
        this.numExtremidades = numExtremidades;
        this.vuela = vuela;
        this.tamano = tamano;
    }



    public int getNumExtremidades() {
        return numExtremidades;
    }

    public void setNumExtremidades(int numExtremidades) {
        this.numExtremidades = numExtremidades;
    }

    public boolean getVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isVuela() {
        return vuela;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
}
