package exercicioanimais;


public class Ave extends Animal{
    
    protected String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
    
    protected void fazerNinho(){
        
        System.out.println("Fazendo Ninho");
        
    }

    @Override
    protected void locomover() {

        System.out.println("Voando");
        
    }

    @Override
    protected void alimentar() {

        System.out.println("Comendo cereais");
        
    }

    @Override
    protected void emitirSom() {

        System.out.println("Piando");
        
    }
}
