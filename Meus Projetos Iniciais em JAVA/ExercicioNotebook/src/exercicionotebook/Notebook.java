package exercicionotebook;


public class Notebook {
    
    private String marca, modelo, cor, configuracao, autonomia, memoria;
    private int tamanho;
    private boolean ligado, desligado;
    
    public Notebook(String m, String mo, int tam){
        
        this.marca = m;
        this.modelo = mo;
        this.tamanho = tam;
        this.ligado = true;
    }
    
    public String getMarca(){
        
        return this.marca;
        
    }
    
    public void setMarca(String marca){
        
        this.marca = marca;
        
    }
    
    public String getModelo(){
        
        return this.modelo;
        
    }
    
    public void setModelo(String modelo){
        
        this.modelo = modelo;
        
    }
    
    public String getCor(){
        
        return this.cor;
        
    }
    
    public void setCor(String cor){
        
        this.cor = cor;
        
    }
    
    public String getConfiguracao(){
        
        return this.configuracao;
        
    }
    
    public void setConfiguracao(String configuracao){
        
        this.configuracao = configuracao;
        
    }
    
    public String getAutonomia(){
        
        return this.autonomia;
        
    }
    
    public void setAutonomia(String autonomia){
        
        this.autonomia = autonomia;
        
    }
    
    public String getMemoria(){
        
        return this.memoria;
        
    }
    
    public void setMemoria(String memoria){
        
        this.memoria = memoria;
        
    }
    
    public int getTamanho(){
        
        return this.tamanho;
        
    }
    
    public void setTamanho(int tamanho){
        
        this.tamanho = tamanho;
        
    }
    
    public boolean getLigado(){
        
        return this.ligado;
        
    }
    
    public void setLigado(boolean ligado){
        
        this.ligado = ligado;
        
    }
    
    public boolean getDesligado(){
        
        return this.desligado;
        
    }
    
    public void setDesligado(boolean desligado){
        
        this.desligado = desligado;
        
    }
    
    public void ligado(){
        
        if(this.ligado == true){
            
            System.out.println("Notebook Ligado !!!");
            
        }
        
    }
    
    public void desligado(){
        
        if(this.desligado == true){
            
            System.out.println("Notebook Desligado");
            
        }
        
    }
    
    public void status(){
        if(this.ligado == true){
        System.out.println("Informações Sobre Notebook"+"\n"+"Marca: "+getMarca()+"\n"+"Modelo: "+getModelo()+"\n"
        +"Cor: "+getCor()+"\n"+"Configuração: "+getConfiguracao()+"\n"+"Tamanho: "+getTamanho()+"\n"+"Autonomia: "+getAutonomia()
        +"\n"+"Memoria: "+getMemoria());
        }else{
            System.out.println("Notebook Desligado");
        }
    }
    
    public void digitar(){
        if(this.ligado == true){
        System.out.println("Teclado Liberado, pode digitar");
        }else{
            System.out.println("Notebook Desligado, impossivel Digitar");
        }
    }
    
    public void assistindo(){
        if(this.ligado == true){
            System.out.println("Televisão Ligada, Assistindo");
        }else{
            System.out.println("Notebook Desligado, Impossivel Assistir");
        }
    }
    
    public void tocando(){
        if(this.ligado == true){
            System.out.println("Tv com som Ativo");
        }else{
            System.out.println("Impossivel sair som, Notebook Desligado");
        }
        
    }
    
    
}
