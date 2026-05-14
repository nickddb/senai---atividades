//Faça um programa que leia um valor T e preencha um vetor N[1000] 
// com a sequência de valores de 0 até T-1 repetidas vezes, 
// conforme exemplo abaixo. Imprima o vetor N.

package vetores;
import java.util.Scanner;

public class vetor4 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);

    System.out.println("Delimite o tamanho do vetor: ");
    int valor = in.nextInt();
    int [] vetorzin = new int [valor];

    while (valor !=0){
        if(valor > 1){
            System.out.printf("Entre com os %d números: %n", valor);

            for(int i=0; i<valor; i++){
                vetorzin[i] = in.nextInt();
            }
        
            for(int i=0; i<valor; i++){
                System.out.printf("N[%d]: %d%n", i, vetorzin[i]);
            }
            break;
        }
        else if(valor == 1){
            System.out.printf("Entre com o número: ", valor);

            for(int i=0; i<valor; i++){
                vetorzin[i] = in.nextInt();
            }
        
            for(int i=0; i<valor; i++){
                System.out.printf("N[%d]: %d%n", i,  vetorzin[i]);
            }
            break;
        }
        else
            break;
        }
    }
}
