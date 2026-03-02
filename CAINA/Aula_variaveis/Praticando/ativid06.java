package Praticando;

import java.util.Scanner;

public class ativid06 {
    public static void main(String[] args) {
        double velocidade1, velocidade2;
        System.out.println("Digite uma velocidade (em m/s): ");

        Scanner in = new Scanner(System.in); 

        velocidade1 = in.nextDouble();
        
        velocidade2 = velocidade1 * 3.6;

        System.out.println("A velocidade em km/h é igual a " + velocidade2);
    }
}
