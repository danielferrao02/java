package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
    // A prefeitura de RJ abriu uma linha de crédito p/ funcionarios. Entretanto, o valor máx da prestacao não pode ser maior que 30% do salario
    // Faça um programa que leia o salário bruto e o valor da prestação e informe se o emprestimo pode ou não ser aprovado
    
    Scanner teclado = new Scanner(System.in);
    double salario, prestacao;
    System.out.println("Informe o Salario Bruto (R$):");// leitura de dados de entrada
    salario = teclado.nextDouble();
    System.out.println("Informe o valor da prestação (R$):");// leitura de dados de entrada
    prestacao = teclado.nextDouble();

    if(prestacao > 0.3*salario){// condicional para exibição do resultado
        System.out.println("Empréstimo reprovado");
    } else{
        System.out.println("Empréstimo aprovado");
    }

    teclado.close();
    }
}
