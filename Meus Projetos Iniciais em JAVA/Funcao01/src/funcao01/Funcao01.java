/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcao01;

import fatorial.Fatorial;

/**
 *
 * @author Paulo
 */
public class Funcao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fatorial f = new Fatorial();
        f.setValor(5);
        System.out.println(f.getFormula());
        System.out.println(f.getFatorial());
    }
    
}
