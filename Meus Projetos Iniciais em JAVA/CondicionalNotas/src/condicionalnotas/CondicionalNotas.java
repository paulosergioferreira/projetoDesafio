/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalnotas;

import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class CondicionalNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float n1, n2, total;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a 1° Nota: ");
        n1 = teclado.nextFloat();
        System.out.println("Digite a 2° Nota: ");
        n2 = teclado.nextFloat();
        total = (n1+n2)/2;
        if(total >=7){
            
            System.out.println("Parabéns, aprovado");
            
        }else{
            
            System.out.println("Reprovado !!!");
            
        }
    }
    
}
