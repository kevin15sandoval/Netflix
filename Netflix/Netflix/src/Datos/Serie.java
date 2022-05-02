/**
 *  En el caso de las series, se necesita conocer el n�mero de temporadas y n�mero de cap�tulos. 
 */
package Datos;
/**
 * @version 0.1
 * @author Paulino Esteban Berm�dez Rodr�guez | humancomputing.net
 */
public class Serie extends Contenido implements Interfaz{
	protected int nTemporadas, nCapitulos, fechaEstreno;
	private String tipo, titulo, descripcion;
	private long duracion;
	private boolean tendencia;
    
    public Serie(String tipo, String titulo, String descripcion, long duracion, boolean tendencia, int fechaEstreno, int nTemporadas, int nCapitulos){
        super(tipo,titulo, descripcion, duracion, tendencia, fechaEstreno);
        
        this.nTemporadas = nTemporadas;
        this.nCapitulos = nCapitulos;
        
        this.tipo = tipo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaEstreno = fechaEstreno;
        this.duracion = duracion;
        this.tendencia = tendencia;

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
     * Obtenci�n de los datos almacenados.
     * @Override
     */
    @Override
    public String toString(){  
    	System.out.println("........................................");
    	System.out.println("���> Serie.");
    	System.out.println("........................................");
        return ("\n\t" + titulo + "\n\t Descripci�n:" + descripcion + "\n\t Duraci�n:" + duracion +  "\t Tendencia:" + tendencia + "\n\t F.Estreno:" + fechaEstreno + "\n\t Temporadas:" + nTemporadas + "\t Cap�tulos:" + nCapitulos);
    }
        
    /**
     * calcularPromos
     * @Override
     */ 
	public void calcularPromos(String tipo, String titulo, boolean tendencia, double coste, int temporadas, int capitulos) {
		System.out.println("La serie tiene:" + temporadas + " temporadas y " + capitulos + " capitulos.");    	
        System.out.println("La nueva promoci�n para " + titulo + " es " + coste);		
	}
}