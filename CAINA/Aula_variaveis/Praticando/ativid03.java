package Praticando;

import java.util.Scanner;

public class ativid03 {
    public static void main(String[] args) {
        double num;
        System.out.println("Digite um número inteiro para saber a sua quinta parte: ");

        Scanner in = new Scanner(System.in); 

        num = in.nextDouble();
        
        System.out.println("A quinta parte de " + num + " é " + (num/5));
    }
}
