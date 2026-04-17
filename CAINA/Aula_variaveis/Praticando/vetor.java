package Praticando;

import java.util.Scanner;

public class vetor {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in); 
        int [] num  = new int[10];
        int [] outronum = new int[10];
        for(int i=0; i<10; i++){
            System.out.println("Digite o " + (i+1) + "º número: ");
            num[i] = in.nextInt();
        }

        System.out.print("Vetor 1 = " + " ");
        for(int j=0; j<=10; j++){
                System.out.print(num[j] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor 2 = " + " ");
        for(int j=0; j<=10; j--){
                System.out.print("Vetor 2 = " + num[j]);
        }
    }
}
