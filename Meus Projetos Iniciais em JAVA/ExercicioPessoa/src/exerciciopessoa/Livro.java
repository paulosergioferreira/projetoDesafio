package exerciciopessoa;
//Classe Livro que implementa nela mesma a Interface Publicação 
public class Livro implements Publicacao{
    //Atributos da classe Livro
    String titulo, autor;
    //Atributo do tipo Pessoa(Implantando a agregação)
    Pessoa leitor;
    int totPaginas;
    int pagAtual;
    boolean aberto;
    //Construtor de Livro
    public Livro(String titulo, String autor, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.leitor = leitor;
        this.totPaginas = 100;
        this.pagAtual = 0;
        this.aberto = false;
    }
    //Metodos especiais de Livro
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    
    public String Detalhes() {
        return "Livro:"+"\n"+ "titulo: " + titulo +"\n"+", autor: " + autor +"\n"+", leitor: " + this.getLeitor().getNome() +"\n"+ 
                ", totPaginas: " + totPaginas +"\n"+", pagAtual: " + pagAtual + "\n"+", aberto: " + aberto + "\n" +", Idade: "+this.leitor.getIdade() ;
    }
    
    

    @Override
    public void abrir() {
        
        this.setAberto(true);

    }

    @Override
    public void fechar() {
        
        this.setAberto(false);

    }

    @Override
    public void folhear(int f) {
        if(f<=this.totPaginas){
        this.setPagAtual(f);
        }else{
            this.setPagAtual(0);
            //this.folhear(0);
            System.out.println("Indice Invalido");
        }
    }

    @Override
    public void avancarPag() {

        this.setPagAtual(this.getPagAtual()+1);
        
    }

    @Override
    public void voltarPag() {

        this.setPagAtual(this.getPagAtual()-1);
        
    }
    
    
    
}
