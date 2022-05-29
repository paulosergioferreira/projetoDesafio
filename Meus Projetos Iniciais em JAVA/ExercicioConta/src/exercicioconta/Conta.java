package exercicioconta;


public class Conta {

    public int numConta;
    public String tipo;
    private String Dono;
    private double saldo;
    private boolean status;
    
    public void estadoAtual(){
        
        System.out.println("Saldo: "+this.getSaldo()+"\n"+"Status: "+this.getStatus()+"\n"+"Tipo:"+this.getTipo()+"\n"+"Dono :"+
                this.getDono()+"\n"+"Numero Conta: "+this.getNumConta());
        
    }

    public Conta(double saldo, boolean status) {
        this.saldo = saldo;
        this.status = status;
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
        if(tipo.equals("Cc") || tipo.equals("Cp")){
        this.tipo = tipo;
        }else{
            System.out.println("Tipo de Conta Invalida");
        }
        
    }

    public String getDono() {
        return Dono;
    }

    public void setDono(String Dono) {
        this.Dono = Dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String ac){
        this.setTipo(ac);
        this.status = true;
        
        if(ac.equals("Cc")){
            this.saldo = 50.00;
            System.out.println("Conta Corrente Aberta");
        }else{
            if(ac.equals("Cp")){
                this.saldo = 150.00;
                System.out.println("Conta Poupança Aberta");
            }
        }
        
    }
    
    public void fecharConta(){
        if(this.saldo == 0 || this.saldo < 0){
            this.status = false;
            System.out.println("Conta Fechada");
        }else{
            System.out.println("Impossivel Fechar Conta");
        }
        
    }
    
    public void depositar(double dep){
        
        if(this.status == true){
            this.saldo = this.saldo + dep;
            System.out.println("A conta esta aberta, Deposito Realizado");
        }else{
            System.out.println("Conta Fechada , impossivel Depositar");
        }
        
    }
    
    public void sacar(double sac){
        if(this.status == true && this.saldo > sac){
            this.saldo = this.saldo - sac;
            System.out.println("Saque Realizado");
        }else{
            System.out.println("Impossivel Sacar");
        }
        
    }
    
    public void pagarMensal(){
        
        if(this.tipo.equals("Cc")){
            this.saldo = this.saldo - 12;
        }else{
            if(this.tipo.equals("Cp")){
                this.saldo = this.saldo - 20;
            }
        }
        
    }
    
    
    
}
