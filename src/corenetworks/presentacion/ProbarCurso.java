package corenetworks.presentacion;

import corenetworks.modelo.Curso;

public class ProbarCurso {
    public static void main(String[] args) {
        //Instanciar la clase Curso
        Curso c1 = new Curso(1,
                "programación en java",1_500.00,60f);
        c1.setRequisitos("ESO");
        c1.setModalidad("Presencial");
        c1.setTipoCurso("Infomatica");
        c1.setContenido("JSE y acceso a BBDD");
        System.out.println(c1.mostrarInformacion());
        System.out.println(c1.getTipoCurso());
    }
}
