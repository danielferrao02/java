package uri;

import java.util.Scanner;

/**
 * Uri1006
 */
public class Uri1006 {

    public static void main(String[] args) {
        //Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. 
        //A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. 
        //Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
        //Entrada: O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).
        //Saida: Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade.
        Scanner teclado = new Scanner(System.in);
        double varA, varB, varC, MEDIA;

        varA = teclado.nextDouble();
        varB = teclado.nextDouble();
        varC = teclado.nextDouble();

        MEDIA = 0.2*varA + 0.3*varB + 0.5*varC;

        System.out.printf("MEDIA = %.1f\n",MEDIA);


        teclado.close();
    }
}