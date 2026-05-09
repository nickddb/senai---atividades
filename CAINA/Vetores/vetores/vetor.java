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

        System.out.println("Matriz completa: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        //o length é natural da linha, do eixo X. Ao adicionar [0], especifica que trata-se da coluna!


        //Acessar diagonal principal:
        System.out.println("Diagonal principal: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<matriz[0].length; j++){
                if(i==j)
                    System.out.print(matriz[i][j] + " ");
                else
                    System.out.println(" ");
            }
        }

        // OU

        System.out.println(" ");
        for(int i=0; i<n; i++){
            System.out.println(matriz[i][i] + " ");
        }

        //Acessar diagonal secundária:
        for(int i=0; i<n; i++){
            System.out.print(matriz[i][n - 1 - i] + " ");
        }

        // OU

        System.out.println(" ");
        int count = matriz[0].length-1;
        for(int i=0; i<n; i++){
            System.out.println(matriz[i][count] + " ");
            count--;
        }

    }
}
