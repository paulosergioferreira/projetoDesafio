package exercicioheranca;


public class Bolsista extends Aluno{
    
    Bolsista(int m){
        
        this.setMensalidade(m);
        
    }

    @Override
    public void mensalidade() {
        

    }
    
    public void statusBolsista(){
        
        System.out.println("Nome: "+getNome()+"\n"+"Valor da Mensalidade: "+this.getMensalidade());
        
    }
    
    
    
}
