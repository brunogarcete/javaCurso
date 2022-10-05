/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unidad2;

import java.util.Date;

/**
 *
 * @author Claudio
 */
public interface Trabajador {
    public void trabajar();
    public void descansar();
    public int cobrarSueldo();
    public Date marcarEntrada();
    public Date marcarSalida();
}
