/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciofuncao2;

import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class ExercicioFuncao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2;
        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Digite a Primeira Nota: ");
        n1 = entrada.nextInt();
        System.out.println("Digite a Segunda Nota: ");
        n2 = entrada1.nextInt();
        int total = Calcular.soma(n1, n2);
        System.out.println(total);
        
        
    }
    
}
