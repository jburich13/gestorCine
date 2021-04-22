package TGN2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Empleados extends Personas {
    private double sueldo = 40000.50;
    private String tipo;
    private Set<Espectadores> totalEspectadores = new HashSet<Espectadores>();


    //Constructor
    public Empleados (String nombre, int edad,int tipo, double sueldo){
        super(nombre, edad,tipo);
        this.sueldo = sueldo;
        
    }
    public Empleados(String nombre, int edad,int tipo) {
        super(nombre, edad, tipo);
    }

    //getter and setter
    public double getSueldo() {return sueldo;}
    public void setSueldo(double sueldo) {this.sueldo = sueldo;}

    public double modificarSueldo(double nuevoSueldo){
        return this.sueldo = nuevoSueldo;
    }
    //HAY QUE PONER LOS CONTROLES POR SI INGRESA UN NUMERO EN UN CAMPO STRING
    public Espectadores crearEspectadores(){
        Scanner sc = new Scanner(System.in);
        String nombre,fila,usuario;
        int edad,silla,tipo;
        System.out.println("Agregar espectadores: ");
        System.out.println("Nombre: ");
        nombre=sc.next();
        System.out.println("Edad: ");
        edad=sc.nextInt();
        System.out.println("Fila: ");
        fila=sc.next();
        System.out.println("Silla: ");
        silla=sc.nextInt();
        System.out.println("Tipo: ");
        tipo=sc.nextInt();
        return new Espectadores(nombre,edad,fila,silla,tipo);
    }

    //Metodos
    @Override
    public String toString() {
        return "Empleado: {" +
                "sueldo=" + sueldo +
                ", nombre='" + this.getNombre() + '\'' +
                ", edad='" + this.getEdad() + '\'' +
                '}';
    }
}
