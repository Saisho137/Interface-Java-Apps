/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriculas;

/**
 *
 * @author User
 */
public class programa {
    
    private String nombre;
    private double valor;
    private int num;
    private int estrato;

    public programa(String nombre, int valor, int num, int estrato) {
        this.nombre = nombre;
        this.valor = valor;
        this.num = num;
        this.estrato = estrato;
    }
    
    public programa() {}
    
    public int matricular(){
        return num = Interfaz.cont;
    }
    //
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }         

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }
    
}
