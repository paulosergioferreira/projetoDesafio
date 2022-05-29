package exercicioyoutube;


public class ExercicioYouTube {

  
    public static void main(String[] args) {

        Video v[] = new Video[2];
        Gafanhoto g[] = new Gafanhoto[2];
        Visualizacao v1[] = new Visualizacao[2];
        
        v[0] = new Video("Video Aula Java", 2);
        v[0].like();
        v[0].play();
        
        
        v[1] = new Video("Video Aula PHP", 4);
        g[0] = new Gafanhoto("paulo.sergio", "Paulo", "M", 28, 3);
        g[1] = new Gafanhoto("ana.paula", "Paula", "F", 31, 5);
        g[0].viuMaisUm();
        v1[0] = new Visualizacao(g[0], v[0]);
        
        
        System.out.println(v1[0]);
        
        //System.out.println(g[0].toString());
    }
    
}
