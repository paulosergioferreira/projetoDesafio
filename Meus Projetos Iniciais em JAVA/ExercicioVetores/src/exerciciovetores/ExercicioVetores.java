/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciovetores;

/**
 *
 * @author Paulo
 */
public class ExercicioVetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int notas[] = new int[4];
        String nomes[] = {"Alex", "Jorge", "Maria", "Andreia"};
        notas[0] = 8;
        notas[1] = 5;
        notas[2] = 9;
        notas[3] = 10;
        int i=0;
        while(i<=3){
            
            System.out.println(notas[i]);
            System.out.println(nomes[i]);
            i++;
        }
        
        
        for(int a=0;a<nomes.length;a++){
            
            System.out.println("Nomes: "+nomes[a]);
        }
        
        
        
        System.out.println(notas.length);
    }
    
}
