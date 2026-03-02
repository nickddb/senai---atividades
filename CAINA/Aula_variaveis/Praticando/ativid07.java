package Praticando;

import java.util.Scanner;

public class ativid07 {
    public static void main(String[] args) {
        double valor, polegada;
        System.out.println("Digite um valor (em milímetro): ");

        Scanner in = new Scanner(System.in); 

        valor = in.nextDouble();
        
        polegada =  valor / 25.4;

        System.out.println("O valor em polegadas é igual a " + polegada);
    }
}
