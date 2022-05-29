/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02;

/**
 *
 * @author Paulo
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Nova Caneta Azul
        Caneta nova_caneta = new Caneta();
        nova_caneta.carga = 50;
        nova_caneta.cor = "Azul";
        nova_caneta.modelo = "Bic";
        nova_caneta.tampar();
        //nova_caneta.ponta = 0.5f;
        nova_caneta.destampar();
        //nova_caneta.status();
        nova_caneta.rabiscar();
        
        
        System.out.println("\n");
        
        //Nova Caneta Vermelha
        Caneta nova_caneta2 = new Caneta();
        nova_caneta2.carga = 70;
        nova_caneta2.cor = "Vermelha";
        nova_caneta2.modelo = "Faber Castel";
        //nova_caneta2.ponta = 1.0f;
        nova_caneta2.tampar();
        //nova_caneta2.status();
        nova_caneta2.rabiscar();
        
    }
    
}
