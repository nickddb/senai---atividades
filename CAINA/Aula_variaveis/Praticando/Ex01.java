package Praticando;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int num;
        System.out.println("Digite um número inteiro para saber o seu dobro: ");
        //Scanner = ativa leitura do teclado (entrada de dados)
        Scanner in = new Scanner(System.in); 
        //Iniciando o Scanner (não significa que já leu o teclado)
        num = in.nextInt();
        
        System.out.println("O dobro de " + num + " é " + (num*2));
    }
}
