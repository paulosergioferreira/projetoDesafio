package exercicioyoutube;


public class Gafanhoto extends Pessoa{
    
    private String login;
    private int totAssistido;
    
    public Gafanhoto(String login, String nome, String sexo, int idade, int experiencia){
        
        super(nome,sexo,idade,experiencia);
        
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.experiencia = experiencia;
        this.login = login;
        this.totAssistido = 0; 
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return " Gafanhoto{"+super.toString() + " login=" + login + ", totAssistido=" + totAssistido ;
    }
    
    
    
    public void viuMaisUm(){
        
        this.setTotAssistido(this.getTotAssistido()+1);
        
    }
    
}
