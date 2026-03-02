package Praticando;

import java.util.Scanner;

public class ativid02 {
    public static void main(String[] args) {
        int num;
        System.out.println("Digite um número inteiro para saber o seu quadrado: ");

        Scanner in = new Scanner(System.in); 

        num = in.nextInt();
        
        System.out.println("O quadrado de " + num + " é " + (num*num));
    }
}
