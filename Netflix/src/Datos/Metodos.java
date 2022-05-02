package Datos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import Principal.Main;

public class Metodos {
	 private static ArrayList<String> listaPromos = new ArrayList<>(); // Listado de los titulos conpromociones
	 private static ArrayList<Double> listaPrecios = new ArrayList<>(); // Listado de los precioes de las promociones
	/**
	 * Métodos necesarios para el funcionamiento del programa.
	 * 
	 * Se han creado para que las clases sean más cortas y sea un código más modular.
	 */	 
	 public static double promoSeries( ArrayList<Contenido> lista,boolean tendencia) {
	    	Scanner dato = new Scanner(System.in);
	    	int enSol = 700, rSociales = 300 , opcion=0;
	    	double nuevoPrecio=0, totalPromo = 0;	
	    	
	    	System.out.println("OKEY! Vamos a introducir una nueva promoción para las series.");	
	    	System.out.println();
		for ( int i=0; i < lista.size(); i++) {
			if( lista.get(i).getTipo().contains("s")) {
				System.out.println("------------------------------------------------");
				System.out.println("\t\t"+lista.get(i).titulo);
				System.out.println("------------------------------------------------");
				System.out.println("¿Qué clase de promocion desea realizar para esta pelicula?");
				System.out.println("\n\t 1) Redes sociales. \n\t 2) Un cartel en Sol.  \n\t 3) Ambas promociones.  \n\t 4) No deseo hacer una promocion para esta serie.");
				opcion = dato.nextInt();			
				//calculo de la promocion hecha en las redes sociales
				if(opcion == 1) { // Redes Sociales
					if (lista.get(i).tendencia==true) {
						nuevoPrecio = rSociales + (rSociales*0.07);
						}//end if
					else {
						nuevoPrecio = rSociales;
					}//end else					
				//calculo de la promocion hecha en un cartel en sol
				}//end if
				else if (opcion == 2) { // Cartel en Sol
					if (lista.get(i).tendencia==true) {
						nuevoPrecio = enSol + (enSol*5);
						}// end if
					else {
						nuevoPrecio = enSol;
					}//end else
				}//end else if
				else if (opcion == 3) { // Se realizan las dos promos
					if (lista.get(i).tendencia==true) {
						nuevoPrecio = rSociales + enSol + ((rSociales+enSol)*0.07);
					}//end if
					else {
						nuevoPrecio = rSociales;
					}//end else	
				} // end else if
				else if (opcion == 4) {
					nuevoPrecio = 0;
				}
				else {
					System.out.println("Error en los datos de entrada! - Vuelve a probarlo de nuevo...");
				}//end else				
				totalPromo += nuevoPrecio;				
				System.out.println();
				System.out.println("------------------------------------------------");
				System.out.println("El valor de la promocion de " + lista.get(i).titulo + " es: " + nuevoPrecio + "€");
				System.out.println("Datos actualizados.");
				System.out.println("------------------------------------------------");
				System.out.println();				
				// Guardamos los datos creados a lo largo de la evaluacion de cada contenido. 
				listaPromos.add(lista.get(i).titulo); // lista con los titulos 
				listaPrecios.add(nuevoPrecio); // lista con el precio asignado
			} // if tipo contenido
		} // for
		System.out.println("------------------------------------------------");
		System.out.println("\tCoste total de las promociones € ");
		System.out.println("------------------------------------------------");
		return totalPromo;
	} // promoSeries
	 public static double promoPelis(ArrayList<Contenido> lista, boolean tendencia) throws IOException {
		// Declaración de variables para el método de promociones.
		int enSol = 40000, rSociales = 2000 , opcion=0;
		double nuevoPrecio=0.0, totalPromo=0.0;		
		Scanner dato= new Scanner(System.in);;
		
		System.out.println("OKEY! Vamos a introducir una nueva promoción para las películas.");	
		System.out.println();
		for ( int i=0; i < lista.size(); i++) {
			if( lista.get(i).getTipo().contains("p")) {
				System.out.println("------------------------------------------------");
				System.out.println("\t\t"+lista.get(i).titulo);
				System.out.println("------------------------------------------------");
				System.out.println("¿Qué clase de promocion desea realizar para esta pelicula?");
				System.out.println("\n\t 1) Redes sociales. \n\t 2) Un cartel en Sol.  \n\t 3) Ambas promociones.  \n\t 4) No deseo hacer una promocion para esta pelicula.");
				opcion = dato.nextInt();				
				//calculo de la promocion hecha en las redes sociales
				if(opcion == 1) { // Redes Sociales
					if (lista.get(i).tendencia==true) {
						nuevoPrecio = rSociales + (rSociales*0.07);						
					}//end if
					else {
						nuevoPrecio = rSociales;
					}//end else					
				//calculo de la promocion hecha en un cartel en sol
				}//end if
				else if (opcion == 2) { // Cartel en Sol
					if (lista.get(i).tendencia==true) {
						nuevoPrecio = enSol + (enSol*0.07);
					}// end if
					else {
						nuevoPrecio = enSol;
					}//end else
				}//end else if
				else if (opcion == 3) { // Se realizan las dos promos
					if (lista.get(i).tendencia==true) {
						nuevoPrecio = rSociales + enSol + ((rSociales+enSol)*0.07);
						}//end if
					else {
						nuevoPrecio = rSociales;	
					}//end else	
				} // end else if
				else if (opcion == 4) {
					nuevoPrecio = 0;
				} // Ninguna de las opciones 
				else {
					System.out.println("Error en los datos de entrada! - Vuelve a probarlo de nuevo con nuevos datos...");
					Main.main(null);
				}	
				totalPromo += nuevoPrecio;
				System.out.println();
				System.out.println("------------------------------------------------");
				System.out.println("El valor de la promocion de " + lista.get(i).titulo + " es: " + nuevoPrecio + "€");
				System.out.println("Datos actualizados.");
				System.out.println("------------------------------------------------");
				System.out.println();
				// Guardamos los datos creados a lo largo de la evaluacion de cada contenido. 
				listaPromos.add(lista.get(i).titulo);
				listaPrecios.add(nuevoPrecio);
			} // if getTipo		
		} // for de la lista
		System.out.printf("Coste total de las promociones € ");
		return totalPromo;
	} // promoPelis
	 public static void subvencionesMadrid(int opcion, double subvencionFija, double subvencionTotal, ArrayList<Contenido> lContenido,boolean tendencia, String tipo) {			
		//recorremos el arraylist para ver el contenido
		double total=0;
		for(int posicion = 0; posicion < lContenido.size(); posicion++) {    		
			//System.out.println(posicion + "··>" + lContenido.get(posicion));
			//calculo de las subvenciones de las peliculas    
	    	if((opcion == 1) && (lContenido.get(posicion).getTipo().equals("p"))){//pelicula	    			    	
	    		if (lContenido.get(posicion).tendencia ==true){
	    			subvencionTotal = subvencionFija + 350;
	    			System.out.println("La subvencion Total de " + lContenido.get(posicion).titulo + " es: " + subvencionTotal + " €");	    			
	    		}//end if
	    		else {
	    			subvencionTotal= subvencionFija + 100;
	    			System.out.println("La subvencion Total de " + lContenido.get(posicion).titulo + " es: " + subvencionTotal + " €");
	    		}//end else 	
	    	}//end if
	    	//calculo de las subvenciones de las series
	    	else if ((opcion ==2) && lContenido.get(posicion).getTipo().equals("s")){//serie	    		
	    		if (lContenido.get(posicion).tendencia==true) {
	    			subvencionTotal = subvencionFija + 100;
	    			System.out.println("La subvencion Total de " + lContenido.get(posicion).titulo + " es: " + subvencionTotal + " €");
	    		}//end if de tendencia
	    		else {
	    			subvencionTotal= subvencionFija;
	    			System.out.println("La subvencion Total de " + lContenido.get(posicion).titulo + " es: " + subvencionTotal + " €");
	    		}//end else de tendencia
	    	}//end else de condicional de series
	    	else if ((opcion == 3)) {
	    		// Peliculas
	    		if ((lContenido.get(posicion).getTipo().equals("p")) && lContenido.get(posicion).tendencia ==true){
	    			subvencionTotal = subvencionFija + 350;
	    			System.out.println("La subvencion Total de " + lContenido.get(posicion).titulo + " es: " + subvencionTotal + " €");	    			
	    		} else if((lContenido.get(posicion).getTipo().equals("p"))) {
	    			subvencionTotal= subvencionFija + 100;
	    			System.out.println("La subvencion Total de " + lContenido.get(posicion).titulo + " es: " + subvencionTotal + " €");
	    		}
	    		// Series
	    		else if ((lContenido.get(posicion).getTipo().equals("s")) && lContenido.get(posicion).tendencia ==true) {
	    			subvencionTotal = subvencionFija + 100;
	    			System.out.println("La subvencion Total de " + lContenido.get(posicion).titulo + " es: " + subvencionTotal + " €");
	    		} else if ((lContenido.get(posicion).getTipo().equals("s"))){
	    			subvencionTotal= subvencionFija;
	    			System.out.println("La subvencion Total de " + lContenido.get(posicion).titulo + " es: " + subvencionTotal + " €");
	    		} else {
	    			System.out.println("Contenido imposible de clasificar.");
	    		}
	    	} // Ambas subvenciones
	    	else {
	    		subvencionTotal = 0;
	    	} // Cierre del condicional de opcion + tipo de contenido (serie o pelicula)
	    	total += subvencionTotal;
		}//end for
		System.out.println("");
		System.out.println("La subvención total asciende a: " + total + " €");
		System.out.println("");
		System.out.println("----------------------------------------------------------------");
		System.out.println("Gracias por calcular su subvencion con el ayuntamiento de Madrid");
		System.out.println("----------------------------------------------------------------");
	} // subvencionesMadrid()
	 public static void promocionesActivas(int opcion) throws IOException {
		switch(opcion) {
			case 3 -> todasLasPromos();
			case 5 -> promoIndividual();
			default -> Excepciones.failOption();
		}
	 } // metodo promocionesActivas()
	 private static void todasLasPromos() throws IOException {
		System.out.println("\n*******************************************");
    	System.out.println("***\tPromociones encontradas.\t***");   
    	System.out.println("*******************************************");
		// Ordenamos las promociones en orden decreciente
		Collections.sort(listaPrecios, Collections.reverseOrder());
		// Recorrido de los arraylist para ver las promociones activas
		if (listaPromos.size() == 0) {
			System.out.println("No se han encontrado contenidos promocionados.\n Ejecuta la opción 2 del menú para promocionar series y/o películas.");
			Main.main(null);
		} else {
			for (int i = 0; i<listaPrecios.size(); i++) {
				if ( !listaPrecios.equals(0.0)) {					
					System.out.printf("%d - Promoción para ' %s ' ···> Precio promocional: %.2f € \n", i, listaPromos.get(i), listaPrecios.get(i));					
				} // Cierre del if				
			} // cierre del bucle			
		}		
	}
	private static void promoIndividual() throws IOException {
		int op=-1;
		Scanner sc;
		System.out.println("****************************************");
    	System.out.println("***\tPromociones individual.\t***");   
    	System.out.println("****************************************");    	
		// Ordenamos las promociones en orden decreciente
		Collections.sort(listaPrecios, Collections.reverseOrder());
		// Recorrido de los arraylist para ver las promociones activas
		if (listaPromos.size() == 0) {
			System.out.println("No se han encontrado contenidos promocionados.\n Ejecuta la opción 2 del menú para promocionar series y/o películas.");
			Main.main(null);
		} else {
			for (int i = 0; i<listaPromos.size(); i++) {									
				System.out.printf("%d - %s. \n", i, listaPromos.get(i));											
			} // cierre del bucle	
			System.out.println(" ");
			System.out.println(" Introduzca el nº del título que desea ver:");
			sc = new Scanner(System.in);
			op = sc.nextInt();
			if( (op < 0) || (op > listaPromos.size()) ) {
				System.out.println("No! Mala opción... Vuelve a intentarlo de nuevo, con otros datos.");
				Main.main(null);
			} else {
				System.out.println("");
				System.out.println("Información encontrada para:");
				System.out.println(">>>" +  listaPromos.get(op));
				System.out.println("");
				System.out.println(">>> Promoción: " + listaPrecios.get(op));				
			} // Cierre del condicional de la opcion introducida
		} // Cierre del condicional de tamaño de lista de promociones activas
	} // promoIndividual()
} // cierre de la clase




























