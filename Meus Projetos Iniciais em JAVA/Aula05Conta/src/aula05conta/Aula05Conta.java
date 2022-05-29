/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05conta;

/**
 *
 * @author Paulo
 */
public class Aula05Conta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conta conta = new Conta(true, 0);
        conta.setDono("Paulo Sérgio");
        conta.setNumConta(12345);
        conta.abrirConta("Cc");
        //conta.fecharConta();
        conta.depositar(500);
        conta.depositar(200);
        conta.sacar(310);
        //conta.pagarMensal();
        
        conta.situacaoConta();
        
        
        
    }
    
}
