package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero, par, soma;
        soma =0;
        par = 0;
        final double QTD_NUMERO = 10; // final cria CONSTANTE

        for (int cont = 1; cont <= QTD_NUMERO; cont++) { // utilizando a variavel local cont
            System.out.printf("Digite o " + cont + "º numero: ");
            numero = entrada.nextDouble();
            if (numero % 2 == 0) { // verifica se o numero é par
                soma = soma + numero;
                par++;
            }

        }
        if(par > 0){
            System.out.printf("1- Média de valores pares = %.2f\n", soma/par);            
        } System.out.printf("Não há numeros pares\n", soma/par);
        
        System.out.printf("2- Porcentagem de números impares= %.2f %%\n", ((QTD_NUMERO - par)*10));
        entrada.close();
    }

}

