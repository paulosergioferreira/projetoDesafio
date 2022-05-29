package exerciciopessoa;

//Classe Pessoa 
public class Pessoa {
    //Atributos da Classe Pessoa 
    private String nome, sexo;
    private int idade;
    //Metodo Construtor da Classe Pessoa, Assim que é criado uma nova pessoa
    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    //Metodos Especiais 
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
    //Metodo interno de Pessoa
    public void fazerAniversario(){
        
        this.setIdade(this.getIdade()+1);
        
    }
    
}
