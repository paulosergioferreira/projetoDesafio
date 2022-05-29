/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicionotas;

import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class ExercicioNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada_nota = new Scanner(System.in);
        Scanner resposta = new Scanner(System.in);
        classeNotas n = new classeNotas();
        String r;
        int a=0;
        do{
        
            System.out.println("Digite a nota do Aluno");
            n.notas(entrada_nota.nextFloat());
            System.out.println("Deseja Inserir outra nota?");
            r = resposta.next();
            a++;
        }while(r.equals("s"));
        
        System.out.println("Media: "+n.getSoma()/a);
    }
    
}
