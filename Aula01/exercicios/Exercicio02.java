package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        //escreva um programa que leia duas notas de um aluno, calcule e mostre a média aritmética do aluno
        System.out.println("Quais as notas dos alunos?");

        //declarar um scanner e duas variaveis
        Scanner entrada = new Scanner(System.in);       
        double aluno1, aluno2;

        //usar o scanner para ler as notas
        aluno1 = entrada.nextDouble(); 
        aluno2 = entrada.nextDouble(); 

        //processamento: calcula a média das duas notas
        double media = (aluno1 + aluno2)/2; 

        //saida: exibir a media
        System.err.println("A média aritmetica é "+ media); 

        
        entrada.close();
        
    }
}
