/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.humancomputing.netflix;

/**
 * @version 0.1
 * @author Paulino Esteban Bermúdez Rodríguez | humancomputing.net
 */
public class Ayuntamiento {
    
    private String nombre;
    private int telefono;
    private double subvencionFija=650.00; // Subvención fija ofrecidos por el ayuntamiento de la C. de Madrid
    
    public Ayuntamiento (String nombre, int telefono, double subvencionFija){
        this.nombre=nombre;
        this.telefono=telefono;
        this.subvencionFija=subvencionFija;
    }
    
    // Getter 
    /**
     * Nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Telefono
     * @return telefono
     */
    public int getTelefono() {
        return telefono;
    }
    /**
     * Subvención fija
     * @return subvencionFija
     */
    public double getSubvencionFija() {
        return subvencionFija;
    }
    
    // Setter
    /**
     * Nuevo nombre de contacto
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Nuevo telefono de contacto
     * @param telefono 
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    /**
     * Nuevo valor de la subvención fija asignada
     * @param subvencionFija 
     */
    public void setSubvencionFija(double subvencionFija) {
        this.subvencionFija = subvencionFija;
    }
    
}
