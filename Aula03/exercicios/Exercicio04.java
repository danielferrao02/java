package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero, cont, soma;
        
        cont=1;
        numero = 1;
        soma = 0;

        while(numero!=0){
                  
            System.out.printf("Digite o "+ cont +"º numero: ");
            numero = entrada.nextInt();
            soma = soma + numero;

        cont++;
        } 
        System.out.printf("A soma dos valores é: %d", soma);
        
        entrada.close();
    }
}
