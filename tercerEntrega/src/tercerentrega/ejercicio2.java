package tercerentrega;


/**
 *
 * @author Franco
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota m1 = new Mascota();
        
        m1.nombre = "Mike";
        m1.especie = "Perro";
        m1.edad = 5;
        
        m1.mostrarInfo();
        m1.cumplirAnios();
        m1.mostrarInfo();
        m1.cumplirAnios();
        m1.cumplirAnios();
        m1.cumplirAnios();
        m1.mostrarInfo();
    }
    
}
