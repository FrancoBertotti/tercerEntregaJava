package tercerentrega;

/**
 *
 * @author Franco
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro l1 = new Libro();
        
        System.out.println("Intento con el año 2028");
        l1.setAnioPubli(2028);
        System.out.println("Intento con el año 2024");
        l1.setAnioPubli(2024);
        System.out.println("Año de publicacion: "+l1.getAnioPubli());
        
    }
    
}
