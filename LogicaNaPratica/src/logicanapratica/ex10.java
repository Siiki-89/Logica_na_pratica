package logicanapratica;

import java.util.Scanner;

public class ex10 {
    public void obterDados(){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Quantos números você gostaria de inserir?");
        int qtdNum = scanner.nextInt();
        
        int[] arrayNum = new int[qtdNum];
        
        System.out.print("Quais: ");
        for (int i = 0; i < qtdNum; i++) {
            int temp = scanner.nextInt();
            arrayNum[i] += temp;
            System.out.println(arrayNum[i]);
        }
    }
}
