package vetores;
import java.util.Scanner;

public class vetor{
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);

        int matriz[][] = {
            {4,2,1},
            {1,1,1},
            {2,3,3}};

        // Ou declarar sem inicializar:
        // int [][] matriz = new int [3][3];

        //acessar posições:
        System.out.println("Matriz na posição li c2: " + matriz[1][2]);

        int n = matriz.length;

        for(int i=0; i<n; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // OU

        for(int i=0; i<n; i++){
            System.out.print(matriz[i][n - 1 - i] + " ");
        }

    }
}
