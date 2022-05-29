package exercicioanimais;


public class Peixe extends Animal{
    
    protected String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    protected void soltarBolha(){
        
        System.out.println("Soltando Bolha");
        
    }

    @Override
    protected void locomover() {
        
        System.out.println("Nadando");

    }

    @Override
    protected void alimentar() {
        
        System.out.println("Comendo peixinhos");
        
    }

    @Override
    protected void emitirSom() {
        
        System.out.println("Sem som");

    }
    
    
    
}
