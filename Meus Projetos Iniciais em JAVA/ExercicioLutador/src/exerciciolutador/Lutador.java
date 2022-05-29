package exerciciolutador;


public class Lutador implements InterfaceLutador{
    
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura;
    private float peso;

    public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, float altura, float peso) {
        
        this.nome = nome;
        this.nacionalidade = nacionalidade;  
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.setPeso(peso);
    
    }  
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    
    
    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
       
        if(this.getPeso()<=70){
            this.categoria = "Peso Leve";
        }else if(this.getPeso()>70 && this.getPeso()<=100){
            this.categoria = "Peso Medio";
        }else if(this.getPeso() > 100 && this.getPeso()<120){
            this.categoria = "Peso Pesado";
        }
        
    }

    
    
    
    
    
    
    
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //60 a 79 leve
    //80 a 100 medio
    //101 pra cima pesado
    
    

    @Override
    public void apresentar() {
        
        System.out.println("E agora com vocês o lutador "+this.getNome()+"\n"+"\n"+"O lutador vem da "+this.getNacionalidade()
        +"\n"+"Sua Categoria é a Peso "+this.getCategoria()+"\n"+"O lutador tem "+this.getIdade()+" anos de Idade"+"\n"+"O mesmo tem "+
        this.getVitorias()+" Vitorias, "+this.getDerrotas()+" Derrotas e "+this.getEmpates()+" Empates"+"\n"+"Tem de Altura "
        +this.getAltura()+"\n"+"E o seu Peso é de "+this.getPeso());

    }

    @Override
    public void status() {
        
        System.out.println("\n"+"Status do Lutador"+"\n"+"\n"+"Nome: "+this.getNome()+"\n"+"Numero de Vitorias: "+this.getVitorias()
        +"\n"+"Numero de Derrotas: "+this.getDerrotas()+"\n"+"Numero de Empates: "+this.getEmpates()+"\n"+this.getCategoria());

    }

    @Override
    public void ganharLuta() {
        
        this.setVitorias(this.getVitorias()+1);
        
    }

    @Override
    public void perderLuta() {

        this.setDerrotas(this.getDerrotas()+1);
        
    }

    @Override
    public void empatarLuta() {

        this.setEmpates(this.getEmpates()+1);
        
    }
    
    
}
