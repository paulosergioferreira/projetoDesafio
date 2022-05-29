/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casepernas;

import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class CasePernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite quantas Pernas Existem: ");
        int pernas = entrada.nextInt();
        String tipo_perna;
        switch(pernas){
            
            case 1:
                tipo_perna = "Saci";
            break;
            
            case 2:
                tipo_perna = "Bipede";
            break;
            
            case 4:
                tipo_perna = "Quadrupede";
            break;
            
            case 6,8:
                tipo_perna = "Aranha";
            break;
            
            default:
                tipo_perna = "ET";
            break;
                
        }
        System.out.println(tipo_perna);
    }
    
}
