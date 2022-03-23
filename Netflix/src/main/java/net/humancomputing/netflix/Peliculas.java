/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.humancomputing.netflix;
/**
 * @version 0.1
 * @author Paulino Esteban Bermúdez Rodríguez | humancomputing.net
 */
public class Peliculas {
    private String productora, paisOrigen;
    
    public Peliculas (String titulo, int fechaEstreno,int duracion, String descripcion, boolean tendencia, String productora, String paisOrigen){
        this.productora=productora;
        this.paisOrigen=paisOrigen;
    }
    
    // Getter 
    /**
     * Productora de la pelicula
     * @return productora
     */
    public String getProductora() {
        return productora;
    }
    /**
     * Pais de origen de la pelicula
     * @return paisOrigen
     */
    public String getPaisOrigen() {
        return paisOrigen;
    }
    /**
     * Nueva productora de la pelicula
     * @param productora 
     */
    public void setProductora(String productora) {
        this.productora = productora;
    }
    /**
     * Nuevo pais de origen de la pelicula.
     * @param paisOrigen 
     */
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    /**
     * Método para calcular el precio de las peliculas.
     * @return precio
     */
    
    
    // ¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡ METODO PENDIENTE DE IMPLEMENTAR !!!!!!!!!!!!!!!!!!!
    public double CalcularPrecio (){
        double precio = 0;
        precio = precio;
        return precio;
    }
}