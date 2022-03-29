package net.humancomputing.netflix;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {    
    public static void lectura() throws IOException {
            leerFichero2("Contenido.csv");
    }	
    private static void leerFichero2(String fichero) throws IOException {
        String titulo, descripcion, tipoContenido, productora, paisOrigen;
        int fechaEstreno, duracion, nTemporadas, nCapitulos;
        boolean tendencia;
        Contenido contenido;
        Contenido [] arrayContenido;
        //llamamos a la calse netflix para ir
        Netflix n= new Netflix ();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            while ((line = br.readLine()) != null) {
                String[] split = line.split(";");
                tipoContenido = split[0];
                titulo = split[1];
                fechaEstreno = Integer.valueOf(split[2]);
                duracion = Integer.valueOf(split[3]);
                descripcion = split[4];
                tendencia = Boolean.valueOf(split[5]);
                // Informacion de una Serie
                if (tipoContenido.charAt(0)== 's') { 
                    nTemporadas = Integer.valueOf(split[6]);
                    nCapitulos = Integer.valueOf(split[7]);
                    contenido = new Serie(titulo, fechaEstreno, duracion, descripcion, tendencia, nTemporadas,nCapitulos);
                    System.out.println("Se ha creado el objeto: " + contenido.getTitulo());
                    n.Contenido(contenido);// para guardar el contenido de las series
                } 
                // Informacion de una Pelicula
                else { 
                    productora = split[6];
                    paisOrigen = split[7];
                    contenido = new Pelicula (titulo, descripcion, duracion, tendencia, fechaEstreno, productora, paisOrigen);
                    System.out.println("Se ha creado el objeto:" + contenido.getTitulo());
                     n.Contenido(contenido);//para guardar el contenido de las peliculas
                }                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}