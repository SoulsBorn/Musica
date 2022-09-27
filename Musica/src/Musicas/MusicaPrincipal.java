package Musicas;
import java.util.Scanner;
import Historia.Musica;
public abstract class MusicaPrincipal {

   protected int bachata;
   protected double regeton;
   protected String Historia;  
   
   Scanner sc = new Scanner(System.in);
    public MusicaPrincipal(){
  
    }
    public void Musica (int bachata){
        
        System.out.println("Escoje la historia que quieres conocer");
        bachata= sc.nextInt(); 
        System.out.println("bachata");
    }
      public void Musica (double regeton ){  
       regeton = sc.nextInt(); 
        System.out.println("Regeton");
    }
    
   
    public abstract void SuHistoria();
    
    public void MostrarResultados(){
    
        System.out.println(Historia);
       }   
    }
   
   
   
   
   
    
    
    

