/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserva_vuelos;

/**
 *
 * @author User
 */
public class Pasajero {

    private int cedula;
    private String nombre;
    private int edad;
    private String sexo;
    private String clase;
    private String ubicacion;
    private int puesto;

    public int getCedula() {
        return cedula;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public Pasajero(int cc, String name, int age, String gen, String clas, String ubi, int pst) {
        cedula = cc;
        nombre = name;
        edad = age;
        sexo = gen;
        clase = clas;
        ubicacion = ubi;
        puesto = pst;
    }
    
    public Pasajero() {   
        
    }

    boolean contains(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
