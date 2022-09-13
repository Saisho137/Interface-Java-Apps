/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clickergame;

import javax.swing.JProgressBar;

/**
 *
 * @author Sierra
 */
public class NPC extends Thread {

private String nombre;
    private long tiempo;
    private JProgressBar barra;
    private boolean running = true;
    private int i = 0;

    public NPC(String nombre, long tiempo, JProgressBar barra) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.barra = barra;
    }
    
    public NPC(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
  
    
    @Override
    public void run(){
            while (running && i < 101) {
            barra.setValue(i);
            
            try{
                Thread.sleep(tiempo);
            }
            catch (InterruptedException e) {
                 e.printStackTrace();
            }
            i++;
        }
    }
    
    public void Stop() {
        running = false;
    }
}

