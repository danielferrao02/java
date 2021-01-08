package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c;
        System.out.println("Informe as medidas dos 3 lados do triangulo");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        if((a>(b+c))||(b>(a+c))||(c>(a+b)) ){
            System.out.println("Não formam triângulo");
        }else{
            if (a == b && b == c){
                System.out.println("Triângulo equilatero");
            }else{
                if(a==b || b==c || a==c){
                    System.out.println("Triangulo Isosceles");
                }else{
                    System.out.println("Triangulo escaleno");
                }
            }
        } 
        entrada.close();
    }

}

