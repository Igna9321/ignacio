/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author T-107
 */
public class Usuario {
    //primer regla de encapsulamiento
    String nombre;
    int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad()throws Exception{
        if (edad<0)throw new Exception
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
  
}
