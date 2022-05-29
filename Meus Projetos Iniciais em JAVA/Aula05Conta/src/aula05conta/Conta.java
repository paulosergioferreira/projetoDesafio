package aula05conta;

public class Conta {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public Conta(boolean status, double saldo) {
        
        this.setStatus(status);
        this.setSaldo(saldo);
        
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t.equals("Cc")){
            this.setSaldo(50);
        }else{
            if(t.equals("Cp")){
                this.setSaldo(150);
            }
        }
        
    }
    
    public void fecharConta(){
        
        if(this.getSaldo()<=0){
            System.out.println("Conta Fechada com Sucesso");
        }else{
            System.out.println("Impossivel Fechar conta");
        }
        
    }
    
    public void depositar(double valor){
        if(this.isStatus()==true){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito Realizado com Sucesso");
        }else{
            System.out.println("Impossivel Realizar o Deposito, conta Fechada");
        }
        
    }
    
    public void sacar(double saque){
        if(this.isStatus()==true && this.getSaldo()>=saque){
                this.setSaldo(this.getSaldo()-saque);
                System.out.println("Saque Realizado com Sucesso");
        }else{
            System.out.println("Impossivel Sacar");
        }
        
    }
    
    public void pagarMensal(){
        
        if(this.getTipo().equals("Cc")){
            this.setSaldo(this.getSaldo()-12);
            System.out.println("Valor Mensal da Conta Corrente Debitado");
        }else{
            if(this.getTipo().equals("Cp")){
                this.setSaldo(this.getSaldo()-20);
                System.out.println("Valor Mensal da Conta Poupança Debitado");
            }
        }
        
    }
    
    public void situacaoConta(){
        
        System.out.println("Conta"+"\n"+"N° da Conta: "+this.getNumConta()+"\n"+"Tipo da Conta: "+this.getTipo()
        +"\n"+"Dono da Conta: "+this.getDono()+"\n"+"Saldo: "+this.getSaldo()+"\n"+"Status: "+this.isStatus());
    
    }
}
