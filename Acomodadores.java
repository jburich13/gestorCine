package TGN2;

import java.util.Scanner;

public class Acomodadores extends Empleados implements ParaAcomodadores{
    private String salas;

    //Constructor
    public Acomodadores (String nombre, int edad,int tipo, String salas){
        super(nombre, edad,tipo);
        this.salas = salas;

    }
    //getter and setter
    public String getSalas() {return salas;}
    public void setSalas(String salas) {this.salas = salas;}

    //Metodos

    public void asignacionSala(Salas sala){
        setSala(sala);
        System.out.println("Sala "+ sala.getNombre()+ " agregada al acomodador " + getNombre());
    }

    public void modificarSala(Salas sala){
        Scanner sc = new Scanner(System.in);
        String bandera;

        do {
            System.out.println("¿Que desea modificar?" +"\n"+
                    "Nombre \n" +
                    "Capacidad \n" +
                    "Pelicula ");
            String usuario=sc.next();

            switch (usuario){
                case "nombre":
                    System.out.println("¿Que nombre desea colocarle?");
                    usuario=sc.next();
                    sala.setNombre(usuario);
                    System.out.println(sala.getNombre());
                    break;
                case "capacidad":
                    System.out.println("¿Que capacidad desea colocarle?");
                    int cap=sc.nextInt();
                    sala.setCapacidad(cap);
                    System.out.println(sala.getCapacidad());
                    break;
                case "pelicula":
                    System.out.println("¿Que pelicula desea colocarle?");
                    String pelicula=sc.next();
                    sala.setPelicula(pelicula);
                    System.out.println(sala.getPelicula());
                    break;
            }
            System.out.println("¿Desea seguir modificando?");
            bandera=sc.next();
        }while(bandera.equals("Si") || bandera.equals("si"));

    }
    @Override
    public String toString() {
        return "Acomodador: {" +
                "salas='" + salas + '\'' +
                ", nombre='" + super.getNombre() + '\'' +
                ", edad='" + super.getEdad() + '\'' +
                '}';
    }
    @Override
    public Salas getSala() {
        return null;
    }
    @Override
    public void setSala(Salas sala) {}
}
