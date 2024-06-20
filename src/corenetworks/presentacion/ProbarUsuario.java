package corenetworks.presentacion;

import corenetworks.modelo.Usuario;

public class ProbarUsuario {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario("kaltorak","12345","David","mi casa");

        System.out.println(u1.mostrarInformacion());
        System.out.println(u2.mostrarInformacion());
        u1.setUsuario("starcream");
        u1.setContrasena("123456");
        u1.setNombre("mateo");
        u1.setDireccion("su casa");
        System.out.println(u1.mostrarInformacion());
        System.out.println(u1.toString());
        System.out.println(u2.getUsuario() + u2.getContrasena() + u2.getNombre() + u2.getDireccion());
    }
}
