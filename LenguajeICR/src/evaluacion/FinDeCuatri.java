/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion;

/**
 *
 * @author T-107
 */
public class FinDeCuatri {
    
    public static void main(String[] args)throws PorcentajeException{
    
        //creamos un objeto de tipo parcial
        ExamenParcial eParcial=new ExamenParcial();
                      eParcial.setCalificacion(10);
                      eParcial.setPorcentaje(0.5f);
                      
        ExamenFinal eFinal=new ExamenFinal();
                      eParcial.setCalificacion(10);
                      eFinal.setPorcentaje(0.6f);
                      
//creamos el modelo de evalucaion
                      ModeloEvaluacion modelo=new ModeloEvaluacion();
                      System.out.println(modelo.evaluar(eParcial, eFinal));
        
    }
    
}
