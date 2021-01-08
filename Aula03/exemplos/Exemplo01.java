package exemplos;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        int cont; // byte = numero inteiro que vai do -128 ao 127.. o primeiro digito do octeto diz se é + ou - 
        int soma;

        soma = 0;
        cont = 0;

        while (cont < 10){
            System.out.println(cont);
            //cont++; //cont = cont + 1
            // cont-- conta diminuindo
            //cont = cont + 2; // pode ser abreviada em: cont += 2
            soma += cont; // soma = soma + cont
            cont++;
        }

        System.out.println("soma = "+ soma);
    }
}