/**
 * Esta aplicaci�n, como ya sabemos, tiene v�deos (contenido) en distintos formatos: series
 * y pel�culas. Todo el contenido tiene un t�tulo y un a�o de estreno. El t�tulo del contenido
 * ser� �nico y servir� para identificarlo para campa�as de marketing. De todos los
 * contenidos interesar� conocer su duraci�n (en minutos), una peque�a descripci�n y
 * saber si est� en tendencias. En el caso de las series, se necesita conocer el n�mero de
 * temporadas y n�mero de cap�tulos. En el caso de las pel�culas, se necesita saber la
 * productora y el pa�s de origen. 
 * * 
 * * Se desea que el sistema permita realizar las siguientes consultas:
 * a. Mostrar toda la informaci�n del contenido de la plataforma (se proporcionar�
 * al alumno un fichero con la informaci�n del contenido).
 * b. Se podr� realizar una promoci�n de una pel�cula o una serie.
 * c. Mostrar todas las promociones realizadas.
 * d. Mostrar coste de todas las promociones realizadas.
 * e. Calcular coste de promoci�n de una pel�cula o serie en concreto.
 * f. Calcular el coste de una campa�a masiva de marketing.
 * g. Calcular la subvenci�n que se obtiene a partir de las pel�culas o series.
 */
package Datos;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import Datos.Serie;
import Datos.Pelicula;
import Datos.Metodos;
import Datos.Ayuntamiento;
import Datos.EmpresaMarketing;
import Datos.Promocion;
/**
 * @author Paulino Esteban Berm�dez Rodr�guez | humancomputing.net
 * @version 0.1
 */
