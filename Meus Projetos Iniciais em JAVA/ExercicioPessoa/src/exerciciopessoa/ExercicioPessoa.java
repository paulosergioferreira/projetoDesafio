package exerciciopessoa;


public class ExercicioPessoa {

   
    public static void main(String[] args) {
        
        Pessoa p[] = new Pessoa[3];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Paulo Sérgio","Masculino", 28);
        p[1] = new Pessoa("Ingrid", "Feminino", 24);
        p[2] = new Pessoa("Everton", "Masculino", 25);
        p[0].fazerAniversario();
        l[0] = new Livro("Uma Historia de Amor", "Leandro Gomes", p[0]);
        l[1] = new Livro("Ação em Alto Mar", "John Levi", p[1]);
        
        l[0].abrir();
        l[0].folhear(189);
        
        
        System.out.println(l[0].Detalhes());
        
    }
    
}
