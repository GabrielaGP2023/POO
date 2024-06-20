package corenetworks.presentacion;

import corenetworks.modelo.Animal;

public class TestAnimal {

    public static void main(String[] args) {
        Animal perro=new Animal("mamifero", 4,false,"mediano");
        Animal pez =new Animal("pez",0,false,"pequeño");
        Animal cocodrilo = new Animal("reptil",4,false,"grande");


        System.out.println(perro.getNumExtremidades());
        System.out.println(perro.getTamano());
        System.out.println(perro.getVuela());
        System.out.println(perro.toString());
        System.out.println(perro.comer());
        System.out.println(perro.moverse());
        System.out.println(perro.sonidoEmitido());

        //pez
        pez.setNumExtremidades(2);
        pez.setVuela(true);

        System.out.println(pez.getNumExtremidades());
        System.out.println(pez.toString());
        cocodrilo.setNumExtremidades(5);

        //cocodrilo
        cocodrilo.setVuela(true);

        System.out.println(cocodrilo.getNumExtremidades());
        System.out.println(cocodrilo.toString());
    }
}
