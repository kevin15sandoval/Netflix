/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.humancomputing.netflix;

/**
 * @version 0.1
 * @author Paulino Esteban Bermúdez Rodríguez | humancomputing.net
 */
public class EmpresaMarketing {
    private String nombreEmpresa;
    private int numPeliculas, telefono;
    private double precioFijo;
    
    public EmpresaMarketing (String nombreEmpresa, int numPeliculas, int telefono, double precioFijo){
        this.nombreEmpresa=nombreEmpresa;
        this.numPeliculas=numPeliculas;
        this.telefono=telefono;
        this.precioFijo=precioFijo;
    }

    // Getter
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
   
    public int getTelefono(){
        return telefono;
    }
    
    public int getNumPeliculas() {
        return numPeliculas;
    }
        
    public double getPrecioFijo() {
        return precioFijo;
    }
    
    // Setter
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public void setNumPeliculas(int numPeliculas) {
        this.numPeliculas = numPeliculas;
    }

    public void setPrecioFijo(double precioFijo) {
        this.precioFijo = precioFijo;
    }
   
}

