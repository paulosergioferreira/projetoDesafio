package exercicioheranca;


public class Visitante extends Pessoa{
    
     public void status(){
         
         System.out.println("===Visitante==="+"\n"+"Nome: "+this.getNome()+"\n"+"Idade: "+this.getIdade()+"\n"+"Sexo: "+this.getSexo());
         
     }
    
}
