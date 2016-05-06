/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;
import java.util.Scanner;
/**
 *
 * @author devilwall
 */
public class TablaMultiplicar {
    
       public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
        int Numero = 0;
        
        System.out.print("Ingresa un Numero para la tabla: ");
        Numero = leer.nextInt();
        
            for(int i=1; i<=10; i++)
                {
                      System.out.println(i + " x " + Numero + " = " + Numero*i);
  
                }
        
    }
}
    

