//Faça um programa que leia um vetor X[10]. Substitua a seguir, 
// todos os valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.

package vetores;
import java.util.Scanner;

public class vetor1 {
    public static void main(String[] args) throws Exception{
    Scanner in = new Scanner(System.in);
    int [] vetor = new int[10];
        
    for(int i=0; i<vetor.length; i++){
        vetor[i] = in.nextInt();
        if (vetor[i] <= 0) {
            vetor[i] = 1;
            }
        }
    for(int i=0; i<vetor.length; i++){
            System.out.printf("X[%d] = %d%n", i, vetor[i]);
        }
    
    in.close();
    }
}
