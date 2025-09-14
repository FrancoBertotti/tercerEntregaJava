package tercerentrega;

/**
 *
 * @author Franco
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();
        
        g1.setIdGallina("912");
        g2.setIdGallina("031");
        
        g1.envejecer();
        g2.envejecer();
        g2.envejecer();
        g2.envejecer();
        
        g1.ponerHuevo();
        g1.ponerHuevo();
        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.ponerHuevo();
        
        System.out.println("Datos gallina 1: ");
        g1.mostrarEstado();
        System.out.println("Datos gallina 2: ");
        g2.mostrarEstado();
        
    }
    
}
