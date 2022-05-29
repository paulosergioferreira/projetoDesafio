package exercicioluta;

import java.util.Random;


public class Luta implements InterfaceLuta{
    
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    @Override
    public void marcarLuta(Lutador l1, Lutador l2) {

        if(l1.getCategoria().equals(l2.getCategoria())){
            if(l1.getNome()!=l2.getNome()){
                this.setAprovada(true);
                this.setDesafiado(l1);
                this.setDesafiante(l2);
                System.out.println("Luta Marcada");
                
            }else{
                
                this.setAprovada(false);
                this.setDesafiado(null); 
                this.setDesafiante(null);
            
            }
        }
        
        
    }

    @Override
    public void lutar() {
        
        if(this.getAprovada()){
            System.out.println("=======APRESENTAÇÃO=======");
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            System.out.println("\n"+"=======RESULTADO=======");
            
            Random random = new Random();
            int numero_r = random.nextInt(3);
            
            System.out.println("Sorteado: "+numero_r);
            switch(numero_r){
                
                case 0:
                    System.out.println("Luta Empatada !!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                break;
                
                case 1:
                    System.out.println("Luta Ganha por "+this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                break;
                
                case 2:
                    System.out.println("Luat Ganha por "+this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                break;
                
            }
            
        }else{
            
            System.out.println("Luta não Realizada !!!");
            
        }

    }
    
    
}
