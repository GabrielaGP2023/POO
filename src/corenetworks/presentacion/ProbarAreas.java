package corenetworks.presentacion;

import corenetworks.modelo.Areas;

public class ProbarAreas {

    public static void main(String[] args) {
        Areas areas=new Areas();
        System.out.println(areas.areaCirculo(5.6));
        System.out.println(areas.areaRectangulo(6.5,9.5));
        System.out.println(areas.areaRectangulo(6.5,9.5));

        Areas a1 = new Areas();
        System.out.println(a1.areaCirculo(3.0));

    }
}
