/**
 * En el caso de las pel�culas, se necesita saber la productora y el pa�s de origen.
 */
package Datos;

/**
 * @version 0.1
 * @author Paulino Esteban Berm�dez Rodr�guez | humancomputing.net
 */
public class Pelicula extends Contenido implements Interfaz {
	private String productora, paisOrigen, tipo, titulo, descripcion;
	private int fechaEstreno;
	private long duracion;
	private boolean tendencia;
        
    public Pelicula (String tipo, String titulo, String descripcion, long duracion, boolean tendencia, int fechaEstreno, String productora, String paisOrigen){
        super(tipo, titulo, descripcion, duracion, tendencia, fechaEstreno);

        this.productora=productora;
        this.paisOrigen=paisOrigen;
        
        this.tipo = tipo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaEstreno = fechaEstreno;
        this.duracion = duracion;
        this.tendencia = tendencia;
    }
    
    // ///////////////////////////////////////////////////////////////////// Getters.
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

    // ///////////////////////////////////////////////////////////////////// Setters.
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
     * Obtenci�n de los datos almacenados.
     * @Override
     */
    @Override
    public String toString(){ 
    	System.out.println("........................................");
    	System.out.println("���> Pelicula.");
    	System.out.println("........................................");
        return ("\n\t" + titulo + "\n\t Descipci�n:" + descripcion + "\n\t Duraci�n:" + duracion +  "\t Tendencia:" + tendencia + "\n\t F.Estreno:" + fechaEstreno + "\n\t Productora:" + productora + "\t Pa�s origen:" + paisOrigen);
    }
    
    
    /**
     * M�todo para calcular el precio de las peliculas.
     * @Override 
     */
	@Override
	public void calcularPromos(String tipo, String titulo, boolean tendencia, double coste, int temporadas, int capitulos) {
		System.out.println("La serie tiene:" + temporadas + " temporadas y " + capitulos + " capitulos.");    	
        System.out.println("La nueva promoci�n para " + titulo + " es " + coste);
		
	}
}