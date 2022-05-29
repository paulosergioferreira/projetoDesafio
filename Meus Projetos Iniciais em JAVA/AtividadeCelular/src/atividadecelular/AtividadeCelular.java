package atividadecelular;


public class AtividadeCelular {

  
    public static void main(String[] args) {
        
        Celular c = new Celular(false,10);
        c.setLigado(true);
        c.setModelo("Redmi note 8");
        c.setMarca("Xiaomi");
        c.setCor("Azul");
        c.setArmazenamento(128);
        c.aumentarVolume();
        c.diminuirVolume();
        c.diminuirVolume();
        c.status();

    }
    
}
