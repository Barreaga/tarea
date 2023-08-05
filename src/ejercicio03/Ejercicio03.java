
package ejercicio03;

import java.util.Scanner;


public class Ejercicio03 {

    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
		int n1,n2;
		System.out.print("Ingrese el primer numero: ");
		n1=a.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		n2=a.nextInt();
                
          if(n1==n2){
              System.out.println("Son iguales");
          }else if (n1>n2){
              System.out.println(n1+"-"+n2);
          }else {
               System.out.println(n2+"-"+n1);
          }
          }      
                
     
    }
    

