/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02exercicio;

/**
 *
 * @author Paulo
 */
public class Aula02Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Controle c = new Controle();
        c.valor = 90f;
        c.tipo = "Controle de Televisão";
        c.marca = "Samsung";
        c.cor = "Preto";
        c.carregado = false;
        c.ligaTv();
        c.desligaTv();
        c.Status();
        
        
    }
    
}
