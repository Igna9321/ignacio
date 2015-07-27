/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea;

/**
 *
 * @author T-301
 */
public class Nomina extends Usuario{
    private Usuario usuario;
    private float sueldo_base;
    private int horas_laboradas;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public float getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(float sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public int getHoras_laboradas() {
        return horas_laboradas;
    }

    public void setHoras_laboradas(int horas_laboradas) {
        this.horas_laboradas = horas_laboradas;
    }
    
}
