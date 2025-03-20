package logicanapratica;

import java.util.Scanner;

public class ex9 {
    
    public void analisarTxt(){
        
        //Iniciando variaveis
        Scanner scanner = new Scanner(System.in);
        int qtdVogal = 0, qtdConsoante = 0, qtdLetras = 0, qtdPalavras=0;
        
        
        //Pede ao usuario uma frase
        System.out.println("Escreva uma frase: ");
        String txt = scanner.nextLine();

        //Transformar em letras minusculas
        txt.toLowerCase();
        
        //Conta o que for vogal, o que não for é consoante
        for(int i = 0; i < txt.length(); i++){
            char c = txt.charAt(i);
            if (Character.isLetter(c)) { // Verifica se é uma letra
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    //Verifica se é vogal 
                    qtdVogal++;     
                } else {
                    //Se não, consoante
                    qtdConsoante++;
                }
            }
            
        }
        //Conta as palavras considerando o espaço como separador
        String [] frase = txt.split(" ");
        
        //Exibe os resultados
        System.out.println("Vogal: " + qtdVogal);
        System.out.println("Consoantes: " + qtdConsoante);
        System.out.println("Letras: " + (qtdVogal + qtdConsoante));
        System.out.println("Palavras: " + frase.length);

    }
}
