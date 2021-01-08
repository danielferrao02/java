package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, par;
        par = 0;
        final int QTD_NUMERO = 10; // final cria CONSTANTE

        for (int cont = 1; cont <= QTD_NUMERO; cont++) { // utilizando a variavel local cont
            System.out.printf("Digite o " + cont + "º numero: ");
            numero = entrada.nextInt();
            if (numero % 2 == 0) { // verifica se o numero é par
                par++;
            }

        }
        System.out.printf("Total de pares= %d\n", par);
        System.out.printf("Total de impares= %d\n", QTD_NUMERO - par);
        entrada.close();
    }
}
