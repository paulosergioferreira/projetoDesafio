package exerciciointerface;


public class Televisão implements InterfaceCarcaca{
    
    private String marca, modelo, tamanho;
    private int polegada;
    private float valor;
    private boolean ligada, som;
    
    
    public void ligar(){
        
        this.setLigada(true);
        System.out.println("Televidão esta Ligada :"+this.isLigada()+"\n"+this.getMarca());
    }
    
    public void desligada(){
        
        if(this.isLigada() == true){
            this.setLigada(false);
            System.out.println("Televisão Desligada");
        }else{
            
            System.out.println("A tv já esta Desligada");
            
        }
    }
    
    public void aumentar(){
        int aumento;
        if(this.isLigada()==true){
            
            for(aumento = 0 ;;aumento = aumento + 10){
                System.out.println(aumento);
            }
        }
        
    }
    
    public void diminuir(){
        
        
    }

    public Televisão(boolean ligada, boolean som) {
        this.ligada = ligada;
        this.som = som;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getPolegada() {
        return polegada;
    }

    public void setPolegada(int polegada) {
        this.polegada = polegada;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public boolean isSom() {
        return som;
    }

    public void setSom(boolean som) {
        this.som = som;
    }
    
    
    
}
