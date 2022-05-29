package exercicioanimais;


public class Cachorro {
    
    private String resposta;
    private int hora, idade;
    private boolean dono;
    private float peso;

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isDono() {
        return dono;
    }

    public void setDono(boolean dono) {
        this.dono = dono;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    
    
    

    public void reagir(String r){
        this.setResposta(r);
        if(this.getResposta().equals("agradavel")){
            System.out.println("Abanando e Latindo");
        }else{
            if(this.getResposta().equals("agressiva")){
                System.out.println("Rosnando");
            }
        }
        
    }
    
    public void reagir(int h){
        this.setHora(h);
        if(this.getHora()>=00 && this.getHora()<=12){
            System.out.println("Manhã, Cachorro Abanando");
        }else{
            if(this.getHora()>=13 && this.getHora()<18){
                System.out.println("Tarde, Cachorro Abanando e Latindo");
            }else{
                if(this.getHora()>=18 && this.getHora()<=23){
                    System.out.println("Noite, Cachorro Ignorando");
                }
            }
        }
        
    }
    
    public void reagir(boolean d){
        this.setDono(d);
        if(this.isDono()){
            System.out.println("Abanando para o Dono");
        }else{
            System.out.println("Rosnando para Desconhecido");
        }
        
        
    }
    
    public void reagir(int i, float p){
        this.setIdade(i);
        this.setPeso(p);
        //novo <=7
        //peso leve <=7
        //peso pesado >=18 <=26
        //velho >= 8
        if(this.getIdade()<=7 && this.getPeso()<=7){
            System.out.println("Cachorro leve e novo, Abanando");
        }else{
            if(this.getIdade()<=7 && (this.getPeso()>=18 && this.getPeso()<=26)){
                System.out.println("Cachorro Novo e Pesado, Latindo");
            }else{
                if(this.getIdade()>=8 && this.getPeso()<=7){
                    System.out.println("Cachorro Velho e Leve, Rosnando");
                }else{
                    if(this.getIdade()>=8 && this.getPeso()>=18){
                        
                        System.out.println("Ignorar");
                    }
                }
            }
        }
        
    }
    
}
