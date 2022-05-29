/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioventilador;

/**
 *
 * @author Paulo
 */
public class ExercicioVentilador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ventilador v = new Ventilador();
        v.marca = "Arno";
        v.modelo = "Ventilador de Cadeira";
        v.potencia = 2;
        v.tamanho = 5.8f;
        v.tipo = "6 Elisses";
        v.cores("Preto");
        v.status();
        v.ligado();
        v.nivelVento();
        
        //v.ligado();
        //v.nivelVento();
    }
    
}
