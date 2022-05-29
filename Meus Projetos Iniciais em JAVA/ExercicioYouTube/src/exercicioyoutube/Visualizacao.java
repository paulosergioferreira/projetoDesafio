package exercicioyoutube;


public class Visualizacao {

    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    public void avaliar(){
        
        this.filme.setAvaliacao(5);
        
    }
    
    public void avaliar(int nota){
        
       this.filme.setAvaliacao(nota);
        
    }
    
    public void avaliar(float porc){
        
        
        
    }

    @Override
    public String toString() {
        return "Visualizacao{"+ "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
    
}
