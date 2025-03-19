
package logicanapratica;

import java.util.Scanner;

public class ex3 {
    public void subtracao (){
        Scanner scanner = new Scanner(System.in);

        // Solicita dois números ao usuário
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Calcula a subtração e garante que o resultado seja positivo
        double resultado = num1 - num2;
        if (resultado < 0) {
            resultado = -resultado; // Transforma o valor negativo em positivo
        }

        // Exibe o resultado
        System.out.println("O valor absoluto da subtração é: " + resultado);

        scanner.close(); // Fecha o Scanner
    }
    
}
