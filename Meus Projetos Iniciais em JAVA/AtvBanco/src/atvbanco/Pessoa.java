package atvbanco;


public class Pessoa {
    
    private String nome, tipoConta;
    private int cpf;

    public Pessoa(String nome, String tipoConta, int cpf) {
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    
    
}
