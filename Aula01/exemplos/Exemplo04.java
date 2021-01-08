package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int idade;

        System.out.println("Qual a sua idade?"); // manda a pergunta de idade e o prompt fica no aguardo para inserir a idade
        idade = entrada.nextInt(); // lê do teclado um valor inteiro
        System.out.println("Você digitou " + idade);


        entrada.close(); // fecha a conexão com o teclado
    }
}
