package Datos;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import Principal.Main;

public class Excepciones extends Exception{
	/**
     *  Declaración de variables para todos los mensajes.
     */
	private static LocalDateTime locaDate = LocalDateTime.now();
	private static String usuario = System.getProperty("user.name");
	private static int hours  = locaDate.getHour();
	private static int minutes = locaDate.getMinute();
	private static int seconds = locaDate.getSecond();
	private static String hora = ("> "+ hours +":"+ minutes+":"+seconds);
 	
 	public static void OpcionErronea() throws IOException {		
		System.out.println("");
		System.out.println(hora);
		System.out.println("");
		System.out.println("\t" + usuario+ " has introducido una opción incorrecta, vuelve a intentarlo de nuevo.");
		Main.main(null);
	}
 	public static void failOption() throws IOException {
		System.out.println("");
		System.out.println(hora);
	    System.out.println(usuario + ". La opción introducida no es válida.");
	    System.out.println(" Vuelve a intentarlo de nuevo ;D ");
	    Main.main(null);
	 }
 	
 	public static void FileNotFoundExceptionList(String f) {
	 	String sCarpAct = System.getProperty("user.dir");
		File carpeta = new File(sCarpAct);
	 	String[] listado = carpeta.list();
	 	System.out.println("");
	 	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	 	System.out.println("El programa necesita el fichero llamado: " + f);
	 	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	 	System.out.println("");
	 	if (listado == null || listado.length == 0) {
	 	    System.out.println("No hay elementos dentro de la carpeta actual");
	 	    return;
	 	} else {
	 	    for (int i=0; i< listado.length; i++) {
	 	        System.out.println(listado[i]);
	 	    }
	 	}
 	}
 	public static void MensajeFin() {
	 	System.out.println(hora); 
	    System.out.println("");
	    System.out.print(" Gracias por usar Netflix, " + usuario);
	    System.out.println("\n\t FIN DEL PROGRAMA.");
	    System.out.println("");
	    System.exit(0);
 	}
}
