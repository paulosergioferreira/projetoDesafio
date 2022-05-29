package exercicioyoutube;


public abstract class Pessoa {
    
    protected String nome, sexo;
    protected int idade, experiencia;

    public Pessoa(String nome, String sexo, int idade, int experiencia) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.experiencia = experiencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
    
    
    protected void ganharExperiencia(){
        
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", experiencia=" + experiencia  ;
    }
    
    
    
}
