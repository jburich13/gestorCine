package TGN2;


import java.util.Scanner;

public class Cine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario;
        //INSTANCIAS
        Salas sala1 = new Salas(3,"Sala1", "Joker");
        Empleados empleado1 = new Empleados("juan", 23,2,500.5);
        Acomodadores pedro = new Acomodadores("pedro",2,2,"sala nueva");
        Espectadores juan = new Espectadores("Juan",19,"2",3,3);
        Espectadores espectador;

        System.out.println(empleado1.getSueldo());
        empleado1.modificarSueldo(43876.23);
        System.out.println(empleado1.getSueldo());

        do {
            espectador=empleado1.crearEspectadores();
            sala1.agregarEspectadores(espectador);
            System.out.println("Desea seguir agregando espectadores?");
            usuario=sc.next();
            sala1.listarEspectadores();
        }while (usuario.equals("si"));








        juan.metodoRevelar();

        //pedro.asignacionSala(sala1);
        //pedro.modificarSala(sala1);



    }
}
