package net.humancomputing.netflix;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {    
    public static void lectura() throws IOException {
            leerFichero2("Contenido.csv");
    }	
    private static void leerFichero2(String fichero) throws IOException {
        String titulo, descripcion, tipoContenido, productora, pais;
        int año, duracion, nTemporadas, nCapitulos;
        boolean tendencia;
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            while ((line = br.readLine()) != null) {
                String[] split = line.split(";");
                tipoContenido = split[0];
                titulo = split[1];
                año = Integer.valueOf(split[2]);
                duracion = Integer.valueOf(split[3]);
                descripcion = split[4];
                tendencia = Boolean.valueOf(split[5]);
                // Informacion de una Pelicula
                if (tipoContenido.charAt(0)== 's') { 
                    nTemporadas = Integer.valueOf(split[6]);
                    nCapitulos = Integer.valueOf(split[7]);
                } 
                // Informacion de una Pelicula
                else { 
                    productora = split[6];
                    pais = split[7];
                }                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}