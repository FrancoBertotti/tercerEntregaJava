package tercerentrega;

/**
 *
 * @author Franco
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiante e1 = new Estudiante();
        e1.nombre = "Franco";
        e1.apellido = "Bertotti";
        e1.curso = "programacion 2";
        
        e1.mostrarInfo();
        e1.subirCalificacion(-5);
        e1.mostrarInfo();
        e1.subirCalificacion(7);
        e1.mostrarInfo();
        e1.bajarCalificacion(4);
        e1.mostrarInfo();

    }
    
}
