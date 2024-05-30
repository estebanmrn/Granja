
public class Animal
{
    // instance variables - replace the example below with your own
    private String id, nombre;
    private double peso; 
    public Fecha fechaNacimiento;
    private Tipo tipo;

    public Animal() {
    }

    public Animal(String id, String nombre, double peso, Fecha fechaNacimiento, String tipoAnimal) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoAnimal = tipoAnimal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    
    public abstract int calcularEdad ();
    
    
    
    
    
}
