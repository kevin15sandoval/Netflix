/**
 * A final de año se tira el dinero por la ventana y se hacen campañas de marketing masivas
para las películas, donde se promocionarán todas las películas a través de las redes
sociales. Para ello, se contrata a una empresa de marketing, de la cual interesa conocer
el nombre de la empresa de marketing, teléfono y precio de campaña de marketing por
película. 
 */
package Datos;
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