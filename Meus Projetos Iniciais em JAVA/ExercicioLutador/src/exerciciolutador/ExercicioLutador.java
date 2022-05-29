package exerciciolutador;

public class ExercicioLutador {

    public static void main(String[] args) {
        
        Lutador lutador[] = new Lutador[6];
        
        
        
        lutador[0] = new Lutador("Pretty Boy","França", 31, 11, 2, 1, 1.75f, 68.9f);
        lutador[1] = new Lutador("Putscript","Brasil", 29, 14, 2, 3, 1.68f, 57.8f);
        lutador[2] = new Lutador("Snapshadow","EUA", 35, 12, 2, 1, 1.65f, 80.9f);
        lutador[3] = new Lutador("Dead Code","Austrália", 28, 13, 0, 2, 1.93f, 81.6f); 
        lutador[4] = new Lutador("Ufocobol","Brasil", 37, 5, 4, 3, 1.70f, 119.3f);
        lutador[5] = new Lutador("Nerdaard","EUA", 30, 12, 2, 4, 1.81f, 105.7f);
        
        lutador[4].ganharLuta();
        lutador[4].empatarLuta();
        lutador[4].apresentar();    
        
        
        
        
    }
    
}
