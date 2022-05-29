package exercicioluta;

public class Lutador implements InterfaceLutador{
    
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    
    public Lutador(String no, String na, int id, int vi, int de, int em, float alt, float pe){
        
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        this.altura = alt;
        this.setPeso(pe);
        
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        this.categoria = categoria;
        if(this.getPeso()<=70f){
            this.categoria = "Leve";
        }else if(this.getPeso()>70f && this.getPeso()<=100f){
            this.categoria = "Medio";
        }else if(this.getPeso()<=130){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Peso Invalido";
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

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    @Override
    public void apresentar() {
        
        System.out.println("E agora com Vocês o Lutador "+this.getNome()+"\n"+"Nacionalidade: "+this.getNacionalidade()+"\n"
        +"Idade do Lutador: "+this.getIdade()+"\n"+"O Lutador pesa "+this.getPeso()+"Kg"+"\n"+"Tem "+this.getAltura()+" de altura"+"\n"
        +"Categoria: "+this.getCategoria()+"\n"+"Numero de Vitorias: "+this.getVitorias()+"\n"+"Numero de Derrotas: "+this.getDerrotas()+"\n"
        +"Numero de Empates: "+this.getEmpates());

    }
    
    @Override
    public void status() {
        System.out.println("Informações do Lutador"+"\n"+"Nome: "+this.getNome()+"\n"+"Categoria: "+this.getCategoria()
        +"\n"+"Vitorias: "+this.getVitorias()+"\n"+"Derrotas: "+this.getDerrotas()+"\n"+"Empates: "+this.getEmpates());

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
