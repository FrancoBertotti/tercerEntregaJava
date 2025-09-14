package tercerentrega;


/**
 *
 * @author Franco
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        
        System.out.println("Inicio: ");
        nave.setNombre("Cala");
        nave.mostrarEstado();
        
        System.out.println("Cargamos combustible: ");
        nave.recargarCombustible(50);
        nave.mostrarEstado();
        
        System.out.println("Intentamos avanzar 65: ");
        nave.avanzar(65);
        System.out.println("Cargamos combustible: ");
        nave.recargarCombustible(30);
        nave.mostrarEstado();
        System.out.println("Intentamos avanzar 65: ");
        nave.avanzar(65);
        nave.mostrarEstado();
        
    }
    
}
