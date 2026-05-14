//Faça um programa que leia um vetor A[100]. No final, 
// mostre todas as posições do vetor que armazenam um valor 
// menor ou igual a 10 e o valor armazenado em cada uma das posições.

package vetores;
import java.util.Scanner;

public class vetor3 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);

        double[] vetor = new double [10];

        for(int i=0; i<vetor.length; i++){
            vetor[i] = in.nextDouble();
        }

        for(int i=0; i<vetor.length; i++){
            if(vetor[i] <= 10.0){
                System.out.printf("A[%d] = %.1f%n", i, vetor[i]);
            }
        }
    }
}
