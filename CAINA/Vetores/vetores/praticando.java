package vetores;
import java.io.IOException;
import java.util.Scanner;

public class praticando {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    
    int [] vetor = new int [10];
    
    for(int i=0; i<=10; i++){
        int input = in.nextInt();
        vetor.add(input);
    }
    
    }
}