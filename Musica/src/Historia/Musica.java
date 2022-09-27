package Historia;
import Musicas.Bachata;
import Musicas.Regeton;
public class Musica {

    public static void main(String[] args) {
        
      Bachata bachata= new Bachata();
        bachata.Musica();
        bachata.Bachata();
        System.out.println("la historia de la bachata es ");
        bachata.MostrarResultados();
        
        Regeton regeton = new Regeton();
        regeton.Musica();
        regeton.Regeton();
        System.out.println("la historia de el regeton");
        regeton.MostrarResultados();
        
        
    }
    
}
