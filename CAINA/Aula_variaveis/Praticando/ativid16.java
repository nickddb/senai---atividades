package Praticando;

import java.util.Scanner;

public class ativid16 {
    public static void main(String[] args) {
        double raio, areabase, altura, arealateral, g, area;
        System.out.println("Digite o valor do raio de um cone: ");

        Scanner in = new Scanner(System.in); 

        raio = in.nextDouble();

        System.out.println("Digite o valor da altura desse cone: ");

        altura = in.nextDouble();
        
        areabase = 3.14 * (raio * raio);
        g = (altura * altura) + (raio * raio);
        g = g * g;
        arealateral = 3.14 * raio * g;
        area = areabase + arealateral;
        System.out.println("A área do cone é igual a " + area);
    }
}