/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clickergame;

import java.io.Serializable;

/**
 *
 * @author Sierra
 */
public class Jugadores implements Serializable{
    
    private String nombre;
    private String tiempo;

    public Jugadores(String nombre, String tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }
    
    public Jugadores(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
}
