/**
 *   Toda la interacción con el sistema deberá realizarse a través de un menú de opciones.
 *   La información inicial de las películas y series que ya se encuentran en la plataforma de Netflix
 *   se proporciona en el fichero “Netflix.txt” que se proporcionará a través de Campus Virtual.
 *   También se proporcionarán los ficheros “posibles_estrenos_peliculas.txt” y
 *   “posibles_estrenos_series.txt” para calcular las distintas estimaciones.
 *   El programa no distinguirá entre mayúsculas y minúsculas.
 *   Se deberán capturar, al menos, las siguientes excepciones:
 *   • Que los ficheros “Netflix.txt”, “posibles_estrenos_peliculas.txt” y
 *   “posibles_estrenos_series.txt” no existan.
 *   • Si la selección de la opción del menú no está dentro del intervalo de opciones válidas.
 *   En tal caso, se deberá poder solicitar la opción de nuevo sin abandonar el programa.
 *   • Si, esperando un dato de tipo numérico, se recibe un dato no numérico.
 *   • Si cuando se quiere promocionar una serie, el coste de la promoción asciende de los
 *   12.000€. 
 */
package Principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Datos.Contenido;
import Datos.Excepciones;
import Datos.Netflix;
import Datos.Pelicula;
import Datos.Serie;
import Datos.Interfaz;
import Datos.Metodos;

/**
 * @link https://campusvirtual.uclm.es/pluginfile.php/3173359/mod_resource/content/8/Enunciado%20practica_bien.pdf
 * @version 0.1
 * @author Paulino Esteban Bermúdez Rodríguez | humancomputing.net
 */
