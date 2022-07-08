/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import entidades.Atributos;
import java.util.Scanner;

/**
 *
 * @author Noelia Dominguez
 */
public class Servicio {
    
    Atributos a = new Atributos();
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    
    public void generarNumero() {
        
        System.out.println("Generando numero aleatorio...");
        
        
      a.setNumAleatorio((int)(Math.random()*100+1));
      
      
    }
  
    
    
    public void juego() {
         String resp;
         int cont=0;
         int n=0;
        do {
            
         try {
             
            System.out.println("Ingrese un valor de referencia  para indicarle si el numero a adivinar debe ser mayor o menor al que ingresó");
           n= leer.nextInt(); 
             
         
        
        
      if (n < a.getNumAleatorio())  {
          
          System.out.println("Usted debe ingresar un valor mayor al ingresado anteriormente: ");
          a.setValor(leer.nextInt());
          
      } else {
          
          System.out.println("Usted debe ingresar un valor menor al ingresado anteriormente: ");
          a.setValor(leer.nextInt());
         
      }
         
       } catch (Exception e) {
             
             System.out.println("El valor ingresado no es un numero"); 
         }
       
          
          if (a.getValor() == a.getNumAleatorio()) {
              
              System.out.println("Usted adivinó el número!");
              
              resp = "N";
          } else {
              
              cont = cont+1;
              
              System.out.println("El numero ingresado no es el correcto, desea volver a intentar? S/N");
              resp = leer.next();
          } 
          
      } while (resp.equalsIgnoreCase("S"));
      
        
        
        if (resp.equalsIgnoreCase("N")) {
            
             System.out.println("El número era el "+a.getNumAleatorio()+" y usted realizó "+cont+" intentos");
            
        } else {
            
            System.out.println("Usted realizó "+cont+" intentos antes de ganar");
        }
       
        
    }
    
    
    
    
    
    
}
