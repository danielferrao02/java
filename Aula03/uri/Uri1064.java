package uri;

import java.util.Scanner;

/**
 * Uri1064
 */
public class Uri1064 {

    public static void main(String[] args) {
    //Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. 
    //Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.
    //Entrada: A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. 
    //Pelo menos um destes números será positivo.
    //Saída: O primeiro valor de saída é a quantidade de valores positivos. 
    //A próxima linha deve mostrar a média dos valores positivos digitados.
    Scanner entrada = new Scanner(System.in);
    double valor, soma;
    int cont, positivo;
    soma = 0;
    positivo = 0;
    for(cont = 1; cont<= 6; cont++){
        valor = entrada.nextDouble();
        
        if(valor>=0){
            positivo++;
            soma = soma + valor;
        } 
    } System.out.printf("%d valores positivos\n", positivo);
    System.out.printf("%.1f\n", soma/positivo);

    entrada.close();
}
}