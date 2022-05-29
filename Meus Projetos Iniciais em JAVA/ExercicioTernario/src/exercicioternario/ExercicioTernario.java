/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioternario;

/**
 *
 * @author Paulo
 */
public class ExercicioTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1 = 7, n2 = 5, r, r2;
        
        r = (n1>n2)?n1:n2;
        r2 = (n1<n2)?n1-n2:n1+n2;
        System.out.println("resultado: "+r2);
    }
    
}
