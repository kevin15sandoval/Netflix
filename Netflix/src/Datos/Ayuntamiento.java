/**
 * Poner carteles gigantes de Netflix en lugares emblemáticos de España favorece
tanto a la ciudad donde se ponga el cartel como a la propia Netflix, se han llegado a
acuerdos con el ayuntamiento de Madrid para obtener subvenciones. En cualquier caso,
interesa conocer el nombre de la persona de contacto, su teléfono y la cantidad de
subvención que concede el ayuntamiento por cartel de película.
a. Si la película se encuentra en tendencias, la subvención asciende a los 1000€
por película promocionada. De lo contrario, serían 750€.
b. Si la serie se encuentra en tendencias, la subvención asciende a los 750€ por
serie promocionada. De lo contrario, serían 650€.
 */
package Datos;
/**
 * @version 0.1
 * @author Paulino Esteban Bermúdez Rodríguez | humancomputing.net
 */
public class Ayuntamiento implements Interfaz{    
    private String nombre;
    private int telefono;
    private double subvencionFija;     
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