package vetores;
import java.io.IOException;
import java.util.Scanner;

public class praticando {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    
    int [] vetor = new int [10];
    
    for(int i=0; i<vetor.length; i++){
        int input = in.nextInt();
        vetor[i] = input;
    }
    
    }
}