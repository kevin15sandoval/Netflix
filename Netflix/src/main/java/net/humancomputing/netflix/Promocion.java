/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.humancomputing.netflix;

/**
 * @version 0.1
 * @author Paulino Esteban Bermúdez Rodríguez | humancomputing.net
 */
public class Promocion {

    private boolean redesSociales, cartelEnSol, tendencia;
    private int coste;

    public Promocion (boolean redesSociales, boolean cartelEnSol, boolean tendencia, int coste ){
        this.redesSociales=redesSociales;
        this.cartelEnSol=cartelEnSol;
        this.tendencia=tendencia;
        this.coste=coste;
    }
    // Getter
    public boolean getRedesSociales() {
        return redesSociales;
    }

    public boolean getCartelEnSol() {
        return cartelEnSol;
    }
    
    public boolean getTendencia() {
        return tendencia;
    }

    public int getCoste() {
        return coste;
    }
    // Setter
    public void setRedesSociales(boolean redesSociales) {
        this.redesSociales = redesSociales;
    }

    public void setCartelEnSol(boolean cartelEnSol) {
        this.cartelEnSol = cartelEnSol;
    }

    public void setTendencia(boolean tendencia) {
        this.tendencia = tendencia;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

}
