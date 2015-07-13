/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial;

/**
 *
 * @author T-107
 */
public class EXAMENPARCIAL {
     public static void main(String[] args)throws Exception{
        // TODO code application logic here
      Libros libros[]=new Libros[2];
      
      Profesor profesor=new Profesor();
      Alumno alumno=new Alumno();
      Externo e=new Externo();
      
      
      alumno.setLibros(libros);
      profesor.setLibros(libros);
      e.setLibros(libros);
      
    Prestamo p=new Prestamo();
    p.prestarLibros(e);
    
    
    }
    
}
