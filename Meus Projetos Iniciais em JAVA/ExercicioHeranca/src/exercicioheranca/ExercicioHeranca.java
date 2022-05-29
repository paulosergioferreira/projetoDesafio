package exercicioheranca;

public class ExercicioHeranca {

   
    public static void main(String[] args) {

        Visitante v[] = new Visitante[2];
        
        v[0] = new Visitante();
        
        Aluno a[] = new Aluno[3];
        
        a[0] = new Aluno();
        
        Bolsista b[] = new Bolsista[2];
        b[0] = new Bolsista(200);
        
        a[0].setNome("Paulo");
        a[0].setSexo("M");
        a[0].setMatriculado(false);
        a[0].setIdade(28);
        
        v[0].setIdade(22);
        v[0].setNome("Alexandre");
        v[0].setSexo("Masculino");
        
       
        
        v[0].status();
        
        System.out.println(a[0].Relatorio());
    }
    
}
