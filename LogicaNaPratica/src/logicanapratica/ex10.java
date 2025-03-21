package logicanapratica;

import java.util.Arrays;
import java.util.Scanner;

public class ex10 {
    public void obterDados(){
        Scanner scanner = new Scanner (System.in);
        int soma = 0, ePar = 0, eImpar = 0;
        
        
        System.out.println("Quantos números você gostaria de inserir? ");
        int qtdNum = scanner.nextInt();
        
        int[] arrayNum = new int[qtdNum];
        
        //Obter qtd de números que o usuario gostaria de inserir
        System.out.println("Quais: ");
        for (int i = 0; i < qtdNum; i++) {
            arrayNum[i] = scanner.nextInt();
        }
        
        //Ordem crescente
        Arrays.sort(arrayNum);
        //Obter o maior e menor número
        int maior = arrayNum[qtdNum - 1]; // Último elemento após ordenação
        int menor = arrayNum[0];          // Primeiro elemento após ordenação
        
        for (int n :arrayNum){
            soma += n;
            if(n % 2 ==0){
                ePar += n;
            } else 
                eImpar += n;
        }
        //Calcular a media dos números
        double media = soma / qtdNum;

        // Exibe os resultados
        System.out.println("Números em ordem crescente: " + Arrays.toString(arrayNum));

        // Ordem decrescente
        System.out.print("Números em ordem decrescente: [");
        for (int i = qtdNum - 1; i >= 0; i--) {
            System.out.print(arrayNum[i] + (i > 0 ? ", " : ""));
        }
        System.out.println("]");
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);
        System.out.println("Soma dos números pares: " + ePar);
        System.out.println("Soma dos números ímpares: " + eImpar);

        scanner.close();
    }
}

