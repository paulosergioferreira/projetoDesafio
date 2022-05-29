package testeheranca;


public class Aluno extends Pessoa{
    
    private boolean matricula;
    private String curso;

    public boolean getMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
    public void cancelarMatricula(){
        
        this.setMatricula(false);
        System.out.println("Matricula Cancelada");
        
    }
    //Sobreponto Metodo
    @Override
    public final void  fazerAniversario(){
        
        this.setIdade(this.getIdade()+1);
        
    }
    
}
