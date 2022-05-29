/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

/**
 *
 * @author Paulo
 */
public class Caneta {
    
    public String modelo, cor, t;
    private float ponta;
    public int carga;
    private boolean tampada;
    
    private void status(){
        if(this.tampada == true){
            t = "Tampada";
        }else{
            t = "Destampada"; 
        }
        System.out.println("Modelo: "+this.modelo+"\n"+"Cor: "+this.cor+"\n"+"Ponta: "+this.ponta+"\n"
                            +"Carga: "+this.carga+"\n"+"A caneta esta "+t);
        
    }
    
    void rabiscar(){
        
        if(this.tampada == true){
            
            System.out.println("Erro , caneta tampada!");
        }else{
            
            System.out.println("Rabiscando");
        }
        
    }
    
    public void tampar(){
        
       this.tampada = true;
        
    }
    
    public void destampar(){
        
        this.tampada = false;
        
    }
}