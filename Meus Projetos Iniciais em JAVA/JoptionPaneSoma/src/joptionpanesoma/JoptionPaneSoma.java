/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joptionpanesoma;

import javax.swing.JOptionPane;
/**
 *
 * @author Paulo
 */
public class JoptionPaneSoma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i, n=0, a=0, p=0,y=0, c=0;
        String resp;
        do{
        i = Integer.parseInt(JOptionPane.showInputDialog(null, "Pergunta"));
        n = n + i;    
        resp = JOptionPane.showInputDialog(null,"Deseja somar mais um Número? S/N");
        a++;
        if(n % 2 == 0){
            p++;
        }else{
            y++;
        }
        if(n > 100){
            
            c++;
            
        }
        }while(resp.equals("s"));
        int media = n/a;
        JOptionPane.showMessageDialog(null,"Soma dos Valores: "+n+"\n"+"Total de Valores: "+a+"\n"+
                "Impares: "+y+"\n"+"Pares: "+p+"\n"+"Acima de 100: "+c+"\n"+"Media dos Valores: "+media);
    }
    
}
