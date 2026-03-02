package Praticando;

import java.util.Scanner;

public class ativid13 {
    public static void main(String[] args) {
        double raio, area;
        System.out.println("Digite o valor do raio de um círculo: ");

        Scanner in = new Scanner(System.in); 

        raio = in.nextDouble();
        
        area = 3.14 * (raio * raio);
        System.out.println("A área do círculo é igual a " + area);
    }
}
