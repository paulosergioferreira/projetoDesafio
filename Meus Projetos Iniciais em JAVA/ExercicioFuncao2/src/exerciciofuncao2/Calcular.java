/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciofuncao2;

/**
 *
 * @author Paulo
 */
public class Calcular {
  
    
   static int soma(int nota1,int nota2){
        int i=0,contato=0;
       while(nota1<nota2){
           
           nota1 = nota1 + i;
           i++;
           System.out.println(nota1);
       }
        
       return nota1;
    }
    
}