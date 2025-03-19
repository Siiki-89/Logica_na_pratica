
package logicanapratica;

import java.util.Scanner;


public class ex2 {
    public void numImpar (){
        
        Scanner scanner = new Scanner(System.in);
        //Iniciando array
        int[] numeros = new int[5];
        
        //Obtendo 5 números inteiros
        System.out.println("Digite 5 números inteiros: ");
        
        for (int i = 0; i < 5; i++) {
            System.out.print(i+1+ ": ");
            numeros[i] = scanner.nextInt();
        }
        
        //Verificando se os números são impares e retornando-os para o usuario
        System.out.print("Números ímpares: ");
        for (int num : numeros) {
            if (num % 2 !=0){
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }
}
