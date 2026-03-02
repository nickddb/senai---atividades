package Praticando;

import java.util.Scanner;

public class ativid04 {
    public static void main(String[] args) {
        int num, num2, media;
        System.out.println("Digite um número: ");

        Scanner in = new Scanner(System.in); 

        num = in.nextInt();

        System.out.println("Digite um outro número: ");

        num2 = in.nextInt();
        
        media = (num + num2) / 2;
        System.out.println("A média entre " + num + " e " + num2 + " é igual a " + media);
    }
}
