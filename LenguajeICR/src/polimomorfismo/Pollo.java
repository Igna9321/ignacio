/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimomorfismo;

/**
 *
 * @author Nacho
 */
public class Pollo extends Animal implements ComportamientoRuido{
    @Override
    public String hacerRuido(){
    return"pio pio"+getNombre();
    }
    
}
