/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tercerentrega;

/**
 *
 * @author Franco
 */
public class Estudiante {
    public String nombre;
    public String apellido;
    public String curso;
    public int calificacion;
    
    public void mostrarInfo() {
        System.out.println(nombre+" "+apellido+" curso: "+curso+" nota: "+calificacion);
    }
    public void subirCalificacion(int puntos){
        if (puntos > 0 && puntos <=10){
             if (puntos>calificacion){
                 calificacion = puntos;
            }
        }
    }
    public void bajarCalificacion(int puntos){
        if (puntos > 0 && puntos <=10){
            if (puntos<calificacion){
                 calificacion = puntos;
            }
        }
     }
}
