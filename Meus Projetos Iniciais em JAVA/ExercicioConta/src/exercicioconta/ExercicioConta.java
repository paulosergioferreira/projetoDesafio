/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioconta;

import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class ExercicioConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conta conta = new Conta(0,false);
        conta.setDono("Paulo");
        conta.setNumConta(33471);
        conta.abrirConta("Cp");
        conta.depositar(1100);
        conta.depositar(100);
        conta.fecharConta();
        conta.estadoAtual();
        
        //Scanner entradaConta = new Scanner(System.in);
       // conta.abrirConta("Cc");
        
    }
    
}
