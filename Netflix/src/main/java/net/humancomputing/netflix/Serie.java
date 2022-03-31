/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.humancomputing.netflix;
/**
 * @version 0.1
 * @author Paulino Esteban Berm�dez Rodr�guez | humancomputing.net
 */
public class Serie {
    private int nTemporadas, nCapitulos;
    
    public Serie(String titulo, int fechaEstreno, long duracion, String descripcion, boolean tendencia, int nTemporadas, int nCapitulos){
        this.nTemporadas = nTemporadas;
        this.nCapitulos = nCapitulos;
    }
    // Getter
    /**
     * Numero de temporadas que posee la serie
     * @return nTemporadas
     */
    public int getNTemporadas(){
        return nTemporadas;
    }
    /**
     * Numero de capitulos que posee la serie
     * @return nCapitulos
     */
    public int getNCapitulos() {
        return nCapitulos;
    }
    // Setter
    /**
     * Nuevo numero de temporadas que posee la serie
     * @param nTemporadas 
     */
    public void setNTemporadas(int nTemporadas) {
        this.nTemporadas = nTemporadas;
    }
    
    /**
     * Nuevo numero de capitulos que posee la serie
     * @param nCapitulos 
     */
    public void setNCapitulos(int nCapitulos) {
        this.nCapitulos = nCapitulos;
    }
    /**
     * Precio de las series
     * @return precio
     */
    
    // ¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡ METODO PENDIENTE DE IMPLEMENTAR !!!!!!!!!!!!!!!!!!!
    public double calcularPrecio(){
        return 0;
    }
}