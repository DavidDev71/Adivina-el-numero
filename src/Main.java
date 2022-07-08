
import Service.Servicio;
import java.util.Scanner;



public class Main {

  
    public static void main(String[] args) {
        
        Servicio serv= new Servicio();
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Bienvenido, jugaremos a adivinar el numero");
        
        System.out.println("---------------------");
        serv.generarNumero();
        System.out.println("--------------------");
        
        
        System.out.println("Numero generado");
        
        System.out.println("--------------------");
        
        serv.juego();
        
    }
    
   
    
    
}
