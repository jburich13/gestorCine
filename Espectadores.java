package TGN2;


public class Espectadores extends Personas{
    private String fila;
    private int silla;

    //constructor
    public Espectadores(String nombre, int edad, String fila, int silla, int tipo){
        super(nombre, edad, tipo);
        this.fila = fila;
        this.silla = silla;
    }

    //getter and setter

    public String getFila() {return fila;}
    public void setFila(String fila) {this.fila = fila;}
    public int getSilla() {return silla;}
    public void setSilla(int silla) {this.silla = silla;}


    @Override
    public void setEdad(int edad) {super.setEdad(edad);}
    @Override
    public void setNombre(String nombre) {super.setNombre(nombre);}



    //Metodos
    public void getButaca(){

    }

    @Override
    public String toString() {
        return "Nombre: "+ getNombre();
    }
}
