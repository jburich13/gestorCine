package TGN2;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Salas {
    private int capacidad;
    private String nomPelicula;
    private String nomSala;
    private Set<Espectadores> totalEspectadoresSalas = new HashSet<Espectadores>();

    //Constructor
    public Salas (int capacidad, String nomSala, String nomPelicula){
        this.capacidad = capacidad;
        this.nomSala = nomSala;
        this.nomPelicula = nomPelicula;
    }

    //Getter and Setter
    public int getCapacidad() {return capacidad;}
    public void setCapacidad(int capacidad) {this.capacidad = capacidad;}
    public String getPelicula() {return nomPelicula;}
    public void setPelicula(String pelicula) {this.nomPelicula = pelicula;}
    public String getNombre() {return nomSala;}
    public void setNombre(String nomSala) {this.nomSala = nomSala;}

    //Agregar espectadores
    public void agregarEspectadores (Espectadores espectador){
            if (capacidad > totalEspectadoresSalas.size()){
                totalEspectadoresSalas.add(espectador);
            }


    }
    public void  listarEspectadores(){
        Iterator<Espectadores> it = totalEspectadoresSalas.iterator();
        System.out.println(totalEspectadoresSalas.size());
        if(totalEspectadoresSalas.size()>0){
            System.out.println("El total de espectadores es de: " + totalEspectadoresSalas.size());
            while (it.hasNext()){
                System.out.println("Espectador: "+it.next().getNombre());
            }
        } else System.out.println("SIN ESPECTADORES CARGADOS");
    }


}
/*Las Salas no deben permitir la asignación de una lista de Espectadores superior a su capacidad*/