package atvbanco;


public class Conta implements InterfaceConta{
    
    Pessoa titular;
    String tipoConta;
    float saldo;
    boolean status;

    public Conta(String tipoConta, float saldo, boolean status, Pessoa titular) {
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.status = status;
        this.titular = titular;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    

    @Override
    public void sacar(float v) {

        this.setSaldo(this.getSaldo()-v);
        
    }

    @Override
    public void depositar(float p) {
        
        this.setSaldo(this.getSaldo()+ p);

    }

    @Override
    public void extrato() {
        String a;
        if(this.isStatus()){
            a = "Conta Ativa";
        }else{
            a = "Conta Desativada";
        }
        System.out.println("=====Dados da Conta====="+"\n"+"Saldo:"+this.getSaldo()+"\n"+"Titular da Conta: "+this.getTitular().getNome()
        +"\n"+"Status da Conta: "+a+"\n"+"CPF do Titular: "+this.titular.getCpf());
        
    }

    @Override
    public void situacao() {

    }
    
}
