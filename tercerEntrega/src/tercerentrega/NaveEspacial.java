/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tercerentrega;

/**
 *
 * @author Franco
 */
public class NaveEspacial {
    private String nombre;
    private double combustible;
    
    public void setNombre(String nom){
        nombre =nom;
    }
    public void mostrarEstado(){
        System.out.println("Nombre: "+nombre+", cantidad de combustible: "+combustible);
    }
    
    public void recargarCombustible(int x){
        if (x > 0)
            combustible += x;
    }
    
    private void despegar(int distancia){
        combustible -= distancia;
    }
    
    public void avanzar(int distancia){
        if (distancia <= combustible)
            despegar(distancia);
        else {
            System.out.println("No es posible avanzar, recargar combustible.");
        }
    }
}
