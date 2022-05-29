/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador;

import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class Contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c = new Conta();
        Scanner entrada_ini = new Scanner(System.in);
        Scanner entrada_fim = new Scanner(System.in);
        
        System.out.println("Digite o valor Inicial: ");
        int e = entrada_ini.nextInt();
        System.out.println("Digite o valor Final: ");
        int s = entrada_fim.nextInt();
        c.setValor(e, s); 
        System.out.println(c.getValor());
    }
    
}
