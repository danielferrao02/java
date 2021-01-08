package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senha;
        boolean aceita;


        System.out.println("Informe a senha: ");
        senha = entrada.nextLine();

        aceita = senha.equals("R10p5");

        if(aceita ==true){ // ou if(aceita){ - pois o aceita é uma variavel boolean que se transforma em true ou false}
            System.out.println("Acesso concedido");
        }else{
            System.out.println("Acesso negado");
        }

        entrada.close();
    }
}
