package exercicioanimais;

public class Reptiu extends Animal{
    
    protected String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    

    @Override
    protected void locomover() {
        
        System.out.println("Rastejando");
        
    }

    @Override
    protected void alimentar() {

        System.out.println("Comendo");
        
    }

    @Override
    protected void emitirSom() {
        
        System.out.println("Gemendo");

    }
    
    
    
}
