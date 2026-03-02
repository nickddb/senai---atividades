package Praticando;

import java.util.Scanner;

public class ativid08 {
    public static void main(String[] args) {
        double valor, polegada;
        System.out.println("Digite um valor (em polegada): ");

        Scanner in = new Scanner(System.in); 

        polegada = in.nextDouble();
        
        valor =  polegada * 25.4;

        System.out.println("O valor em milímetro é igual a " + valor);
    }
}