public class Netflix
{    
	private static double gastosS;
	private static double gastosP;
    /**
     * M�todos de la clase Netflix.
     * 
     * Llamada de todas las clases modulares a la clase padre Netflix.
     * 
     * - Constructor: Netflix()
     * - M�todos de la clase:
     *      + mostrarContenido(): Muestra el contenido almacenado en la plataforma.
     *      + mostarPromocion(): Muestra las promociones que tiene activas la plataforma.
     *      + crearPromocion(): Crea una nueva promoci�n para un contenido de la plataforma.
     *      + calcularCostePromo(): Calcula el precio del coste de la promocion de un contenido de la plataforma.
     *      + costeCampana(): Calcula el precio del coste de promocionar un contenido a trav�s de la empresa de marketing.
     *      + calcularSubvencion(): Calcula la subvencion recibida por el ayuntamiento de la Comunidad de Madrid por publicitar contenido de la plataforma en sitios emblematicos.
     */    
    /**
     * 1) Mostrar el contenido  de la plataforma.
     * @param Contenido
     */	
    public static void mostrarContenido(ArrayList<Contenido> lContenido){
    	System.out.println("Opci�n para ver el contenido almacenado en Netflix");
    	System.out.println("\n");
    	System.out.println("\t ------------------------------------");
    	System.out.println("\t | CONTENIDO DISPONIBLE EN NETFLIX  |");
    	System.out.println("\t ------------------------------------");
	    for(int i = 0; i < lContenido.size(); i++) {
		    System.out.println(i + "��>" + lContenido.get(i));		    
	    }
    }    
    /**
     * 2) Crear promocion activa en la plataforma. 
     * @throws IOException 
     */
    public static void crearPromocion(ArrayList<Contenido> lContenido, boolean tendencia,int NTemporadas, int NCapitulos) throws IOException{    	
    	// Declaracion de las variables
    	int op = 0;    	
    	Scanner sc;    	    
    	System.out.println("");
    	// Diferenciaci�n de las series de las peliculas.
	    System.out.println("�Qu� deseas promocionar SERIES (1) o PELICULAS (2)?");
    	sc = new Scanner(System.in);
    	op = sc.nextInt();       	
    	switch (op) {
    		case 1 -> gastosS =  Metodos.promoSeries(lContenido, tendencia);
    		case 2 -> gastosP =  Metodos.promoPelis(lContenido, tendencia);
    		default -> Excepciones.OpcionErronea();
    	}
    	if(op == 1) {
    		System.out.println(gastosS);
    	} else {
    		System.out.println(gastosP);
    	}
    }
    /**
     * 3) Mostrar promociones en la plataforma.
     * @param posicionContenido
     * @return descuento
     * @throws IOException 
     */
    public static void mostrarPromocion(ArrayList<Contenido> lContenido) throws IOException{    	    	
    	double total = gastosS + gastosP;
    	System.out.println("Hemos encontrado los siguientes valores:");
    	System.out.println("--------------------------------");
    	System.out.println("> Series: � " + gastosS);
    	System.out.println("> Peliculas: � " + gastosP);
    	System.out.println("--------------------------------");
    	System.out.println("Inversi�n total: � " + total);
    	System.out.println("--------------------------------");    	
    	System.out.println("Peliculas y series que han sido promocionadas");
    	Metodos.promocionesActivas(3);
    }
    /**
     * 4) Calcular coste de promociones activas  en la plataforma.
     * @param promociones
     * @return promociones
     */
    public static double calcularCostePromo(){
    	double total = gastosS + gastosP;
		return total;
    }    
    /**
     * 5) Calcular coste de una promoci�n en concreto.
     * @param contenido
     * @return promocion
     * @throws IOException 
     */
    public static void queContenidoTienePromo() throws IOException {
    	// Contenido promocional
		Metodos.promocionesActivas(5);	
    }
    /**
     * 6) Calcular el coste por campa�a publicitaria de la plataforma.
     * @param costeCampanna
     * @return costeCampanna
     */
    public static double costeCampana(double costeCampanna,ArrayList<Contenido> lContenido,boolean tendencia, String tipo){
    	System.out.println("------------------------------------------------------------------");
    	System.out.println("     Bienvenido al calculo de promocion masiva de peliculas");
    	System.out.println("-------------------------------------------------------------------");
    	//recorremos el arraylist para ver el contenido
    	double precioTotal=0;
    	for(int posicion = 0; posicion < lContenido.size(); posicion++) {
    		
    		//System.out.println(posicion + "��>" + lContenido.get(posicion));
    		//calculo de las subvenciones de las peliculas    
	    	if(lContenido.get(posicion).tipo.equals("p")) {
	    		if (lContenido.get(posicion).tendencia ==true){
	    			costeCampanna = 2000 + (2000*0.07);
	    			System.out.println("El coste Total de " + lContenido.get(posicion).titulo + " es: " + costeCampanna + " �");
	    			precioTotal=precioTotal+costeCampanna;
	    		}//end if
	    		else {
	    			costeCampanna = 2000;
	    			System.out.println("El coste Total de " + lContenido.get(posicion).titulo + " es: " + costeCampanna+ " �");
	    			precioTotal=precioTotal+costeCampanna;
	    		}// else 
	    	}//if
    	}//for
    	System.out.println("------------------------------------------------------------------------");
    	System.out.println("El precio total de Promocionar todas las peliculas es " + precioTotal + "�");
    	System.out.println("------------------------------------------------------------------------");
    	return precioTotal;
    }    
    /**
     * 7) Calcular la subvencion recibida por la C. de Madrid 
     * @param subvencionFija
     * @param subvencionVariable
     * @return subvencionTotal
     * @throws IOException 
     */
    public static double calcularSubvencion(double subvencionFija, double subvencionVariable, ArrayList<Contenido> lContenido,boolean tendencia, String tipo) throws IOException{
        // Declaramos la variable     	
    	double subvencionTotal;
    	int opcion;
    	//declaramos un Scanner
    	Scanner sc=new Scanner(System.in);    	
    	//damos la opcion al usuario de elegir lo que desea realizar
    	System.out.println("---------------------------------------------------------");
    	System.out.println("Bienvenido al calculo de la Subvencion del ayuntamiento");
    	System.out.println("---------------------------------------------------------");
    	System.out.println("�Que clase de subvencion desea calucular?");
    	System.out.println("1) peliculas\n2) series\n3) ambas");
    	opcion= sc.nextInt();
    	switch(opcion) {
    		case 1 -> Metodos.subvencionesMadrid(opcion, subvencionFija ,subvencionVariable, lContenido, tendencia, tipo);
    		case 2 -> Metodos.subvencionesMadrid(opcion, subvencionFija ,subvencionVariable, lContenido, tendencia, tipo);
    		case 3 -> Metodos.subvencionesMadrid(opcion, subvencionFija ,subvencionVariable, lContenido, tendencia, tipo);
    		default -> Excepciones.failOption();
    	}    	    
    	return 0;
    }
}