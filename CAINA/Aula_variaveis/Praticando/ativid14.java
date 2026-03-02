package Praticando;

import java.util.Scanner;

public class ativid14 {
    public static void main(String[] args) {
        double base, altura, area;
        System.out.println("Digite o valor da base de um triângulo: ");

        Scanner in = new Scanner(System.in); 

        base = in.nextDouble();

        System.out.println("Digite o valor da altura desse triângulo: ");

        altura = in.nextDouble();
        
        area = (base * altura) / 2;

        System.out.println("A área do triângulo é igual a " + area);
    }
}
