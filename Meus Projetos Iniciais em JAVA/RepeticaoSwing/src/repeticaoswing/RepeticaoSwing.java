/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaoswing;

import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class RepeticaoSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero,s=0;
        String res;
        do{
            System.out.println("Digite um Número: ");
            numero = entrada.nextInt();
            System.out.println("Deseja inserir mais um numero? S/N");
            res = entrada.next();
            
            s = s + numero;
        }while(res.equals("s"));
        
        System.out.println("Soma dos Valores: "+s);
    }
    
}
