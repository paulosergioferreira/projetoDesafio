package exercicioheranca;


public class Aluno extends Pessoa implements InterfaceAluno{
    
    private int mensalidade;
    private boolean matriculado;

    public int getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(int mensalidade) {
        this.mensalidade = mensalidade;
    }

    public boolean getMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    @Override
    public void matricular() {

        if(this.getMatriculado()){
            System.out.println("Aluno Já Matriculado");
        }else{
            this.setMatriculado(true);
            System.out.println("Aluno Matriculado com Sucesso");
        }

    }

    
    public String Relatorio() {
        return "=====Aluno=====" + "\n" + "Nome: "+this.getNome()+""+"Idade: "+this.getIdade()+"\n" + "Sexo: "+this.getSexo()
               +"\n" + "Mensalidade: "+this.getMensalidade();
    }
    
    
    public void mensalidade(){
        
        
    }
    
    
    
}
