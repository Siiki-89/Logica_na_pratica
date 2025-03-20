package logicanapratica;

import java.util.Scanner;


public class ex4 {
    public void numMMC (){
        Scanner scanner = new Scanner(System.in);

            //Pede ao usuario 2 números
            System.out.print("Digite o primeiro número decimal: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número decimal: ");
            double num2 = scanner.nextDouble();

            //Calcula o MMC
            double mmc = calcularMMC(num1, num2);

            //Exibe o resultado
            System.out.println("O menor múltiplo comum é: " + mmc);
            
            scanner.close();
        }
    
    

    private double calcularMMC(double a, double b) {
        //Define o maior número
        double maior = (a > b) ? a : b;

        //Para encontrar o menor múltiplo comum
        while (true) {
            if (maior % a == 0 && maior % b == 0) { // Verifica se é múltiplo dos dois
                
                return maior;
            }
            maior++;
        }
    }
}

