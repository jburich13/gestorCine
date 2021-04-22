package TGN2;
public abstract class  Personas {
    private String nombre;
    private int edad;
    private int tipo;

    //Constructor
    public Personas (String nombre, int edad, int tipo){
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }


    //Getter and Setter
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}
    public int getCodigo() {return tipo;}
    public void setCodigo(int tipo) {this.tipo = tipo;}

    //METODOS
    public void getTipo(Empleados empleados){
        System.out.println(empleados.getCodigo());
    }


    public void metodoRevelar(){
        if (this.tipo == 1){
            System.out.println("Acomodador\n");
        }else if (this.tipo == 2){
            System.out.println("Empleado\n");
        }else if(this.tipo == 3) {
            System.out.println("Espectador\n");
        }else {
            System.out.println("ERROR DE CODIGO!");
        }

    }


    @Override
    public String toString() {
        return "{"+"nombre='"+nombre+'\''+", edad=" + edad +'}';
    }
}
