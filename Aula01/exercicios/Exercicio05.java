package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Custo de fábrica do carro (R$): ");
        //faça um programa que receba o custo do carro na fabrica
        double custo = entrada.nextDouble();
        double CustoConsumidor = custo * 1.28;
        System.out.printf("O custo final do consumidor é R$ %.2f\n", CustoConsumidor);
        double Imposto = custo * 0.45;
        System.out.printf("O imposto a ser pago é R$ %.2f\n", Imposto);

        entrada.close();
    }
}
