/**
 * Poner carteles gigantes de Netflix en lugares emblem�ticos de Espa�a favorece
tanto a la ciudad donde se ponga el cartel como a la propia Netflix, se han llegado a
acuerdos con el ayuntamiento de Madrid para obtener subvenciones. En cualquier caso,
interesa conocer el nombre de la persona de contacto, su tel�fono y la cantidad de
subvenci�n que concede el ayuntamiento por cartel de pel�cula.
a. Si la pel�cula se encuentra en tendencias, la subvenci�n asciende a los 1000�
por pel�cula promocionada. De lo contrario, ser�an 750�.
b. Si la serie se encuentra en tendencias, la subvenci�n asciende a los 750� por
serie promocionada. De lo contrario, ser�an 650�.
 */
package Datos;
/**
 * @version 0.1
 * @author Paulino Esteban Berm�dez Rodr�guez | humancomputing.net
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
     * Subvenci�n fija
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
     * Nuevo valor de la subvenci�n fija asignada
     * @param subvencionFija 
     */
    public void setSubvencionFija(double subvencionFija) {
        this.subvencionFija = subvencionFija;
    }
    
}