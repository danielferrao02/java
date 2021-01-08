package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        //Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, 
        //o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
        //Após, calcule e mostre o valor a ser pago.
        //Entrada: O arquivo de entrada contém duas linhas de dados. 
        //Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais
        //Saida: VALOR A PAGAR = R$ 
        Scanner teclado = new Scanner(System.in);
        int n1, n2;
        double v1, v2, vPago;
        
        teclado.nextInt();
        n1 = teclado.nextInt();
        v1 = teclado.nextDouble();
        teclado.nextInt();
        n2 = teclado.nextInt();
        v2 = teclado.nextDouble();

        vPago = n1 * v1 + n2 * v2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", vPago);


        teclado.close();


    }
}
