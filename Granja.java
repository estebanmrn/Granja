
/**
 * Write a description of class Granja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Granja
{
    private Animal[] animales;
    private int totalAnimales, contadorGallinas, contadorCerdos, contadorVacas; 

    public Granja() {
        this.animales = new Animal [10];
        this.totalAnimales = 0;
        this.contadorGallinas = 0;
        this.contadorCerdos = 0;
        this.contadorVacas = 0;
    }
    
    public void incrementarContador (Animal animal){
        if (animal instanceof Gallina){
            contadorGallinas++;
        }
        else if (animal instanceof Cerdo){
            contadorCerdos++;
        }
        else if (animal instanceof Vaca){
       contadorVacas++;
        }
    }
    
            
        
     public void registrarAnimal (Animal animal){
        if (totalAnimales < animales.length){
            animales[totalAnimales++] = animal;
            incrementarContador(animal);
        }
        else {
            System.out.println("No se pueden agregar más animales.");
            
        }
    }
     
     public void mostrarInfo (){
         System.out.println("Animales en la granja: ");
         System.out.println("Total: " + totalAnimales);
         System.out.println("Gallinas: " + contadorGallinas);
         System.out.println("Vacas: " + contadorVacas);
         System.out.println("Cerdos: " + contadorCerdos);
         
     }
     
     public static void main(String[] args) {
            Granja granja = new Granja();
            
            granja.registrarAnimal(new Gallina ("123", "Jertudriz", 21.3, new Fecha (2021, 5, 12), "Gallina"));
            granja.registrarAnimal(new Cerdo ("234", "Pepe", 30, new Fecha (2022, 1, 8), "Cerdo"));
            granja.registrarAnimal(new Vaca ("1231", "Lola", 50.1, new Fecha (2023, 7, 9), "Vaca"));
            
            granja.mostrarInfo();
          
        }
}
