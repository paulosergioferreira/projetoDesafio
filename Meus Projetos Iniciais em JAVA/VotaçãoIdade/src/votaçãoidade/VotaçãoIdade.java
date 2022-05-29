/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votaçãoidade;

import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class VotaçãoIdade {

    /**
     * @param args the command line arguments
     */
    // 16 < : não vota
    // 16>= e <=18 : votação opcional
    // 18 >= e <=70 : votação obrigatoria
    // 70 > : votação opcional
    public static void main(String[] args) {
        
        int idade;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua Idade: ");
        idade = entrada.nextInt();
        
        if(idade < 16){
            
            System.out.println("Voce não Vota !!!");
        }else{
            
            if(idade >= 16 && idade < 18){
                
                System.out.println("Votação Opcional !!!");
                
            }else{
                
                if(idade >= 18 && idade<= 70){
                    
                    System.out.println("Votação Obrigatoria !!!");
                    
                }else{
                    
                    if(idade > 70){
                        
                        System.out.println("Votação Opcional");
                        
                    }
                    
                }
            }
            
        }
        
    }
    
}
