
package logicanapratica;

import java.util.Scanner;

public class ex6 {
    
    
    public void vlrHipotenusa(){
        Scanner scanner = new Scanner(System.in);
        int cateto1, cateto2, quadradoHipotenusa, raiz=0, impar= 1;
        
        //Pede ao usuario, os catetos
        System.out.print("Valor do primeiro cateto: ");
        cateto1 = scanner.nextInt();
        System.out.print("Valor do segundo cateto: ");
        cateto2 = scanner.nextInt();
        
        //Calculador o quadrado da hipotenusa
        quadradoHipotenusa = (cateto1 * cateto2) + (cateto2 * cateto2);
        
        //Calcula a raiz
        while (quadradoHipotenusa >= impar){
            quadradoHipotenusa -= impar;
            impar += 2;
            raiz++;
        }
        //Apenas para o codigo ficar mais compreensivel
        int hipotenusa = raiz;
        
        //Exibe o resultado
        System.out.println("O valor da hipotenusa é: " + hipotenusa);
        
    }
}
