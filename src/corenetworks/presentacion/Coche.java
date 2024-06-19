package corenetworks.presentacion;

public class Coche {
    //1.Atributos
    public String color;
    public boolean electrico;
    public String tipoRuedas;
    //2. Metodos

    public String acelerar(){
        return  "El coche está acelerando ..";
    }
    public String frenar(){
        return  "El coche está frenando ..";
    }
     public String aparcar(){
        return  "El coche está aparcando ..";
    }



    //3. Constructores
    //Sobrecarga - cuando hay varios metodos con el mismo nombre
    //y diferentes argumentos

    public Coche(){}

    public Coche(String colorEntrada){
        color = colorEntrada;
    }

    public  Coche(String colorEntrada, boolean electricoEntrada, String tipoRuedasEntrada){
        color = colorEntrada;
        electrico =electricoEntrada;
        tipoRuedas = tipoRuedasEntrada;
    }

    //4. Setters y Getters
}
