/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author Nacho
 */
public class Antro {

    public static void main(String[] args){
        Direccion d1=new Direccion(55130,"Ecatepunk");
       Usuario u=new Usuario("Juan",42,"jcampos@gail.com",new Direccion(55130,"Ecatepunk"));
        System.out.println(u.getDireccion().getMunicipio());
    }

    
}