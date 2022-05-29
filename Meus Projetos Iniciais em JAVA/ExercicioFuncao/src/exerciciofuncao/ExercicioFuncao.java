/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciofuncao;

/**
 *
 * @author Paulo
 */
public class ExercicioFuncao {

    static int soma(int nota1, int nota2){
        
        int resultado = nota1 + nota2;
        
        return resultado;
    }
    
    public static void main(String[] args) {
        
        int a = soma(9,9);
        System.out.println("soma: " +  a);
    }
    
}
