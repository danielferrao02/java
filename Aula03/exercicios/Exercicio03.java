package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor, cont;

        System.out.println("Digite um número: ");
        valor = entrada.nextInt();
        cont = 1;

        System.out.print("1");

        while (cont <= valor / 2) {
            cont = cont * 2;
            System.out.printf(", %d", (cont));

        }

        entrada.close();
    }
}
