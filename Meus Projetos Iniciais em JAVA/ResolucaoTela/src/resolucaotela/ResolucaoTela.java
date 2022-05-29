/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Paulo
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();
        
        System.out.println("Altura : "+dimensao.height+"\n");
        System.out.println("Largura : "+dimensao.width+"\n");
        
        
    }
    
}
