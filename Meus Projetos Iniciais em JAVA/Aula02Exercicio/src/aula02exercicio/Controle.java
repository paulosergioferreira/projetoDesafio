package aula02exercicio;


public class Controle {
    
    String cor, marca,tipo;
    float valor;
    boolean carregado,liga,desliga;
    
    void ligaTv(){
        if(this.carregado == true){
            this.liga = true;
            System.out.println("TV Ligada");
        }else{
            System.out.println("Controle sem Pilha, Impossivel Ligar");
        }
    }
    
    void desligaTv(){
        if(this.carregado==true){
            this.desliga = true;
            System.out.println("TV Desligada");
        }else{
            
            System.out.println("Controle sem Pilha, Impossivel Desligar");
        }
    }
    
    void comPilha(){
        
        if(this.carregado == true){
            System.out.println("Controle com Pilha");
        }else{
            System.out.println("Controle sem Pilha");
        }
        
    }
    
    void Status(){
        
        System.out.println("Cor: "+this.cor+"\n"+"Marca: "+this.marca+"\n"+"Tipo: "+this.tipo+"\n"+"Valor: "
                + "R$:"+this.valor+"\n"+"Carregado: "+this.carregado);
        
    }
    
}
