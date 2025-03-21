package logicanapratica;

import java.util.Scanner;


public class LogicaNaPratica {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a atividade (1 a 10): ");
        int opcao = scanner.nextInt();

        // Switch case para chamar a classe correspondente
        switch (opcao) {
            case 1:
                new ex1().divisaoMaior();
                break;
            case 2:
                new ex2().numImpar();
                break;
            case 3:
                new ex3().subtracao();
                break;
            case 4:
                new ex4().numMMC();
                break;
            case 5:
                new ex5().Bhaskara();
                break;
            case 6:
                new ex6().vlrHipotenusa();
                break;
            case 7:
                new ex7().numFatorial();
                break;
            case 8:
                new ex8().numTabuada();
                break;
            case 9:
                new ex9().analisarTxt();
                break;
            case 10:
                new ex10().obterDados();
                break;
            default:
                System.out.println("Apenas entre 1 a 10.");
        }
        
        scanner.close();
        
    }
    
}
