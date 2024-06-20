package corenetworks.modelo;

public class Areas {

    public double areaCirculo(double radio)
    {
        //A=πr2
        return Math.PI*Math.pow(radio,2);
    }
    public double areaRectangulo(double lado, double altura)
    {
        //A=l⋅a
        return lado*altura;
    }
}
