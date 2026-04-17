import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int qnt, n;
        boolean primo = true;
        qnt = in.nextInt();

        for(int i=0; i<qnt; i++){
            n = in.nextInt();
            int aux = n - 1;

            while(aux > 1){
                if(n % aux == 0){
                    primo = false;
                    break;
                }
            }

            if(primo){
                
            }
            System.out.println();
        }
    }
}