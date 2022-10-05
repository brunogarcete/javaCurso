/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unidad2;

/**
 *
 * @author Claudio
 */
public class TestMedicamento {
    public static void main(String[] args) {
        Medicamento m = new Medicamento();
        
        m.codigo = 123121;
        m.precio = 10000;
        m.descripcion = "Aspirineta";
        System.out.println(m);
    }
}
