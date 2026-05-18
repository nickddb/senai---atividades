//Faça um programa que leia um vetor N[20]. Troque a seguir, o 
// primeiro elemento com o último, o segundo elemento com o 
// penúltimo, etc., até trocar o 10º com o 11º. Mostre o vetor modificado.


package vetores;
import java.util.Scanner;

public class vetor6{
    public static void main(String[] args) throws Exception{
    Scanner in = new Scanner(System.in);

    System.out.println("Delimite o tamanho do vetor: ");
    int tamanho = in.nextInt();

    int [] array = new int [tamanho];

    for(int i= 0; i<tamanho; i++){
            array[i] = in.nextInt();
        }

    int menor = array[0];
    int posicao = 0;

    for(int i= 0; i<tamanho; i++){
        System.out.println(array[i] + "/n");
        if(menor > array[i]){
            posicao = i;
            menor = array[i];
        }
        }
    System.out.println("Posição: " + posicao);
    System.out.println("Menor: " + menor);
    }
}
