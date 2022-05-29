/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageCalc;

/**
 *
 * @author Paulo
 */
public class Calculos {
    int pot,abs;
    double r,rc;
    String resposta;
    void setResto(int resto){
        
        if(resto%2==0){
            
            resposta = "Numero Par";
        }else{
            resposta = "Numero Impar";
        }
        
    }
    String getResto(){
        
        return resposta;
        
    }
    
    void setPotencia(int p){
        
        pot = (int) Math.pow(p, 3);
        
    }
    
    int getPotencia(){
        
        return pot;
    }
    
    void setRaiz(double raiz){
        
        r = Math.sqrt(raiz);
        
    }
    
    double getRaiz(){
        
        return r;
    }
    
    void setRaizC(double r){
        
        rc = Math.cbrt(r);
    }
    
    double getRaizC(){
        
        return rc;  
    }
    
    void setAbs(int absoluto){
        
        abs = Math.abs(absoluto);
    }
    
    double getAbs(){
        
        return abs;
        
    }
}
