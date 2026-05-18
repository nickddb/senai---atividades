package vetores;
import java.io.IOException;
import java.util.Scanner;


public class vetor10 {

    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    
    double[][] matriz = new double[12][12];
    double x=0, y=0;
    String O;
    int k = 11;
    
    O = in.nextLine();
    
    for (int i = 0; i < 12; i++) {
        for(int j = 0;j<12;j++){
            matriz[i][j] = in.nextDouble();
        }
    }
    
    switch (O) {
        case "S":
            for(int i=0;i<5;i++){
                for(int j=i+1;j<k;j++){
                    y += matriz[i][j];
                }k--;
            }
            
            System.out.println(String.format("%.1f", y));
            break;
            
        case "M":
            for(int i=0;i<5;i++){
                for(int j=i+1;j<k;j++){
                    y += matriz[i][j];x++;
                }k--;
            }
            
            System.out.println(String.format("%.1f", (y/x)));
            break;
        }
    }
}


