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
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int Numero = 0;
        int Factorial = 1;
        
        System.out.print("Ingresa un Numero Entero para factorial: ");
        Numero = leer.nextInt();
        
        if (Numero > 1)
        {
            for(int i=2; i<=Numero; i++)
                {
                    Factorial = i * Factorial;
                }
        }
        System.out.println("El factorial de " + Numero + " es: " + Factorial);

        //Tabla multiplicar    
        
        
        Numero = 0;
        
        System.out.print("Ingresa un Numero para la tabla: ");
        Numero = leer.nextInt();
        
            for(int i=1; i<=10; i++)
                {
                      System.out.println(i + " x " + Numero + " = " + Numero*i);
  
                }
        //   Valor absoluto 
        Numero = 0;
        
        System.out.print("Ingresa un Numero : ");
        Numero = leer.nextInt();
        if (Numero <=0)
        {
         Numero=Numero*-1;   
        }
            
            System.out.println("El Numero en positivo es: " + Numero);
        // Mayor a menor
        Numero = 0;
        
        System.out.print("Ingresa primer Numero : ");
        int Numero1 = leer.nextInt();
        System.out.print("Ingresa segundo Numero : ");
        int Numero2 = leer.nextInt();
        System.out.print("Ingresa tercer Numero : ");
        int Numero3 = leer.nextInt();
        int Temp = 0;
           for( int j=1; j<=2; j++)       
           {
               if (Numero1<=Numero2)
               {
                   Temp=Numero1;
                   Numero1=Numero2;
                   Numero2=Temp;
               }
               if (Numero2<=Numero3)
               {
                   Temp=Numero2;
                   Numero2=Numero3;
                   Numero3=Temp;
               }
              
           }
                   System.out.println("Los numeros ordenados son: " + Numero1 + 
                           " " + Numero2 + " " + Numero3);
        
        
        
        //Par inpar o 0
        Numero = 0;
        
        System.out.print("Ingresa un Numero : ");
        Numero = leer.nextInt();
        if (Numero == 0)
        {
           System.out.println("El Numero es: 0");
        }
        else if( Numero%2==0)
            System.out.println("El Numero es: Par");
        else
        {
            System.out.println("El Numero es: Inpar");
        }
    }
}
        
