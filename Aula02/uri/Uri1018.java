package uri;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        //Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. 
        //As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. 
        //A seguir mostre o valor lido e a relação de notas necessárias.
        //Entrada: O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
        //Saida: imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias
        Scanner teclado = new Scanner(System.in);
        int valor;
        valor = teclado.nextInt();

        System.out.printf("%d\n", valor);
        System.out.printf("%d nota(s) de R$ 100,00\n", (valor/100));
        System.out.printf("%d nota(s) de R$ 50,00\n", (valor%100)/50);
        System.out.printf("%d nota(s) de R$ 20,00\n", ((valor%100)%50)/20);
        System.out.printf("%d nota(s) de R$ 10,00\n", (((valor%100)%50)%20)/10);
        System.out.printf("%d nota(s) de R$ 5,00\n", (((valor%100)%50)%20)%10/5);
        System.out.printf("%d nota(s) de R$ 2,00\n", ((((valor%100)%50)%20)%10)%5/2);
        System.out.printf("%d nota(s) de R$ 1,00\n", ((((valor%100)%50)%20)%10)%5%2);


        teclado.close();
    }
}
