package uri;

import java.util.Scanner;

/**
 * Uri1004
 */
public class Uri1004 {
public static void main(String[] args) {
    //Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. 
    //A seguir mostre a variável PROD com mensagem correspondente.   
    //Entrada: O arquivo de entrada contém 2 valores inteiros.
    //Saída: Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, 
    // com um espaço em branco antes e depois da igualdade. Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
    Scanner teclado = new Scanner(System.in);
    int v1, v2, PROD;
    v1 = teclado.nextInt();
    v2 = teclado.nextInt();

    PROD = v1 * v2;

    System.out.println("PROD = "+ PROD);

    teclado.close();
}
    
}