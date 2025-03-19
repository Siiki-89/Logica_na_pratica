
package logicanapratica;

import java.util.Scanner;


public class ex2 {
    public void numImpar (){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Digite 5 números inteiros: ");
        
        for (int i = 0; i < 5; i++) {
            System.out.print(i+1+ ": ");
            numeros[i] = scanner.nextInt();
        }
        System.out.print("Números ímpares: ");
        for (int num : numeros) {
            if (num % 2 !=0){
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }
}
