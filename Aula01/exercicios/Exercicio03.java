package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //Faça um programa que leia o salario de um funcionario
        //sabendo que o salario teve aumento de 25%, calcule e mostre o novo salario
        
        //entrada: salario do funcionario
        System.out.println("Valor do salario (R$) ");

        //declarar o scanner e uma variavel
        Scanner entrada = new Scanner(System.in);
        double salario1, salario2;

        //usar o scanner para ler o salario
        salario1 = entrada.nextDouble();

        //processamento: calcular o salario x 1,25
        salario2 = salario1 * (1.25);

         //saida: exibir novo salario
         System.err.println("O novo salario é "+ salario2); 
                
              

        entrada.close();
    }
}
