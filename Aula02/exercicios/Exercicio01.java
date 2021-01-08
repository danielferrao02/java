package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        valor = teclado.nextInt();

        if (valor > 20){
            System.out.printf("O valor é %.2f\n", (double) valor/2); // casting - conversão de int p/ double na variavel valor para o calculo

        teclado.close();
        }

    }
}
