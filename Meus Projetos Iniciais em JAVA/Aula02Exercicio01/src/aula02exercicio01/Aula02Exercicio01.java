/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02exercicio01;

/**
 *
 * @author Paulo
 */
public class Aula02Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Trabalho t = new Trabalho();
        t.setor = "CST";
        t.cargo = "Desenvolvedor";
        t.andar = "3°Andar";
        t.baterPontoEntrada();
        //t.baterPontoSaida();
        t.baterPontoSaida();
    
        t.status();
        t.ligarComputador();
        t.trabalhando();
    }
    
}
