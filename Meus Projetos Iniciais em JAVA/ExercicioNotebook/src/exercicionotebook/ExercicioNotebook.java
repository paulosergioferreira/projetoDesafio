package exercicionotebook;


public class ExercicioNotebook {

    
    public static void main(String[] args) {
        Notebook n = new Notebook("Lenovo","500GB",18);
        //Notebook notebook = new Notebook();
        
        //notebook.desligado();
       /* notebook.setLigado(true);
        notebook.assistindo();
        notebook.setAutonomia("24 hrs");
        notebook.setModelo("Notebook slim");
        notebook.setMemoria("500GB e 4GB");
        notebook.setMarca("ACER");
        notebook.setCor("Preto");
        notebook.setConfiguracao("SSD 240GB, HD 500GB, Processador i5");
        notebook.setAutonomia("24 HRS");
        notebook.setTamanho(16);
        */
        n.status();
    }
    
}
