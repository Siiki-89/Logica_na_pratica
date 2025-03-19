
package logicanapratica;

import java.util.Scanner;

public class ex1 {
    public void divisaoMaior(){
        
    Scanner scanner = new Scanner(System.in);
    //Declaração das variáveis
    double maior = 0, menor = 0, resultado;
    //Solicita os números ao usuario
    System.out.print("Digite o primeiro número decimal: ");
    double num1 = scanner.nextDouble();

    System.out.print("Digite o segundo número decimal: ");
    double num2 = scanner.nextDouble();
    //Verifica qual numero é maior
    if (num1 > num2) {
        maior = num1;
        menor = num2;
    } else {
        maior = num2;
        menor = num1;
    }
    //Calcula a divisão
    resultado = maior / menor;
    //Exibe o resultado
    System.out.println("O resultado da divisão do maior pelo menor é: " + resultado);
    
    scanner.close();
    }
    
}
