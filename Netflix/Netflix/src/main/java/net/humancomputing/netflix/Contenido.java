/**
 * Clase Contenido, almacena la información de las series y peliculas. Creada con:
 * 
 * # Contenido
 * |
 * |--------------------------
 * |- Titulo.
 * |- Fecha Estreno.
 * |- Descripcion.
 * |- Tendencia.
 * |--------------------------
 * |+ Contenido()
 * |+ calcularPromos()
 * |-------------------------- 
 * |+ getTitulo()
 * |+ getFechaEstreno()
 * |+ getDuracion()
 * |+ getTendencia()
 * |+ setTitulo
 * |+ setFechaEstreno()
 * |+ setDuración()
 * |+ setDescripcion()
 * |+ setTendencia()
 * |--------------------------
 */
package net.humancomputing.netflix;

/**
 * @version 0.1
 * @author Paulino Esteban Bermúdez Rodríguez | humancomputing.net
 */
public abstract class Contenido {
    private String titulo, descripcion;
    private boolean tendencia;
    private int fechaEstreno;
    private long duracion;
    /**
     * Constructor contenido.
     * 
     * @param titulo
     * @param descripcion
     * @param tendencia
     * @param fechaEstreno 
     */
    public Contenido(String titulo, String descripcion, long duracion, boolean tendencia, int fechaEstreno) {
        this.titulo=titulo;
        this.fechaEstreno=fechaEstreno;
        this.duracion = duracion;
        this.descripcion=descripcion;
        this.tendencia=tendencia;        
    }//end constructor 
    
    /**
     * Método abstracto para calcularPromos que lanza Netflix.
     * @return calcularPromos
     */
    abstract public double calcularPromos(String titulo,String descripcion,boolean tendencia, int fechaEstreno);    
    
    /********************
     *      Getter      *
     ********************/
    
    /**
     * Titulo
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Fecha de estreno
     * @return fechaEstreno
     */
    public int getFechaEstreno() {
        return fechaEstreno;
    }

    /**
     * Duracion
     * @return duracion
     */
    public long getDuracion() {
        return duracion;
    }
    
    /**
     * Descripcion
     * @return descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * Tendencia
     * @return tendencia
     */
    public boolean isTendencia() {
        return tendencia;
    }
           
    /*
     ********************** 
     *      Setters       *
     **********************
    */    
    /**
     * Titulo.
     * @param titulo 
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
        
    /**
     * Fecha Estreno
     * @param fechaEstreno 
     */
    public void setFechaEstreno(int fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }
    
    /**
     * Duracion 
     * @param duracion
     */
    public void setDuracion(long duracion){
        this.duracion = duracion;
    }
    
    /**
     * Descripción
     * @param descripcion 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
     * Tendencia.
     * @param tendencia 
     */
    public void setTendencia(boolean tendencia) {
        this.tendencia = tendencia;
    }
    
    
}//end class 