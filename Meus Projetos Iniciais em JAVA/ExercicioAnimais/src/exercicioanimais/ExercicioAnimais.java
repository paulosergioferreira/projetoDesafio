package exercicioanimais;


public class ExercicioAnimais {

    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Reptiu r = new Reptiu();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Tartaruga t = new Tartaruga();
        Cachorro k = new Cachorro();
        
        m.setCorPelo("Branca");
        m.setIdade(4);
        m.setMembros(4);
        m.setPeso(20);
        //System.out.println(m.statusMamifero());
        //m.locomover();
        
        r.setCorEscama("Verde");
        r.setIdade(2);
        r.setMembros(4);
        r.setPeso(5);
        //r.locomover();
        
        p.setCorEscama("Branco");
        p.setIdade(5);
        p.setMembros(0);
        p.setPeso(2);
        
        /*p.alimentar();
        p.emitirSom();
        p.locomover();*/
        
        a.setCorPena("Cinza");
        a.setIdade(4);
        a.setMembros(2);
        a.setPeso(3);
        /*
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        a.locomover();*/
        
       
        /*
        c.usarBolsa();
        c.locomover();
        
        t.alimentar();
        t.emitirSom();
        t.locomover();
        */
        
        //k.reagir("agressiva");
        //k.reagir(23);
        //k.reagir(false);
        //k.reagir(9, 20);
    }
    
}
