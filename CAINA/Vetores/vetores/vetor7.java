package vetores;
import java.util.Scanner;


public class vetor7 {

    public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    
    double[][] matriz = new double[12][12];
    int x;
    double y = 0; String T;
    
    x = in.nextInt(); in.nextLine();
    T = in.nextLine();
    
    for(int i = 0; i < 12; i++){
    for(int j = 0; j<12; j++){
        matriz[i][j] = in.nextDouble();
    }
}

    switch (T) {

    case "S":
        for(int i=0;i<12;i++){
            y += matriz[x][i];
        }
        System.out.println(y);
        break;
        
    case "M":
        for(int i=0;i<12;i++){
            y += matriz[x][i];
        }
        System.out.printf("%.1f%n", y/12);
        break;
        }
    }
}


