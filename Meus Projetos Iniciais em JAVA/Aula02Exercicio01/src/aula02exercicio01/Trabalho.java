package aula02exercicio01;


public class Trabalho {

    int hora_entrada = 0, hora_saida = 0;
    String cargo, setor, andar;
    
    void baterPontoEntrada(){
        
        this.hora_entrada = 8;
        
    }
    
    void baterPontoSaida(){
        
        this.hora_saida = 17;
        
    }
    
    void ligarComputador(){
        
        if(this.hora_entrada != 0){
            
            System.out.println("Computador Ligado");
            
        }else{
            
            System.out.println("Erro ao ligar Computador, o Funcionario não esta presente na Empresa");
        }
        
    }
    
    void trabalhando(){
        
        if(this.hora_entrada != 0){
            
            System.out.println("Ponto Batido, Trabalhador iniciou sua jornada de Trabalho");
            
        }else{
            
            System.out.println("Erro, o Funcionario não esta trabalhando");
        }
        
    }
    
    void largando(){
        
        baterPontoSaida();
        System.out.println("Funcionario esta Largando! Ponto de Saída Batido");
        
    }
    
    void status(){
        
        System.out.println("Dados do Trabalhador"+"\n"+"Cargo: "+this.cargo+"\n"+"Setor: "+this.setor+"\n"+"Andar: "+this.andar
        +"\n"+"Hora da Entrada: "+this.hora_entrada+"\n"+"Hora da Saída: "+this.hora_saida);
        
    }
    
    
}
