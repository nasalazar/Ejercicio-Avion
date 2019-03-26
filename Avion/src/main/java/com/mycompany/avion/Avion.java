/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avion;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author NATHALY
 */
public class Avion {
    
    private int codigo;
    private String aerolinea;
    
    private static Map<Integer, Avion> mapaAvion = new HashMap();
    private static Map<Integer, Silla> mapaSilla = new HashMap();

    public Avion(int codigo, String aerolinea) {
        this.codigo = codigo;
        this.aerolinea = aerolinea;
        
    } 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public Map<Integer, Avion> getMapaAvion() {
        return mapaAvion;
    }

    public void setMapaAvion(Map<Integer, Avion> mapaAvion) {
        this.mapaAvion = mapaAvion;
    }

    public Map<Integer, Silla> getMapaSilla() {
        return mapaSilla;
    }

    public void setMapaSilla(Map<Integer, Silla> mapaSilla) {
        this.mapaSilla = mapaSilla;
    }

    
    
    


}