public class Main implements Interfaz{
	public static String nombreFichero = "Contenido.csv";
	public static void main(String[] args) throws IOException {
        /**
        *  Variables.
        */
		double subvencionVariable=0;
    	boolean tendencia=false;
    	double precioCampanna=0;
    	int NCapitulos=0, NTemporadas=0;
    	String tipo ="p";
        int opcion=0;
        String enter;
        Scanner op;        
        /***
         * Declaración del arrayList de tipo Contenido que almacena los datos con los que 'juega' el programa.
         */
        ArrayList <Contenido> listaContenido= new ArrayList<Contenido>();          
        try {
        	// Leemos el fichero y guardamos los datos en el sistema.    
        	leerFichero2(nombreFichero, listaContenido);                
        	// Menu principal - Salida por pantalla.         
            while(true) {            	
            	System.out.println("\n");
    			System.out.println("\tPresione ENTER para continuar ...");
    			System.out.println("\n");
        	    op = new Scanner(System.in);
        	    enter = op.nextLine();
            	menu();	            
	            op = new Scanner(System.in);
	            opcion = op.nextInt();
	            //métodos.         
	            switch (opcion) {
	                case 1 -> seeAllContent(listaContenido);
	                case 2 -> newPrices(listaContenido, tendencia,NCapitulos, NTemporadas);
	                case 3 -> seeAllPromos(listaContenido);
	                case 4 -> promosCost();
	                case 5 -> seeOnlyOnePromoCost();
	                case 6 -> mktCost(precioCampanna,listaContenido,tendencia, tipo);
	                case 7 -> newSubv(subvencionFija, subvencionVariable, listaContenido, tendencia, tipo);
	                case 8 -> finalProgram();
	                default -> Excepciones.failOption();
	            }
            }
        } catch ( InputMismatchException ex1) {
        	System.out.println("........................................................");
        	System.out.println(" IBM 7950 Harvest no ha sabido reconocer tus datos..." );
        	System.out.
        	println(" Vuelve a intentarlo pero esta vez INTRODUCE UN NUMERO POR FAVOR");
        	System.out.println(" Recuerda que si son números con decimales, "
        			+ "usa la coma (,) en vez del punto (.) - Gracias!");
        	System.out.println(" Detalles del error:" + ex1);
        	System.out.println("........................................................");        	
        	main(args);
        } catch( NumberFormatException ex2) {
        	System.out.println("........................................................");
        	System.out.println(" Mira los datos escritos!!! Creo que el numero introducido es incorrecto!!! ...  Detalles del error:\n" + ex2);
        	System.out.println("........................................................");
        	main(args);
        } catch( Exception ex) {
        	System.out.println("........................................................");
        	System.out.println(" Houston, tenemos un problema!!! ...  Detalles del error:\n" + ex);
        	System.out.println("........................................................");
        	main(args);
        } finally {        	
        	System.out.println("");
        	System.out.println("");
        	System.out.println(" ----------------------");
        	System.out.println(" · PROGRAMA: Netflix. ·");
        	System.out.println(" ----------------------");
        	System.out.println(" - Práctica de porgramación II.");
        	System.out.println(" - Nombre de la práctica: Netflix");
        	System.out.println(" - Universidad: UCLM Talavera de la Reina. ");
        	System.out.println(" - Autores: Kevin Alfonso Gómez S. & Paulino Esteban Bermúdez R.");
        	System.out.println(" - Version: 0.1");
        	System.out.println(" - Fecha: 05.04.2022");
        	System.out.println("");
        	System.out.println("");
        }
    }     	
    private static void leerFichero2(String fichero, ArrayList<Contenido> listaContenido) throws IOException {
        /** 
         * Declaración de las variables 'generales' del programa principal.
         * Tenemos:
         * - Titulo: Titulo del contenido. 
         * - Descripción: Descripción breve del contenido.
         * - Tipo de contenido: Pelicula o serie.
         * - Tendencia: Si es o no un contenido trending.
         * + Productora: Para saber la productora de la pelicula.
         * + Pais de origen: Origen de la pelicula.
         * + Duracion: Tiempo que dura la pelicula.
         * + nCapitulos y nTemporadas: Capitulos y temporadas de una serie. 
         */        
        String titulo, descripcion, tipoContenido, productora, paisDeOrigen;
        int fechaDeEstreno,  nTemporadas, nCapitulos;
        long duracion;
        boolean tendencia;        
        // line: De tipo String que almacena en el Buffer del programa los datos que consigue del fichero leído.
        String line;
        int contador=0;                       
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {            
            while ((line = br.readLine()) != null) {                
                String[]split = line.split(";");
                tipoContenido = split[0];
                titulo = split[1];
                fechaDeEstreno = Integer.valueOf(split[2]);
                duracion = Integer.valueOf(split[3]);
                descripcion = split[4];
                tendencia = Boolean.valueOf(split[5]);                
                if (tipoContenido.charAt(0)=='s') {
                    nTemporadas = Integer.valueOf(split[6]);
                    nCapitulos = Integer.valueOf(split[7]);	                    
                    // Añadimos una nueva serie al ArrayList - listaContenido();
                    listaContenido.add(new Serie(tipoContenido, titulo, descripcion,duracion, tendencia, fechaDeEstreno, nTemporadas, nCapitulos));                                        
                } else {
                    productora = split[6];
                    paisDeOrigen = split[7]; 
                    // Añadimos una nueva pelicula al ArrayList - listaContenido();
                    listaContenido.add(new Pelicula(tipoContenido, titulo, descripcion,duracion, tendencia, fechaDeEstreno, productora, paisDeOrigen));                    
                }                
                contador++;                
            }            
        } catch (IOException e) {
        	System.out.println("........................................................");
        	System.out.println(" EY!!! tenemos un problema grave!!! ...  No he encontrado el fichero.");
        	System.out.println(" Detalles del error:\n");
        	e.printStackTrace();
        	System.out.println("........................................................");
        	System.out.println("\t Los ficheros encontrados en el programa:");
        	Excepciones.FileNotFoundExceptionList(nombreFichero);
        	System.out.println("........................................................");            
        }
    }    
    // Métodos del menu
    // 1)
    private static void seeAllContent(ArrayList<Contenido> lContenido) {
    	Netflix.mostrarContenido(lContenido);	    
    }
    // 2)
    private static void newPrices(ArrayList<Contenido> lContenido, boolean tendencia, int NTemporadas, int NCapitulos) throws IOException {    	
    	System.out.println("--------------------------------------------------------------");
    	System.out.println("Vamos a crear una nueva promoción...");     	
    	Netflix.crearPromocion(lContenido, tendencia, NTemporadas, NCapitulos);
    }
    // 3)
    private static void seeAllPromos(ArrayList<Contenido> lContenido) throws IOException {
    	Netflix.mostrarPromocion(lContenido);
    }
    // 4)
    private static void promosCost() { 
    	double valor = Netflix.calcularCostePromo();
    	System.out.println("Los gastos totales ascienden a: " + valor + " €");
    }
    // 5)
    private static void seeOnlyOnePromoCost() throws IOException { 
    	Netflix.queContenidoTienePromo();
    }
    // 6)
    private static void mktCost(double precioCampanna,ArrayList<Contenido> lContenido, Boolean tendencia, String tipo ) {
    	Netflix.costeCampana(precioCampanna, lContenido,tendencia, tipo);   	
    }
    // 7)
    private static void newSubv(double subvencionFija, double subvencionVariable, ArrayList<Contenido> lContenido, Boolean tendencia, String tipo ) throws IOException {
    	Netflix.calcularSubvencion(subvencionFija, subvencionVariable, lContenido, tendencia, tipo);
    }
    // 8)
    private static void finalProgram() {    	
    	Excepciones.MensajeFin();
    }
    // Menu principal de usuario.
    private static void menu(){    	    
		System.out.println("");
		System.out.println("\t |-------------------------------------|");
        System.out.println("\t\t\t Menu principal");
        System.out.println("\t |-------------------------------------|");
        System.out.println("");
        System.out.println("\t 1. Mostrar toda la información del contenido de la plataforma.");
        System.out.println("\t 2. Realizar nueva promoción para película o serie.");
        System.out.println("\t 3. Mostrar todas las promociones.");
        System.out.println("\t 4. Mostar coste de todas las promociones.");
        System.out.println("\t 5. Mostrar coste de una promoción en concreto.");
        System.out.println("\t 6. Cacular coste de una campaña masica de MKT.");
        System.out.println("\t 7. Calcular subvención que se obtiene a partir de las peliculas o series.\n");
        System.out.println("\t >---------------------------<");
        System.out.println("\t 8. Salir del programa.");
        System.out.println("\t >---------------------------<");
        System.out.println("");
        System.out.println("\tINTRODUCE EL NUMERO DE LA OPCION DESEADA: ");    	
    }       
}