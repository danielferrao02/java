package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor da tabuada:");
        int valor, cont;
        valor = entrada.nextInt();

        System.out.printf("Valor digitado: %d\n\n", valor);
        cont = 0;
        while (cont <= 10) {
           
            System.out.printf("%d x %02d = %d\n", valor, cont, (cont * valor));//%02d - utiliza duas posições (com zero à esquerda) justificados à esquerda
            cont++;
        }

        entrada.close();
    }
}
