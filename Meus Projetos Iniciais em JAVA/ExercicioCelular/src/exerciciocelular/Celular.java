package exerciciocelular;


public class Celular {
    
    public String marca;
    public String modelo;
    public float tamanho;
    private int quant_cameras;
    protected String cor;
    public boolean ligada,descarregado;
    
    public Celular(){ //construtor
    
        this.ligada = false;
        this.descarregado();
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String m){
        this.marca = m;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String mo){
        this.modelo = mo;
    }
    
    public float getTamanho(){
        return this.tamanho;
    }
    
    public void setTamanho(float t){
        this.tamanho = t;
    }
    
    public int getQuant(){
        return this.quant_cameras;
    }
    
    public void setQuant(int q){
        this.quant_cameras = q;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public boolean getLigada(){
        return this.ligada;
    }
    
    public void setLigada(boolean l){
        this.ligada = l;
    }
    
    public boolean getDescarregado(){
        return this.descarregado;
    }
    
    public void setDescarregado(boolean d){
        this.descarregado = d;
    }
    
    public void ligada(){
        
        if(this.ligada == true){
            System.out.println("Celular Ligado com Sucesso !!!");
        }else{
            System.out.println("Celular esta Desligado");
        }
        
    }
    
    public void descarregado(){
        
        this.descarregado = true;
    
    }
    
    public void fazerLigacao(){
        
        if(ligada == true && descarregado != true){
            
            System.out.println("Ligação Efetuada");
            
        }else{
            
            System.out.println("Impossivel Realizar Ligação");
            
        }
        
    }
    
    public void enviarMensagem(){
        
        if(ligada == true && descarregado != true){
            
            System.out.println("Ligação Efetuada");
            
        }else{
            
            System.out.println("Impossivel Eviar Mensagem");
            
        }
        
    }
    
}
