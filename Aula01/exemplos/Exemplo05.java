package exemplos;

public class Exemplo05 {
    public static void main(String[] args) {
        double valor = 12.98765;
        int quantidade = 8;
        System.out.println(valor);
        //System.out.printf(FORMATO, Valor1, Valor2,...)
        // %f - numero com decimal, arredondando
        // %d - numero inteiro
        // %s - string
        // %.xf - x = numero de casas decimais
        System.out.printf("O valor a pagar é R$ %.2f, obrigado\n", valor);
        System.out.printf("O valor das %d é R$ %.2f. Obrigado ", quantidade, valor); //variavel int sempre antes das demais

    }
}
