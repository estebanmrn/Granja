
/**
 * Write a description of class Gallina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Gallina extends Animal
{
    public Gallina() {
    }

    public Gallina(String id, String nombre, double peso, Fecha fechaNacimiento, String tipoAnimal) {
        super(id, nombre, peso, fechaNacimiento, tipoAnimal);
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public int getAñoNacimiento (){
        return fechaNacimiento.getAño();
    }
    
    
    
    @Override 
    public int calcularEdad(){
        int añoActual = 2024;
        return añoActual - getAñoNacimiento();
        
    }
}
