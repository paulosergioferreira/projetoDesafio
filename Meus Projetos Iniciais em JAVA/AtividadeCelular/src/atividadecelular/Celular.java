package atividadecelular;


public class Celular implements InterfaceCelular{
    
    private String marca, modelo, cor;
    private boolean ligado;
    private int armazenamento;
    private int volume;

    public Celular(boolean ligado, int volume) {
        this.ligado = ligado;
        this.volume = volume;
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }
    
    public void setVolume(int volume){
        
        this.volume = volume;
        
    }
    public int getVolume(){
        return volume;
    }

    @Override
    public void ligando() {

        if(this.isLigado()!=true){
            System.out.println("Ligando Celular !!!");
            this.setLigado(true);
        }else{
            System.out.println("Celular já esta Ligado !!!");
        }
        
    }

    @Override
    public void desligando() {

        if(this.isLigado()){
            System.out.println("Desligando Celular !!!");
            this.setLigado(false);
        }else{
            System.out.println("Celular já esta desligado");
        }
        
    }

    @Override
    public void ligacao() {
        
        if(this.isLigado()){
            System.out.println("Realizando Ligação");
        }else{
            System.out.println("Celular Desligado, impossovel realizar ligação");
        }

    }

    @Override
    public void status() {
        for(int i=0;i<=this.getVolume();i++){
            System.out.print("|");
        }
        System.out.println("\n"+"Status do Celular"+"\n"+"Marca: "+this.getMarca()+"\n"+"Modelo: "+this.getModelo()+"\n"+"Cor: "+this.getCor()
        +"\n"+"Ligado: "+this.isLigado()+"\n"+"Armazenamento: "+this.getArmazenamento());
        
    }

    @Override
    public void aumentarVolume() {
        
        this.setVolume(this.getVolume()+10);
        
    }

    @Override
    public void diminuirVolume() {

        this.setVolume(this.getVolume()-10);
       
    }

    

    
    
    
    
}
