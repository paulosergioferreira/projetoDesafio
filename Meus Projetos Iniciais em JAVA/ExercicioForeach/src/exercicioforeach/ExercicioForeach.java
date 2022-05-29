/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioforeach;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Paulo
 */
public class ExercicioForeach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        String vetor_nomes[] = new String[4];
        int v_int[] = new int[3]; 
        
        Arrays.fill(v_int,8); //Preenchimento automatico de Valores
        for(int f:v_int){
            
            System.out.println(f);
            
        }
        
        vetor_nomes[0] = "Paulo";
        vetor_nomes[1] = "Zulmira";
        vetor_nomes[2] = "Jaqueline";
        vetor_nomes[3] = "Esther";
        
        Arrays.sort(vetor_nomes); //ordem
        int n = Arrays.binarySearch(vetor_nomes,"Paulo"); //busca
        
        System.out.println("Teste:"+n);
        for(String nome: vetor_nomes){
            
            System.out.println("Nome: "+nome);
            
        }
        
        
    }
    
}
