
package logicanapratica;

import java.util.Scanner;


public class ex7 {
    public void numFatorial(){
        Scanner scanner = new Scanner (System.in);
        
        //Pede ao usuario um número
        System.out.println("Digite um número decimal: ");
        double num = scanner.nextDouble();

        double  fatorial = 1;
        //Calcula o fatorial
        for (int i = 1; i <= num; i++) {
            
            fatorial *= i;   
            
        }
        //Exibe o resultado
        System.out.println("O fatorial de " + num + " é: " + fatorial);
        scanner.close();
    }
}
