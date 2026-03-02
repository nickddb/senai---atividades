package Praticando;

import java.util.Scanner;

public class ativid15 {
    public static void main(String[] args) {
        double raio, area, altura;
        System.out.println("Digite o valor do raio de um cilindro: ");

        Scanner in = new Scanner(System.in); 

        raio = in.nextDouble();

        System.out.println("Digite o valor da altura desse cilindro: ");

        altura = in.nextDouble();
        
        area = (3.14 * (raio * raio)) * altura;
        System.out.println("A área do cilindro é igual a " + area);
    }
}
