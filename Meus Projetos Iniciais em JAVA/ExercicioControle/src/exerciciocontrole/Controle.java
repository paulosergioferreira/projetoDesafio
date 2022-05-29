
package exerciciocontrole;

/**
 *
 * @author Paulo
 */
public class Controle implements ControleInterface{
    
    private String marca, modelo;
    private boolean ligada, som;
    private int aumentar;
    public Controle(boolean ligada, boolean som) {
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

    @Override
    public void aumentarVolume() {

        
        
    }

    @Override
    public void diminuirVolume() {

    }

    @Override
    public void ligarTv() {
        
        this.setLigada(true);
        System.out.println("TV Ligada");

    }

    @Override
    public void desligarTv() {
        if(this.isLigada()){
            this.setLigada(false);
            System.out.println("TV Desligada");
        }else{
            System.out.println("TV já esta Desligada");
        }
    }

    @Override
    public void status() {

        System.out.println("Informações sobre o Controle"+"\n"+"Marca: "+this.getMarca()+"\n"+"Modelo: "+this.getModelo()
        +"\n"+"A tv está :"+this.isLigada()+"\n"+"O volume esta: "+this.isSom());
        
    }
    
    
}
