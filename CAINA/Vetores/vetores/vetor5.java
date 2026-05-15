//Faça um programa que leia um valor N. Este N será o tamanho 
// de um vetor X[N]. A seguir, leia cada um dos valores de X, 
// encontre o menor elemento deste vetor e a sua posição dentro do 
// vetor, mostrando esta informação.


package vetores;
import java.util.Scanner;

public class vetor5{
    public static void main(String[] args) throws Exception{
    Scanner in = new Scanner(System.in);

    System.out.println("Delimite o tamanho do vetor: ");
    int valor = in.nextInt();

        if(valor > 0){
            int [] vetorzin = new int [valor];
            String palavra = (valor == 1) ? "número" : "números";
            System.out.printf("Entre com o(s) %d %s:%n", valor, palavra);

            for(int i=0; i<valor; i++){
                vetorzin[i] = in.nextInt();
                
                if(vetorzin[i] < vetorzin[i])
                    int menor = vetorzin[i];
            }
        
            for(int i=0; i<valor; i++){
                System.out.printf("N[%d]: %d%n", i, vetorzin[i]);
            }
        }
    }
}
