package uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        //Entrada:A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.
        //Saída: Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho, conforme exemplo abaixo.
        Scanner teclado = new Scanner(System.in);
        double salario, salarioA;
        salario = teclado.nextDouble();

        if(salario >= 0 && salario<=400.00){
            System.out.printf("Novo salario: %.2f\n", (salarioA = salario*1.15));
            System.out.printf("Reajuste ganho:%.2f\n", (salarioA - salario));
            System.out.println("Em percentual: 15 %");
        }else{
            if(salario>400.00 && salario<=800.00){
                System.out.printf("Novo salario: %.2f\n", (salarioA = salario*1.12));
                System.out.printf("Reajuste ganho:%.2f\n", (salarioA - salario));
                System.out.println("Em percentual: 12 %"); 
            }else{
                if(salario>800.00 && salario<=1200.00){
                    System.out.printf("Novo salario: %.2f\n", (salarioA = salario*1.10));
                    System.out.printf("Reajuste ganho:%.2f\n", (salarioA - salario));
                    System.out.println("Em percentual: 10 %");
                }else{
                    if(salario>1200.00 && salario<=2000.00){
                        System.out.printf("Novo salario: %.2f\n", (salarioA = salario*1.07));
                        System.out.printf("Reajuste ganho:%.2f\n", (salarioA - salario));
                        System.out.println("Em percentual: 7 %");
                    }else{
                        System.out.printf("Novo salario: %.2f\n", (salarioA = salario*1.04));
                        System.out.printf("Reajuste ganho:%.2f\n", (salarioA - salario));
                        System.out.println("Em percentual: 4 %");
                    }
                }
            }
        }
        teclado.close();
    }
}
