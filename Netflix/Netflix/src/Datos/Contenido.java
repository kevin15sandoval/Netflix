/**
 * a. En el caso de las películas:
 * i. Si se quiere hacer una campaña a través de las redes sociales tendrá
 * un coste de 2.000€.
 * ii. Si se quiere poner un cartel en la Puerta del Sol, el coste ascenderá a
 * los 40.000€.
 * iii. Si la película está en tendencias, el coste se incrementará un 7%.
 * b. En el caso de las series:
 * i. Si se quiere hacer una campaña a través de las redes sociales tendrá
 * un coste de 300€ por el número de temporadas que tenga la serie.
 * ii. Si se quiere poner un cartel en la Puerta del Sol, el coste ascenderá a
 * los 700€ por el número total de capítulos que tenga.
 * iii. Si la serie está en tendencias, el coste se incrementará un 6%. 
 *  
 *  
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
package Datos;
/**
 * @version 0.1
 * @author Paulino Esteban Bermúdez Rodríguez | humancomputing.net
 */
public abstract class Contenido {    
	protected String tipo, titulo, descripcion;
	protected int fechaEstreno;
	protected long duracion;
	protected boolean tendencia;    
    /**
     * Constructor contenido.
     * 
     * @param titulo
     * @param descripcion
     * @param tendencia
     * @param fechaEstreno 
     */
    public Contenido(String tipo, String titulo, String descripcion, long duracion, boolean tendencia, int fechaEstreno) {
    	this.tipo = tipo;
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
    abstract public void calcularPromos(String tipo, String titulo,boolean tendencia, double coste, int temporadas, int capitulos);    
    /********************
     *      Getter      *
     ********************/    
    /*
     * Tipo
     * @return tipo
     */
    public String getTipo() {
    	return tipo;
    }
    /*
     * Titulo
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }    
    /*
     * Fecha de estreno
     * @return fechaEstreno
     */
    public int getFechaEstreno() {
        return fechaEstreno;
    }
    /*
     * Duracion
     * @return duracion
     */
    public long getDuracion() {
        return duracion;
    }    
    /*
     * Descripcion
     * @return descripcion
     */ 
    public String getDescripcion() {
        return descripcion;
    }
    /*
     * Tendencia
     * @return tendencia
     */
    public boolean isTendencia() {
        return tendencia;
    }               
    /********************** 
     *      Setters       *
     **********************/    
    /*
     * Tipo
     * @param tipo
     */
    public void setTipo(String tipo) {
    	this.tipo = tipo;
    }
    /*
     * Titulo.
     * @param titulo 
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }        
    /*
     * Fecha Estreno
     * @param fechaEstreno 
     */
    public void setFechaEstreno(int fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }    
    /*
     * Duracion 
     * @param duracion
     */ 
    public void setDuracion(long duracion){
        this.duracion = duracion;
    }    
    /*
     * Descripción
     * @param descripcion 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }    
    /*
     * Tendencia.
     * @param tendencia 
     */
    public void setTendencia(boolean tendencia) {
        this.tendencia = tendencia;
    }
	/**
	 * calcularPromos
	 * @Override
	 */
	public void calcularPromos(String titulo, boolean tendencia, double precio, int temporadas, int capitulos) { }
	
}//end class 