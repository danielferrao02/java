package uri;

import java.util.Scanner;

public class Uri1035 {
public static void main(String[] args) {
    //Leia 4 valores inteiros A, B, C e D. 
    //A seguir, se B for maior do que C e se D for maior do que A, 
    //e a soma de C com D for maior que a soma de A e B e 
    //se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", 
    //senão escrever "Valores nao aceitos".

    Scanner teclado = new Scanner(System.in);
    int varA, varB, varC, varD;
    
    varA = teclado.nextInt();
    varB = teclado.nextInt();
    varC = teclado.nextInt();
    varD = teclado.nextInt();

    if((varB > varC) && (varD > varA) && (varC+varD) > (varA+varB) && (varC>0) && (varD>0) && (varA%2==0)){
        System.out.println("Valores aceitos");
    }else{
        System.out.println("Valores nao aceitos");

    teclado.close();
    }
}
    
}