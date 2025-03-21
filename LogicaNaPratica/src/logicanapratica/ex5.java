
package logicanapratica;

import java.util.Scanner;


public class ex5 {
    public void Bhaskara (){
        Scanner scanner = new Scanner (System.in);
        
        int a, b, c, delta, raizDelta=0, impar = 1, x1, x2;
        
        //Pede ao usuario os coeficientes
        System.out.print("Digite o valor de A: ");
        a = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        b = scanner.nextInt();
        System.out.print("Digite o valor de C: ");
        c = scanner.nextInt();
        
        //Calculando o delta 
        delta = (b * b) - (4 * a * c);
        
        //Verifica se a equação tem raízes reais
        if (delta < 0){
            System.out.println("Não possui raízes reais");
            return;
        } 
        
        //Calcula raiz quadrada de delta 
        while (delta >= impar){
            delta -= impar;
            impar += 2;
            raizDelta++;
        }
        
        //Calculando o X
        x1 = (-b + raizDelta) / (2 * a);
        x2 = (-b - raizDelta) / (2 * a);
        
        //Exibe os resultados
        System.out.println("Valores de X: ");
        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);
        
        scanner.close();
    }
}
