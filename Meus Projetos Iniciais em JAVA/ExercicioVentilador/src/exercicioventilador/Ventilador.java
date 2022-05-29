package exercicioventilador;


public class Ventilador {
    
    public String marca;
    public String modelo;
    public String tipo;
    public boolean statusVentilador;
    private String cor;
    protected int potencia;
    protected float tamanho;
    
    void girando(){
        
    }
    
    void parado(){
        
    }
    
    public void ligado(){
        
        //System.out.println("Ventilador Ligado !!!");
        this.statusVentilador = true;
    }
    
    public void desligado(){
        
        //System.out.println("Ventilador Desligado");
        this.statusVentilador = false;
    }
    
    protected void nivelVento(){
        if(this.statusVentilador == true){
            System.out.println("Ventilador está ligado !!!");
            if(this.potencia == 1){
                System.out.println("Potencia Baixa");
            }else if(this.potencia == 2){
                System.out.println("Potencia: Media");
            }else if(this.potencia == 3){
                System.out.println("Potencia: Grande");
            }
            
        }else{
            
            System.out.println("Impossivel Definir Potencia, Ventilador Desligado !!!");
        }
        
    }
    
    public void ventando(){
        
        if(this.statusVentilador == true){
            
            System.out.println("Ventando");
        }
        
        
    }
    
    public void status(){
        
        System.out.println("Ventilador"+"\n"+"Marca: "+this.marca+"\n"+"Modelo: "+this.modelo+"\n"+"Tipo: "+this.tipo+"\n"
        +"Tamanho: "+this.tamanho+"\n"+"Potencia: "+this.potencia+"\n"+"Cor: "+this.cor);
        
    }
    
    protected String cores(String c){
        
        this.cor = c;
        return c;
    }
    
    
}
