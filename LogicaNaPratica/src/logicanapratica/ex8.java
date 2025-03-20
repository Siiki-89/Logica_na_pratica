
package logicanapratica;

import java.util.Scanner;

public class ex8 {
    public void numTabuada(){
        Scanner scanner = new Scanner(System.in);
        
        //Pede ao usuario um número
        System.out.print("Digite um número: ");
        double num = scanner.nextDouble();
        
        System.out.println("A tabuada de " + num + " é:");
        //Retorna a tabuada
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + ": " + num * i);
        }
        scanner.close();
    }
}
