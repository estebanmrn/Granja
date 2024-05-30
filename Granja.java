import java.util.List;
import java.util.ArrayList;
public class Granja
{
    
    private List <Animal> animales;
    private int totalAnimales, contadorGallinas, contadorCerdos, contadorVacas; 

    public Granja() {
        this.animales = new ArrayList<>();
        this.totalAnimales = 0;
        this.contadorGallinas = 0;
        this.contadorCerdos = 0;
        this.contadorVacas = 0;
    }        
        
     public void registrarAnimal (Animal animal){
        animales.add(animal);
        switch (animal.getTipo()){
            case GALLINA:
                contadorGallinas++;
                break;
                case VACA:
                    contadorVacas++;
                    break;
                    case CERDO:
                        contadorCerdos++;
                        break;
        }
     }
     
     public int getContadorGallinas() {
        return contadorGallinas;
    }

    public int getContadorVacas() {
        return contadorVacas;
    }

    public int getContadorCerdos() {
        return contadorCerdos;
    }
     
     
     public void mostrarInfo (){
         System.out.println("Animales en la granja: ");
         System.out.println("Total: " + totalAnimales);
         System.out.println("Gallinas: " + contadorGallinas);
         System.out.println("Vacas: " + contadorVacas);
         System.out.println("Cerdos: " + contadorCerdos);
         
     }
     
}
