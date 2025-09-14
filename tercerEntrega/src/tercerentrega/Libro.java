/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tercerentrega;

/**
 *
 * @author Franco
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPubli;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPubli() {
        return anioPubli;
    }

    public void setAnioPubli(int anio) {
        if (anio <2025)
            this.anioPubli = anio;
        else {
            System.out.println("Año invalido.");
        }
    }
    
    
    
}
