
package ejercicio04;

import java.util.Scanner;


public class Ejercicio04 {

   
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
		int n1,n2,n3;
		System.out.print("Ingrese el primer numero: ");
		n1=a.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		n2=a.nextInt();
                System.out.print("Ingrese el tercer numero: ");
		n3=a.nextInt();
                
          if (n1 > n2) {
            if (n1 > n3) {
                if (n2 > n3) {
                    System.out.println(n1 + " " + n2 + " " + n3);
                } else {
                    System.out.println(n1 + " " + n3 + " " + n2);
                }
            } else {
                System.out.println(n3 + " " + n1 + " " + n2);
 
            }
        } else {
            if (n2 > n3) {
                if (n1 > n3) {
                    System.out.println(n2 + " " + n1 + " " + n3);
                } else {
                    System.out.println(n2 + " " + n3 + " " + n1);
                }
            } else {
                System.out.println(n3 + " " + n2 + " " + n1);
 
            }
        }
 
    }
}