package corenetworks.modelo;

import java.util.Random;

public class Dado {

    private Random numAleatorio = new Random();

    public int lanzaDado()
    {
        int valorDado = numAleatorio.nextInt(1,7);
        return valorDado;
    }
    public static String Uno()
    {
        return "\n" + " * " + "\n";
    }
    public static String Dos()
    {
        return "\n" + "*" + "\n *";
    }

    public static String Tres()
    {
        return "* \n * \n *";
    }
    public static String Cuatro()
    {
        return "* *\n \n* *";
    }
    public static String Cinco()
    {
        return "* *\n * \n* *";
    }
    public static String Seis()
    {
        return "* *\n* *\n* *";
    }
    public String dibujar(int numero)
    {
        String dibujo = null;
        switch(numero)
        {case 1:
            dibujo = Uno();
            break;
            case 2:
                dibujo =Dos();
                break;
            case 3:
                dibujo =Tres();
                break;
            case 4:
                dibujo =Cuatro();
                break;
            case 5:
                dibujo =Cinco();
                break;
            case 6:
                dibujo =Seis();
                break;
            default:
                dibujo = "";
        }
        return dibujo;
    }
}
