package Praticando;

import java.util.Scanner;

public class ativid01 {
    public static void main(String[] args) {
        int num;
        System.out.println("Digite um número inteiro para saber o seu dobro: ");

        Scanner in = new Scanner(System.in); 

        num = in.nextInt();
        
        System.out.println("O dobro de " + num + " é " + (num*2));
    }
}
