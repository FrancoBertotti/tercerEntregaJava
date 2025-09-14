package tercerentrega;

/**
 *
 * @author Franco
 */
public class Gallina {
    private String idGallina;
    public int edad;
    public int huevosPuestos;
    
    public void mostrarEstado(){
        System.out.println("Id: "+idGallina+" - edad: "+edad+" - huevos puestos: "+huevosPuestos);
    }
    public void envejecer(){
        edad += 1;
    }

    public void setIdGallina(String idGallina) {
        this.idGallina = idGallina;
    }
    public void ponerHuevo(){
        huevosPuestos +=1;
    }
}
