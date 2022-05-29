package atvbanco;


public class AtvBanco {

    
    public static void main(String[] args) {
        
      Pessoa p[] = new Pessoa[3];
      Conta c[] = new Conta[3];
        
      p[0] = new Pessoa("Paulo", "CC", 2222);
      c[0] = new Conta("CC", 50f, true, p[0]);
      c[0].depositar(18);
      c[0].sacar(60);
      c[0].extrato();
      
      
    }
    
}
