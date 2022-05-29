package exercicioanimais;

public class Mamifero extends Animal{

    protected String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    //@Override
    public String statusMamifero() {
        return "Mamifero{" + "Cor do Pelo: " + this.getCorPelo() + "Peso: " + this.getPeso() + "Idade: " + this.getIdade() + "Membros: " + this.getMembros() +'}';
    }
    

    @Override
    protected void locomover() {

        System.out.println("Corre");
        
    }

    @Override
    protected void alimentar() {
        
        System.out.println("Comendo");
        
    }

    @Override
    protected void emitirSom() {
        
        System.out.println("Emitindo som");
        
    }
    
}
