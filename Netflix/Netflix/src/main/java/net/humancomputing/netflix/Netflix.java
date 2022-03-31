/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
package net.humancomputing.netflix;

/**
 * Write a description of class Netflix here.
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Netflix
{
    //creamos el array contenido 
    private Contenido [] contenidos;   
    //contructor del netflix
    public Netflix(Contenido [] contenidos){ 
        this.contenidos=contenidos;
    }
    /*creamos un metodo que se llamara addcontenido para asi provocando a que todo el contenido que estemos guardando en contenido
      se nos vaya guardando en nuestro array 
    */
    public void addContenido (Contenido contenido){
        this.contenidos = Contenido (contenido);
    }
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
    
    
    /*public double calcularSubvencion(int subvencionFija, int subvencionVariable){        
        double subvencionTotal;
        subvencionTotal = subvencionFija + subvencionVariable;
        return subvencionTotal;
    }
*/
    //relacion de dependecia con ayuntamiento 
    //gracias a la relacion de dependencia, podemos calcular la subvencion para cada peliculap serie
    public void CalcularSubvencion (Ayuntamiento ayunt, double subvencionFija){
        double subvencionTotal;
        while(Pelicula){
            if (tendencia==True){
                subvencionTotal= subvencionFija + 350;
            }//End if
            else {
                subvencionTotal= subvencionFija + 100;
            }//End else
        }//End while
        while(Serie){
             if (tendencia==True){
                subvencionTotal= subvencionFija + 100;
            }//End if
            else {
                subvencionTotal= subvencionFija;
            }//End else
        }//End while  
    }

    private Contenido[] Contenido(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Contenido[] Contenido(Contenido contenido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}