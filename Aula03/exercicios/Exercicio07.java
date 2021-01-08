package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int turma, aluno;
        double mediaAluno, mediaTurma, soma, soma2, mediaGeral;
        
        soma2 = 0;
        mediaTurma = 0;
        mediaGeral = 0;
        final int QTD_ALUNO = 3;
        final int QTD_TURMA = 5;

        for (turma = 1; turma <= QTD_TURMA; turma++) {
            soma = 0;
            for (aluno = 1; aluno <= QTD_ALUNO; aluno++) {
                mediaAluno = entrada.nextDouble();
                soma = soma + mediaAluno;
            }
            mediaTurma = soma / QTD_ALUNO;
            System.out.printf("Média da turma %d = %.2f\n", turma, mediaTurma);
            soma2 = soma2 + mediaTurma;
            
        }
        mediaGeral = soma2 / QTD_TURMA;
        System.out.printf("Media Geral = %.2f\n", mediaGeral);

        entrada.close();

    }
}
