//Leia um valor e faça um programa que coloque o valor lido na 
// primeira posição de um vetor N[10]. Em cada posição subsequente, 
// coloque o dobro do valor da posição anterior. Por exemplo, se o 
// valor lido for 1, os valores do vetor devem ser 1,2,4,8 e assim 
// sucessivamente. Mostre o vetor em seguida.

package vetores;
import java.util.Scanner;

public class vetor2 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);

    int valor = in.nextInt();
    int [] vetorzinho = new int [10];

    vetorzinho[0] = valor;
    for(int i=1; i<vetorzinho.length; i++){
            valor =+ valor*2;
            vetorzinho[i] = valor;
        }
    
    for(int i=0; i<vetorzinho.length; i++){
        System.out.printf("N[%d] = %d%n", i, vetorzinho[i]);
    }

    }
}
