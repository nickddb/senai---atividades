package vetores;
import java.util.Scanner;


public class vetor9 {

    public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    
    double[][] matriz = new double[12][12];		
    double x=0, y=0;String O;
    O = in.nextLine();
    
    for(int i = 0; i < 12; i++){
        for(int j = 0; j<12; j++){
            matriz[i][j] = in.nextDouble();
        }
    }

    switch (O) {
        case "S":
            for(int i=0;i<12;i++){
                for(int j=i+1; j<12; j++){	
                    y += matriz[i][j];
                }
            }
            
            System.out.println(String.format("%.1f", y));
            break;
            
        case "M":
            for(int i=0; i<12; i++){
                for(int j=i+1; j<12; j++){
                    y += matriz[i][j]; x++;
                }
            }
            
            System.out.println(String.format("%.1f", (y/x)));
            break;
    }
    }
}


