package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, nota2, MEDIA;
        
        n1 = teclado.nextDouble();
        nota2 = teclado.nextDouble();

        MEDIA = n1*0.4 + nota2*0.6;

        if (MEDIA >= 6.0){
            System.out.println("Aprovado");
            System.out.printf("%.2f", MEDIA);
        } else {
            System.out.println("Reprovado");
            System.out.printf("%.2f", MEDIA);
        }

        teclado.close();
    }
}
