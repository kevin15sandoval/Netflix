/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.humancomputing.netflix;

/**
 * Write a description of class Netflix here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Netflix
{
    private String[] contenido;
    
    public Netflix(String[] contenido){     
    }
    
    /**
     * @override
     * @param contenido 
     */
    public Netflix(String[] contenido){
        Contenido contenido = new Contenido(); 
    }
    
    /**
     * Métodos de la clase Netflix.
     * 
     * Llamada de todas las clases modulares a la clase padre Netflix.
     * 
     * - Constructor: Netflix()
     * - Métodos de la clase:
     *      + mostrarContenido(): Muestra el contenido almacenado en la plataforma.
     *      + mostarPromocion(): Muestra las promociones que tiene activas la plataforma.
     *      + crearPromocion(): Crea una nueva promoción para un contenido de la plataforma.
     *      + calcularCostePromo(): Calcula el precio del coste de la promocion de un contenido de la plataforma.
     *      + calcularCosteCampana(): Calcula el precio del coste de promocionar un contenido a través de la empresa de marketing.
     *      + calcularSubvencion(): Calcula la subvencion recibida por el ayuntamiento de la Comunidad de Madrid por publicitar contenido de la plataforma en sitios emblematicos.
     */
    
    /**
     * Mostrar el contenido  de la plataforma.
     * @param tipoContenido
     * @return tipoContenido
     */
    public String mostrarContenido(String tipoContenido){
        return tipoContenido;
    }
    
    /**
     * Mostrar promociones en la plataforma.
     * @param descuento
     * @return descuento
     */
    public double mostrarPromocion(int descuento){
        return descuento;
    }
    
    /**
     * Crear promocion activa en la plataforma.
     * @param descuento
     * @return descuento
     */
    public double crearPromocion(int descuento){
        return descuento;
    }
    
    /**
     * Calcular coste de promociones activas  en la plataforma.
     * @param promociones
     * @return promociones
     */
    public double calcularCostePromo(double promociones){
        return promociones;
    }
    
    /**
     * Calcular el coste por campaña publicitaria de la plataforma.
     * @param costeCampanna
     * @return costeCampanna
     */
    public double costeCampana(int costeCampanna){
        return costeCampanna;
    }
    
    /**
     * Calcular la subvencion recibida por la C. de Madrid 
     * @param subvencionFija
     * @param subvencionVariable
     * @return subvencionTotal
     */
    public double calcularSubvencion(int subvencionFija, int subvencionVariable){        
        double subvencionTotal;
        subvencionTotal = subvencionFija + subvencionVariable;
        return subvencionTotal;
    }
    
}