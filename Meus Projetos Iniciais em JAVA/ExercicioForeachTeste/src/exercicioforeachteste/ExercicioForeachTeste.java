/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioforeachteste;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class ExercicioForeachTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int v_notas[] = new int[4], i=0;
        Scanner entrada = new Scanner(System.in);
        int nota,total=0;
        
        do{
            
            System.out.println("Digite a Nota do Aluno: ");
            nota = entrada.nextInt();
            v_notas[i] = nota;
           // Arrays.sort(v_notas);
            i++;
            //total = (total + nota/4);
        }while(i < v_notas.length);
       
        for(float n : v_notas){
            Arrays.sort(v_notas);
            System.out.println("Nota: "+n);
            
        }
       
    }
    
}
    