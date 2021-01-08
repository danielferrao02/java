package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        //1kwatt é 1/500 avos do salario minimo
       
        Scanner entrada = new Scanner(System.in);
         //faça um programa que receba o valor de salario minimo        
         System.out.println("Qual o valor do salario mínimo? ");
         double salmin = entrada.nextDouble();
        //Receba a quantidade de kWatts consumida por uma residencia
         System.out.println("Qual quantidade de Kwatts consumidas? ");
         double kwatt = entrada.nextDouble();
        
         //System.out.printf(FORMATO, Valor1, Valor2,...)
        // %f - numero com decimal, arredondando
        // %d - numero inteiro
        // %s - string
        // %.xf - x = numero de casas decimais
        
       // Então exiba:
        // o valor em reais de cada Kwatt
        double valor1 = salmin/500;
        System.out.printf(" O valor, em reais, de cada kWatt é %.2f\n", valor1); //printf utiliza valores flutuantes
        // O valor a ser pago por essa residencia
        double valor2 = valor1 * kwatt;
        System.out.printf("O valor a ser pago por essa residencia é %.2f\n", valor2);
        // o valor a ser pago com desconto de 15%
        System.out.printf("O valor a ser pago com 15%% de desconto é %.2f\n", valor2*0.85);
        entrada.close();
    }
}
